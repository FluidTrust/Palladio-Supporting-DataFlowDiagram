package diagram.editor.sirius;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;

public class DFDUtil {
	
	/**
	 * 
	 *	Palladio Simulator Classes
	 *
	 */
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
