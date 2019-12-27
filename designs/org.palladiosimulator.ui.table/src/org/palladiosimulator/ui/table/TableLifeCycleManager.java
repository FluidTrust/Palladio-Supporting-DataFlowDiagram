package org.palladiosimulator.ui.table;

import org.eclipse.eef.EEFCustomWidgetDescription;

import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;


public class TableLifeCycleManager extends AbstractEEFWidgetLifecycleManager {
	
    private TableController controller;
    private EEFCustomWidgetDescription description;

    public TableLifeCycleManager(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter,
            EditingContextAdapter contextAdapter) {
        super(variableManager, interpreter, contextAdapter);
        this.description = description;
    }
    
	@Override
	protected void createMainControl(Composite arg0, IEEFFormContainer arg1) {	
        this.controller = new TableController(description, variableManager, interpreter, editingContextAdapter);
	}

	@Override
	protected IEEFWidgetController getController() {
		return this.controller;
	}

	@Override
	protected EEFWidgetDescription getWidgetDescription() {
		return this.description;
	}

	@Override
	protected void setEnabled(boolean arg0) {		
	}

	@Override
	protected Control getValidationControl() {
		return null;
	}

	public void refresh() {
        super.refresh();
        this.controller.refresh();
	};
}
