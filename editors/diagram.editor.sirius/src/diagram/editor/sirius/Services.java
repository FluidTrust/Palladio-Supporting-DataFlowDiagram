package diagram.editor.sirius;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramFactory;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

/**
 * The services class used by VSM.
 */
public class Services {

	private boolean isEqual(EObject e1, EObject e2) {
		return EcoreUtil.equals(e1, e2);

	}
	
	public void refineProcesses(EObject self) {
		System.out.println("refine multiple");
	}
	
	public void look(EObject self) {
		System.out.println(self);
		System.out.println(self.eContents());
	}
	
	public void refineDF(EObject self, DataFlow df) {
		System.out.println(df);
		Session session = SessionManager.INSTANCE.getSession(df);
		DFDUtil.refineDT(session, df);
	}
	
	public List<EObject> listDataTypes(EObject self) {
		Session session = SessionManager.INSTANCE.getSession(self);
		return DFDUtil.getDataTypes(session);
	}

	public void refineProcess(EObject self, EObject p, DataFlowDiagram dfd) {
		List<Edge> edges = dfd.getEdges();
		List<DataFlow> incoming = new ArrayList<DataFlow>();
		List<DataFlow> outgoing = new ArrayList<DataFlow>();
		for (Edge e : edges) {
			if (e instanceof DataFlow) {
				DataFlow df = (DataFlow) e;

				if (isEqual(p, df.getTarget())) {
					incoming.add(df);
				}
				if (isEqual(p, df.getSource())) {
					outgoing.add(df);
				}

			}
		}
		createLeveledDFD(incoming, outgoing, (Process) p,dfd);
	}

	public void createLeveledDFD(List<DataFlow> inc, List<DataFlow> out, Process p, DataFlowDiagram dfd) {
		Session session = SessionManager.INSTANCE.getSession(p);
		
		/*
		DataFlowDiagram newDFD = DataFlowDiagramFactory.eINSTANCE.createDataFlowDiagram();
		Viewpoint viewpoint = null;
		Set<Viewpoint> registry = ViewpointRegistry.getInstance().getViewpoints();
		for (Viewpoint vp: registry) {
			if(vp.getName().equals("Dataflows")) {
				viewpoint = vp;
			}
		}
		Session session = SessionManager.INSTANCE.getSession(p);
		RepresentationDescription description = null;
		for (RepresentationDescription rd : viewpoint.getOwnedRepresentations()) {
			if(rd.getName().equals("DFD Editor")) {
				description = rd;
			}	
		}
		System.out.println(session);
		System.out.println(description);
		System.out.println(newDFD);
		DRepresentation representation = DialectManager.INSTANCE.createRepresentation("", newDFD, description, session, new NullProgressMonitor());
		System.out.println(representation);
		*/
		/*
		DataFlowDiagramRefinement dfdRefinement = DataFlowDiagramFactory.eINSTANCE.createDataFlowDiagramRefinement();
		dfdRefinement.setRefinedProcess(p);
		DataFlowDiagramFactory.eINSTANCE.createDataFlowDiagram();
		dfd.getRefinedBy().add(dfdRefinement);
		System.out.println("Create leveled dfd.");
		Viewpoint viewpoint = null;
		Set<Viewpoint> registry = ViewpointRegistry.getInstance().getViewpoints();
		for (Viewpoint vp: registry) {
			if(vp.getName().equals("Dataflows")) {
				viewpoint = vp;
			}
		}
		Session session = SessionManager.INSTANCE.getSession(p);
		System.out.println("Viewpoint: " + viewpoint);
		RepresentationDescription description = null;
		for (RepresentationDescription rd : viewpoint.getOwnedRepresentations()) {
			if(rd.getName().equals("DFD Editor")) {
				description = rd;
			}
			
		}
		
		TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		System.out.println(domain);
		//DRepresentation representation = DialectManager.INSTANCE.createRepresentation(arg0, arg1, description, session, new NullProgressMonitor())
		//new dfd
		CreateRepresentationCommand crc = new CreateRepresentationCommand(session, description, dfd, "DFD Editor", new NullProgressMonitor()); // Error here ?
		System.out.println(crc);
		domain.getCommandStack().execute(crc);
	    DRepresentation representation = crc.getCreatedRepresentation();
	    System.out.println(representation);
		DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());

		IWorkbenchPart workbenchPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
		IFile file = (IFile) workbenchPart.getSite().getPage().getActiveEditor().getEditorInput().getAdapter(IFile.class);					
		URI diagramURI = URI.createURI("/" + file.getProject().getName() + "/" + file.getProjectRelativePath().toOSString());
		System.out.println(diagramURI);
		Session session = SessionManager.INSTANCE.getSession(p);
		System.out.println(session);

		*/
		


	}

	public EObject findSubProcesses(EObject self) {
		DataFlowDiagram dfd = (DataFlowDiagram) self;
		System.out.println(dfd.getRefinedBy());
		return self;
	}
	
	

	public void loadResources(EObject self) {
		ResourceDialog r = new ResourceDialog(Display.getCurrent().getActiveShell(), "Load Data Dictionary",
				SWT.SINGLE);
		r.open();
		r.setBlockOnOpen(true);
		Session session = SessionManager.INSTANCE.getSession(self);
		for (URI uri : r.getURIs()) {
			if (!DFDUtil.uriAlreadyLoaded(uri, session))
				session.addSemanticResource(uri, new NullProgressMonitor());

		}


	}
}
