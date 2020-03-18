package org.palladiosimulator.dataflow.ui.table;
/*
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.palladiosimulator.editors.sirius.repository.custom.properties.editorsections.EditorSection;
import org.palladiosimulator.pcm.repository.provider.RepositoryItemProviderAdapterFactory;
import org.palladiosimulator.pcm.seff.provider.SeffItemProviderAdapterFactory;
public abstract class TableLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	private EEFCustomWidgetDescription description;

	protected ComposedAdapterFactory adapterFactory;
	protected EditorSection editorSection;

	protected TableController controller;

	public TableLifecycleManager(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.description = description;
	}

	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {

		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory
				.addAdapterFactory(new RepositoryItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new SeffItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		

		controller = new TableController(description, variableManager, interpreter, editingContextAdapter);
		setPropertySection(parent);

	}

	protected abstract void setPropertySection(Composite parent);
	

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
	}

	@Override
	public void refresh() {
		super.refresh();
		this.controller.refresh();
	}

	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
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
	protected Control getValidationControl() {
		return this.editorSection.getViewer().getControl();
	}

	@Override
	public void dispose() {
		super.dispose();
		this.adapterFactory.dispose();
	}
	
	protected void setEnabled(boolean isEnabled) {
		this.editorSection.setEnabled(isEnabled);
	}
	
}

package org.palladiosimulator.dataflow.ui.table;

import java.util.function.Consumer;


import java.util.HashMap;
import java.util.Map;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

public class TableController extends AbstractEEFCustomWidgetController {

    private static final String VALUE_EXPRESSION_ID = "valueExpression"; //$NON-NLS-1$

    private static final String ON_CLICK_EXPRESSION_ID = "onClickExpression"; //$NON-NLS-1$

    private static final String SELECTION_VARIABLE_NAME = "selection"; //$NON-NLS-1$

    private Consumer<Object> newValueConsumer;
    
    public TableController(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter,
            EditingContextAdapter contextAdapter) {
        super(description, variableManager, interpreter, contextAdapter);
    }

    @Override
    protected EEFCustomWidgetDescription getDescription() {
        return this.description;
    }

    @Override
    public void refresh() {
        super.refresh();
        this.newEval().call(this.getCustomExpression(VALUE_EXPRESSION_ID).get(), this.newValueConsumer);
        System.out.println(this.getCustomExpression(VALUE_EXPRESSION_ID).get());
    }

    public void handleClick(Object object) {
        this.editingContextAdapter.performModelChange(() -> {
            String onClickExpression = this.getCustomExpression(ON_CLICK_EXPRESSION_ID).get();
            System.out.println(onClickExpression);

            Map<String, Object> variables = new HashMap<String, Object>();
            variables.putAll(this.variableManager.getVariables());
            variables.put(SELECTION_VARIABLE_NAME, object);

            EvalFactory.of(this.interpreter, variables).call(onClickExpression);
        });
    }

    public void onNewValue(Consumer<Object> consumer) {
        this.newValueConsumer = consumer;
    }

    public void removeValueConsumer() {
        this.newValueConsumer = null;
    }
}



 */
