/*******************************************************************************
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package com.widget.colorpicker;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * This class will be used in order to manager the lifecycle of a color picker.
 *
 * @author mbats
 */
public class ColorPickerLifecycleManager extends AbstractEEFWidgetLifecycleManager {
	/**
	 * The description.
	 */
	private EEFCustomWidgetDescription description;

	/**
	 * The color picker.
	 */
	private ColorPicker colorPicker;

	/**
	 * The controller.
	 */
	private IColorPickerController controller;

	/**
	 * The mouse listener.
	 */
	private MouseAdapter mouseListener;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingContextAdapter
	 *            The editing context adapter
	 * @param singleReferenceViewerProvider
	 */
	public ColorPickerLifecycleManager(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
		this.description = description;
	}

	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		EEFWidgetFactory widgetFactory = formContainer.getWidgetFactory();

		// Create the color picker
		this.colorPicker = new ColorPicker(parent);
		widgetFactory.paintBordersFor(parent);

		this.controller = new ColorPickerController(this.description, this.variableManager, this.interpreter, this.editingContextAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getController()
	 */
	@Override
	protected IEEFWidgetController getController() {
		return this.controller;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getWidgetDescription()
	 */
	@Override
	protected EEFWidgetDescription getWidgetDescription() {
		return this.description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.mouseListener = new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				ColorDialog dialog = new ColorDialog(new Shell(Display.getDefault(), SWT.SHELL_TRIM));
				if (colorPicker.getSelectedColor() != null && colorPicker.getSelectedColor().getRGB() != null) {
					dialog.setRGB(colorPicker.getSelectedColor().getRGB());
				}
				RGB selected = dialog.open();
				if (selected != null) {
					controller.updateValue(selected);
				}
			}
		};
		this.colorPicker.addMouseListener(mouseListener);

		this.controller.onNewValue((value) -> {
			if (!colorPicker.isDisposed() && !(colorPicker.getBackground() != null && colorPicker.getBackground().equals(value))) {
				colorPicker.setImage(colorPicker.getColorImage(value));
				if (!colorPicker.isEnabled()) {
					colorPicker.setEnabled(true);
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.colorPicker;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#setEnabled(boolean)
	 */
	@Override
	protected void setEnabled(boolean isEnabled) {
		// do not support read only for now
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		if (!this.colorPicker.isDisposed()) {
			this.colorPicker.removeMouseListener(mouseListener);
		}
		this.controller.removeNewValueConsumer();
		super.aboutToBeHidden();
	}
}