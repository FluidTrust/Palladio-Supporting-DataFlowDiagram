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

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The color picker provider.
 *
 * @author mbats
 */
public class ColorPickerProvider implements IEEFLifecycleManagerProvider {
	/**
	 * The identifier of the control description supported.
	 */
	private static final String SUPPORTED_ID = "org.eclipse.eef.sample.custom.widget.colorpicker"; //$NON-NLS-1$

	@Override
	public boolean canHandle(EEFControlDescription controlDescription) {
		return SUPPORTED_ID.equals(controlDescription.getIdentifier()) && controlDescription instanceof EEFCustomWidgetDescription;
	}

	@Override
	public IEEFLifecycleManager getLifecycleManager(EEFControlDescription controlDescription, IVariableManager variableManager,
			IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		if (controlDescription instanceof EEFCustomWidgetDescription) {
			return new ColorPickerLifecycleManager((EEFCustomWidgetDescription) controlDescription, variableManager, interpreter, contextAdapter);
		}
		throw new IllegalArgumentException();
	}
}