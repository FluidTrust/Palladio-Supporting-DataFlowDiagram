/*******************************************************************************
 * Copyright (c) 2012, 2015 Original authors and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Original authors and others - initial API and implementation
 *     Dirk Fauth <dirk.fauth@googlemail.com> - Added image scaling
 *     Obeo - renamed and keep only color related stuff
 ******************************************************************************/
package com.widget.colorpicker;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

/**
 * A color helper.
 * 
 * @author mbats
 * @see org.eclipse.nebula.widgets.nattable.core#GUIHelper
 */
public final class ColorHelper {
    /**
     * Key prefix.
     */
    private static final String KEY_PREFIX = ColorHelper.class.getCanonicalName() + "."; //$NON-NLS-1$

    /**
     * Private constructor.
     */
    private ColorHelper() {
        // Nothing
    }

    /**
     * Get color.
     * 
     * @param rgb
     *            RGB
     * @return The color
     */
    public static Color getColor(RGB rgb) {
        return getColor(rgb.red, rgb.green, rgb.blue);
    }

    /**
     * Get color.
     * 
     * @param red
     *            Red
     * @param green
     *            Green
     * @param blue
     *            Blue
     * @return The color
     */
    public static Color getColor(int red, int green, int blue) {
        String key = getColorKey(red, green, blue);
        if (JFaceResources.getColorRegistry().hasValueFor(key)) {
            return JFaceResources.getColorRegistry().get(key);
        } else {
            JFaceResources.getColorRegistry().put(key, new RGB(red, green, blue));
            return getColor(key);
        }
    }

    /**
     * Get color.
     * 
     * @param key
     *            Key
     * @return The color.
     */
    private static Color getColor(String key) {
        return JFaceResources.getColorRegistry().get(key);
    }

    /**
     * Get the color key.
     * 
     * @param red
     *            Red
     * @param green
     *            Green
     * @param blue
     *            Blue
     * @return The color key
     */
    private static String getColorKey(int red, int green, int blue) {
        return KEY_PREFIX + "_COLOR_" + red + "_" + green + "_" + blue; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }
}