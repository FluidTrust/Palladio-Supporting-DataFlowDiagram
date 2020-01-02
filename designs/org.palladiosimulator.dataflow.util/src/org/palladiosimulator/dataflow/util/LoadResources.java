package org.palladiosimulator.dataflow.util;


import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;


/**
 * This External Java Action loads resources from URIs passed as parameters
 * @author Amine Kechaou
 *
 */
public class LoadResources implements IExternalJavaAction {


	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		EObject element = selections.iterator().next();
		Session session = SessionManager.INSTANCE.getSession(element);
		for (Object p : parameters.values()) {
			URI uri = URI.createURI(p.toString());
			if (!uriAlreadyLoaded(uri, session))
				session.addSemanticResource(uri, new NullProgressMonitor());
		}
		
	}


	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}
	
	public static boolean uriAlreadyLoaded(URI uri, Session session) {
		return getResourceByURI(uri, session) != null;
	}
	
	public static Resource getResourceByURI(URI uri, Session session) {
		Collection<Resource> resources = session.getSemanticResources();
		for (Resource r : resources) {
			if(r.getURI().equals(uri)) 
				return r;
		}
		return null;
	}

}