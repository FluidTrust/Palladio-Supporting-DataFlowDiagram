package diagram.editor.sirius;

import org.eclipse.emf.ecore.EObject;


import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramFactory;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.ExternalActor;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Store;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.util.DataFlowDiagramSwitch;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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

	public void refineDF(EObject self, DataFlow df) {
		System.out.println(df);
		Session session = SessionManager.INSTANCE.getSession(df);
		DFDUtil.refineDT(session, df);
	}

	private List<Data> getData(DataFlow df) {
		Session session = SessionManager.INSTANCE.getSession(df);
		DFDUtil.refineDT(session, df);
		return new ArrayList<Data>();
	}

	public void refineProcess(EObject newDFD, EObject p, DataFlowDiagram oldDFD) {
		List<Edge> edges = oldDFD.getEdges();
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
		Session session = SessionManager.INSTANCE.getSession(oldDFD);
		DFDUtil.refineDT(session, null); // TODO
		createLeveledDFD(incoming, outgoing, (Process) p, oldDFD, (DataFlowDiagram) newDFD);
	}

	private Node copyNode(Node n) { // simulated polymorphism! Naming schemes?
		// EMF switches? DataFlowDiagramSwitch<Node> EcoreUtil.copy
		String name = n.getName();
		Node copy = null;
		if (n instanceof Process) {
			Process p = DataFlowDiagramFactory.eINSTANCE.createProcess();
			p.setName(name);
			copy = p;
			// TODO make unmodifiable
		} else if (n instanceof ExternalActor) {
			ExternalActor ea = DataFlowDiagramFactory.eINSTANCE.createExternalActor();
			ea.setName(name);
			copy = ea;
		} else if (n instanceof Store) {
			Store s = DataFlowDiagramFactory.eINSTANCE.createStore();
			s.setName(name);
			copy = s;
		}

		return copy;
	}

	private DataFlow copyDataFlow(DataFlow df) {
		DataFlow ndf = DataFlowDiagramFactory.eINSTANCE.createDataFlow();
		ndf.setName(df.getName());
		return ndf;
	}

	private Data copyData(Data data) {
		Data nData = DataFlowDiagramFactory.eINSTANCE.createData();
		nData.setName(data.getName());
		return nData;
	}

	public void createLeveledDFD(List<DataFlow> inc, List<DataFlow> out, Process p, DataFlowDiagram oldDFD,
			DataFlowDiagram newDFD) {
		final String name = p.getName();
		Map<DataFlow, List<Data>> incomingData = new HashMap<DataFlow, List<Data>>();
		Map<DataFlow, List<Data>> outgoingData = new HashMap<DataFlow, List<Data>>();
		Map<Node, Node> sources = new HashMap<Node, Node>();
		Map<Node, Node> targets = new HashMap<Node, Node>();

		int i = 0;
		int j = 0;

		for (DataFlow df : inc) {
			incomingData.put(df, df.getData());
			sources.putIfAbsent(df.getSource(), copyNode(df.getSource()));
			i += df.getData().size();
		}
		for (DataFlow df : out) {
			outgoingData.put(df, df.getData());
			targets.putIfAbsent(df.getTarget(), copyNode(df.getTarget()));
			j += df.getData().size();
		}

		int max = Math.max(i, j);

		List<Node> subProcesses = new ArrayList<Node>();

		for (int k = 1; k <= max; k++) {
			Node subProcess = copyNode(p);
			subProcess.setName(name + "." + k);
			subProcesses.add(subProcess);
		}
		newDFD.getNodes().addAll(subProcesses);
		newDFD.getNodes().addAll(sources.values());
		newDFD.getNodes().addAll(targets.values());
		int k = 0;
		for (DataFlow df : incomingData.keySet()) {
			Node source = sources.get(df.getSource());
			for (Data d : incomingData.get(df)) {
				DataFlow ndf = DataFlowDiagramFactory.eINSTANCE.createDataFlow();
				ndf.setName(d.getName()); // TODO type, composite, entries
				ndf.setTarget(subProcesses.get(k));
				ndf.setSource(source);
				newDFD.getEdges().add(ndf);
				k++;
			}
		}
		k = 0;
		for (DataFlow df : outgoingData.keySet()) {
			Node target = targets.get(df.getTarget());
			for (Data d : outgoingData.get(df)) {
				DataFlow ndf = DataFlowDiagramFactory.eINSTANCE.createDataFlow();
				ndf.setName(d.getName()); // TODO type, composite, entries
				ndf.setSource(subProcesses.get(k));
				ndf.setTarget(target);
				newDFD.getEdges().add(ndf);
				k++;
			}
		}

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
