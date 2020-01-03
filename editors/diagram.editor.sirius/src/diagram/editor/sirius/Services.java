package diagram.editor.sirius;

import java.util.ArrayList;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;

/**
 * The services class used by VSM.
 */
public class Services {
    
    
    public EObject findSubProcesses(EObject self) {
    	DataFlowDiagram dfd = (DataFlowDiagram)self;
       System.out.println(dfd.getRefinedBy()); 
       return self;
     }
     
    
    public void loadResources(EObject self) {
    	System.out.println("LOAD RESOURCE CALLED");
    	ResourceDialog r = new ResourceDialog(Display.getCurrent().getActiveShell(), "Load DD", SWT.SINGLE);
    	r.open();
    
  
    	
    	
    	
    }
	/*
	public List<Process> findSubProcesses(DataFlowDiagramRefinement dfdr) {
		System.out.println(dfdr);
		return new ArrayList<Process>();
	}
    */
}


