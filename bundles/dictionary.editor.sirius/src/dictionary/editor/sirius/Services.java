package dictionary.editor.sirius;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType;



/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public List<DataType> getCollectionTypes(DataType self) {
    	List<DataType> list = new ArrayList<DataType>();
    	for (EObject eo : self.eContainer().eContents()) {
    		if (eo instanceof DataType) {
    	    	list.add((DataType) eo);
    		}
    	}
		return list;
	}
    
    

    
    
    
    
}
