/*******************************************************************************
 * Copyright (c) 2016, 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package com.widget.colorpicker;

import java.util.function.Consumer;

import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

/**
 * The IColorPickerController is responsible of supporting all the interactions with the widgets created for a color
 * picker.
 *
 * @author mbats
 */
public interface IColorPickerController extends IEEFWidgetController {
	/**
	 * Register a consumer which will be called with the new value of the text when it will change.
	 *
	 * @param consumer
	 *            The consumer of the new value of the text
	 */
	void onNewValue(Consumer<Color> consumer);

	/**
	 * Remove the consumer of the new value of the text.
	 */
	void removeNewValueConsumer();

	/**
	 * Update the value of the text.
	 *
	 * @param selected
	 *            The new value of the color
	 */
	void updateValue(RGB selected);

}