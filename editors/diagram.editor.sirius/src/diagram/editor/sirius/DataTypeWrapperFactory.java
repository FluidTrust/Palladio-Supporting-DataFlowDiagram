package diagram.editor.sirius;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CollectionDataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.PrimitiveDataType;

public final class DataTypeWrapperFactory {
	
	public static DataTypeWrapper makeWrapper(EObject dt) {
		
		if (dt instanceof CompositeDataType) {
			
		} else if (dt instanceof CollectionDataType) {
			
		} else if (dt instanceof PrimitiveDataType) {
			
		}
		
		return null;
		
	}

}
