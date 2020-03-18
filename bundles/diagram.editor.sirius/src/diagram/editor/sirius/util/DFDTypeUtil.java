package diagram.editor.sirius.util;

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

public class DFDTypeUtil {

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
