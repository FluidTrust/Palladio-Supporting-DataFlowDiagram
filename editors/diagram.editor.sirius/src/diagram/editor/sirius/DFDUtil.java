package diagram.editor.sirius;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.common.ui.util.WorkbenchPartDescriptor;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.ui.part.ValidateAction;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.ui.IEditorPart;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry;

public class DFDUtil {

	/**
	 * 
	 * Palladio Simulator Classes
	 *
	 */

	private static final String DD_EXTENSTION = "datadictionary";

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

	public static List<Entry> refineDT(DataType type, Session session) {
		List<DataType> definedTypes = new ArrayList<DataType>();
		List<Entry> entries = new ArrayList<Entry>();
		List<Resource> resources = session.getSemanticResources().stream()
				.filter(r -> r.getURI().fileExtension().equals(DD_EXTENSTION)).collect(Collectors.toList());

		
		for (Resource r : resources) {
			for (EObject typeDefinition : r.getContents()) {
				for (EObject datatype : typeDefinition.eContents()) {
					definedTypes.add((DataType) datatype);
				}
			}

		}
		for (DataType dt : definedTypes) {
			if (EcoreUtil.equals(type, dt)) {
				entries.addAll(((CompositeDataType) dt).getComponents());
				break;
			}

		}
		return entries;
	}

	/**
	 * TODO you can get the current representation in two steps:
	 * 
	 * 1. retrieve current session from
	 * org.eclipse.sirius.business.api.session.SessionManager.INSTANCE.sessions 2.
	 * get list of representations from
	 * org.eclipse.sirius.business.api.dialect.DialectManager.INSTANCE.getAllRepresentations(session)
	 * 
	 * 
	 * Another solution, that should be more efficient, you can also retrieve the
	 * DDiagram by using the crossreference[1]: Collection<EObject> result = new
	 * EObjectQuery(mySemanticElement).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
	 * 
	 * This will give you the diagram element representing your semantic element.
	 * From this element, all you need to do is find the container that is a
	 * DRepresentation (here a DDiagram) and you will have the name of the diagram.
	 * 
	 * @param session
	 * @param diagram
	 */

	public static void validateDiagram(DataFlowDiagram dfd) {
		Session session = SessionManager.INSTANCE.getSession(dfd);
		DRepresentation diagram = getRepresentation(session, dfd);
		IEditorPart editorPart = DialectUIManager.INSTANCE.openEditor(session, diagram, new NullProgressMonitor());
		WorkbenchPartDescriptor workbenchPartDescriptor = new WorkbenchPartDescriptor(editorPart.getSite().getId(),
				editorPart.getClass(), editorPart.getSite().getPage());
		ValidateAction va = new ValidateAction(workbenchPartDescriptor);
		va.run();
	}

	private static DRepresentation getRepresentation(Session session, DataFlowDiagram dfd) { // TODO
		/*
		for (DRepresentation r : DialectManager.INSTANCE.getAllRepresentations(session)) {
			System.out.println(r);
			System.out.println(r.eContents());
			
		}
		*/
		return null;
		
	}
	
	public static List<EObject> getDataTypes(Session session) {
		List<EObject> types = new ArrayList<EObject>();
		List<Resource> resources = session.getSemanticResources().stream()
				.filter(r -> r.getURI().fileExtension().equals(DD_EXTENSTION)).collect(Collectors.toList());

		for (Resource r : resources) {
			for (EObject typeDefinition : r.getContents()) {
				//System.out.println(typeDefinition.eContents());
				for (EObject datatype : typeDefinition.eContents()) {
					types.add(datatype);

				}
			}

		}
		return types;
	}


}
