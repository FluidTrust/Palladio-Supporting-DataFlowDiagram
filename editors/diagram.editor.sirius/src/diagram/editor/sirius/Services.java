package diagram.editor.sirius;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;

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
		createLeveledDF(incoming, outgoing, (Process) p);
	}

	public void createLeveledDF(List<DataFlow> inc, List<DataFlow> out, Process p) {
		System.out.println("CREATE LEVEL");
		System.out.println(inc);
		System.out.println(out);
		System.out.println(p);
		Session session = SessionManager.INSTANCE.getSession(p);
		DRepresentation representation = SiriusCustomUtil.createRepresentation(session, "test", null, p,
				new NullProgressMonitor());
		DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());

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
