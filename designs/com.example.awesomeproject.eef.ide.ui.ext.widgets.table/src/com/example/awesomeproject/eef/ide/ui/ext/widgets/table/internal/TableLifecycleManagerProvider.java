package com.example.awesomeproject.eef.ide.ui.ext.widgets.table.internal;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

public class TableLifecycleManagerProvider implements IEEFLifecycleManagerProvider {
	/**
	 * The identifier of the control description supported.
	 */
	private static final String SUPPORTED_ID = "com.example.awesomeproject.sirius.properties.ext.widgets.table"; //$NON-NLS-1$

	@Override
	public boolean canHandle(EEFControlDescription controlDescription) {
		// only support custom widgets with the proper identifier
		return SUPPORTED_ID.equals(controlDescription.getIdentifier()) && controlDescription instanceof EEFCustomWidgetDescription;
	}

	@Override
	public IEEFLifecycleManager getLifecycleManager(EEFControlDescription controlDescription, IVariableManager variableManager,
			IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		if (controlDescription instanceof EEFCustomWidgetDescription) {
			return new TableLifecycleManager((EEFCustomWidgetDescription) controlDescription, variableManager, interpreter, contextAdapter);
		}
		throw new IllegalArgumentException();
	}
}