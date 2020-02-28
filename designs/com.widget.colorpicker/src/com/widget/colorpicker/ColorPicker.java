/*******************************************************************************
 * Copyright (c) 2012 Original authors and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Original authors and others - initial API and implementation
 ******************************************************************************/
package com.widget.colorpicker;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

/**
 * A button that displays a solid block of color and allows the user to pick a
 * color. The user can double click on the button in order to change the
 * selected color which also changes the background color of the button.
 *
 */
public class ColorPicker extends CLabel {
    /**
     * The width.
     */
    private static final int WIDTH = 70;

    /**
     * The height.
     */
    private static final int HEIGHT = 20;

    /**
     * The selected color.
     */
    private Color selectedColor;

    /**
     * The image.
     */
    private Image image;

    /**
     * The constructor.
     * 
     * @param parent
     *            The parent
     */
    public ColorPicker(Composite parent) {
        super(parent, SWT.SHADOW_OUT);
    }

    /**
     * Get the color image.
     * 
     * @param color
     *            The color
     * @return The color imae
     */
    public Image getColorImage(Color color) {
        Display display = Display.getCurrent();

        image = new Image(display, new Rectangle(10, 10, WIDTH, HEIGHT));
        GC gc = new GC(image);
        gc.setBackground(color);
        gc.fillRectangle(image.getBounds());
        gc.dispose();
        return image;
    }

    /**
     * The RGB color.
     * 
     * @param selected
     *            The selection.
     */
    private void update(RGB selected) {
        this.selectedColor = ColorHelper.getColor(selected);
        if (image != null) {
            image.dispose();
        }
        setImage(getColorImage(selectedColor));
    }

    /**
     * The selected color.
     * 
     * @return the Color most recently selected by the user.
     *         <em>Note that it is the responsibility of the client to
     *         dispose this resource</em>
     */
    public Color getSelectedColor() {
        return selectedColor;
    }

    /**
     * Set the current selected color that will be displayed by the picker.
     * <em>Note that this class is not responsible
     * for destroying the given Color object. It does not take ownership. Instead it will create its own internal
     * copy of the given Color resource.</em>
     *
     * @param backgroundColor
     *            the background color
     */
    public void setSelectedColor(Color backgroundColor) {
        if (backgroundColor == null) {
            throw new IllegalArgumentException("null"); //$NON-NLS-1$
        }
        update(backgroundColor.getRGB());
    }

    @Override
    public void dispose() {
        super.dispose();
        image.dispose();
    }
}