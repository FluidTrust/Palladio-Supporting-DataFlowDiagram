package diagram.editor.sirius;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType;

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

	public static void refineDT(Session session, DataFlow entry) {
		List<DataType> types = new ArrayList<DataType>();
		List<Resource> resources = session.getSemanticResources().stream()
				.filter(r -> r.getURI().fileExtension().equals(DD_EXTENSTION)).collect(Collectors.toList());

		for (Resource r : resources) {
			for (EObject typeDefinition : r.getContents()) {
				//System.out.println(typeDefinition.eContents());
				for (EObject datatype : typeDefinition.eContents()) {
					types.add((DataType) datatype);

				}
			}

		}
		System.out.println("TYPES");
		System.out.println(types); //TODO map ?
	}

}
