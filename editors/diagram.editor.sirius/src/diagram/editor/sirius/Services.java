package diagram.editor.sirius;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

/**
 * The services class used by VSM.
 */
public class Services {

	public void createDF(EObject e) {
		System.out.println(e.eContainer());
	}

	public void refineProcess(EObject p, DataFlowDiagram dfd) {
		System.out.println("Edges: " + dfd.getEdges());
		List<Edge> edges = dfd.getEdges();
		List<DataFlow> incoming = new ArrayList<DataFlow>();
		List<DataFlow> outgoing = new ArrayList<DataFlow>();
		for (Edge e : edges) {
			if (e instanceof DataFlow) {
				DataFlow df = (DataFlow) e;
				System.out.println(df.getTarget());
				System.out.println(df.getSource());
				if (df.getTarget().equals(p)) {
					incoming.add(df);
				}
				if (df.getSource().equals(p)) {
					outgoing.add(df);
				}

			}
		}
		
		System.out.println("IN: " + incoming);
		System.out.println("OUT: " + outgoing);
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
		System.out.println(session.getSemanticResources());
		for (URI uri : r.getURIs()) {
			if (!uriAlreadyLoaded(uri, session))
				session.addSemanticResource(uri, new NullProgressMonitor());

		}
		System.out.println(session.getSemanticResources());

	}

	public static boolean uriAlreadyLoaded(URI uri, Session session) {
		return getResourceByURI(uri, session) != null;
	}

	public static Resource getResourceByURI(URI uri, Session session) {
		Collection<Resource> resources = session.getSemanticResources();
		for (Resource r : resources) {
			if (r.getURI().equals(uri))
				return r;
		}
		return null;
	}
}
