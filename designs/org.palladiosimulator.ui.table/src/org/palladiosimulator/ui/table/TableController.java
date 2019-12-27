package org.palladiosimulator.ui.table;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

public class TableController extends AbstractEEFCustomWidgetController{

    public TableController(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter,
            EditingContextAdapter contextAdapter) {
        super(description, variableManager, interpreter, contextAdapter);
    }
}
