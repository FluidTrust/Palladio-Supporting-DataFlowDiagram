package diagram.editor.sirius;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CollectionDataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.PrimitiveDataType;

public class ComparisonUtil {

	public static boolean isEqual(EObject e1, EObject e2) {
		return EcoreUtil.equals(e1, e2);

	}

	public static boolean isEquivalent(PrimitiveDataType a, PrimitiveDataType b) {
		if (isEqual(a, b)) {
			return true;
		}
		return a.getName().equals(b.getName());
	}

	public static boolean isEquivalent(CompositeDataType a, CompositeDataType b) {
		if (isEqual(a, b)) {
			return true;
		}

		if (!a.getName().equals(b.getName())) {
			return false;
		}
		// TODO compare set of entries
		return true;
	}

	public static boolean isEquivalent(CollectionDataType a, CollectionDataType b) {
		if (isEqual(a, b)) {
			return true;
		}
		return a.getName().equals(b.getName()) && isEquivalent(a.getType(), b.getType());
	}

	public static boolean isEquivalent(DataType a, DataType b) { // use most specific binding -> only called when types
																	// different; cannot be equivalent
		return false;
	}

	public static boolean isEquivalent(Entry a, Entry b) {
		if (isEqual(a, b)) {
			return true;
		}
		return a.getName().equals(b.getName()) && isEquivalent(a.getType(), b.getType());
	}

	public static boolean isEquivalent(Data a, Data b) {
		if (isEqual(a, b)) {
			return true;
		}
		return true;
	}

	public static boolean isEquivalent(Edge a, Edge b) { // use most specific binding -> only called when types
															// different; cannot be equivalent
		return false;
	}

	public static boolean isEquivalent(DataFlow a, DataFlow b) {
		if (isEqual(a, b)) {
			return true;
		}
		if (a.getName().equals(b.getName())) {
			return false;
		}

		return true;
	}
}
