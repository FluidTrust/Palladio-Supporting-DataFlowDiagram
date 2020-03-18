package org.palladiosimulator.dataflow.diagram.editor.sirius.util;

import java.util.List;

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

	public static boolean isEquivalentPrimitiveDT(PrimitiveDataType a, PrimitiveDataType b) {
		if (isEqual(a, b)) {
			return true;
		}
		return a.getName().equals(b.getName());
	}

	public static boolean isEquivalentCompositeDT(CompositeDataType a, CompositeDataType b) {
		if (isEqual(a, b)) {
			return true;
		}

		if (!a.getName().equals(b.getName()) || a.getComponents().size() != b.getComponents().size()) {
			return false;
		}
		// compare set of entries
		for (Entry e1 : a.getComponents()) {
			for (Entry e2 : b.getComponents()) {
				if (isEquivalent(e1, e2)) {
					break;
				}
			}
			return false;
		}

		for (Entry e1 : b.getComponents()) {
			for (Entry e2 : a.getComponents()) {
				if (isEquivalent(e1, e2)) {
					break;
				}
			}
			return false;
		}

		return true;
	}

	public static boolean isEquivalentCollectionDT(CollectionDataType a, CollectionDataType b) {
		if (isEqual(a, b)) {
			return true;
		}
		return a.getName().equals(b.getName()) && isEquivalent(a.getType(), b.getType());
	}

	public static boolean isEquivalent(DataType a, DataType b) {
		if (a instanceof PrimitiveDataType && b instanceof PrimitiveDataType) {
			return isEquivalentPrimitiveDT((PrimitiveDataType)a, (PrimitiveDataType)b);	
		}
		if (a instanceof CollectionDataType && b instanceof CollectionDataType) {
			return isEquivalentCollectionDT((CollectionDataType)a, (CollectionDataType)b);
		}
		
		if (a instanceof CompositeDataType && b instanceof CompositeDataType) {
			return isEquivalentCompositeDT((CompositeDataType)a, (CompositeDataType)b);
		}
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
	
		
		return a.getName().equals(b.getName()) && isEquivalent(a.getType(), b.getType());
	}

	public static boolean isEquivalent(DataFlow a, DataFlow b) {
		if (isEqual(a, b)) {
			return true;
		}
		if (!a.getName().equals(b.getName()) || a.getData().size() != b.getData().size()) {
			return false;
		}

		if (!isEqual(a.getTarget(), b.getTarget()) && !isEqual(a.getSource(), b.getSource())) { // must at least share
																								// one of source or
																								// target
			return false;
		}
		// compare set of entries
		for (Data d1 : a.getData()) {
			if(!findMatch(d1, b.getData())) {
				return false;
			}
		}
		for (Data d1 : b.getData()) {
			if(!findMatch(d1, a.getData())) {
				return false;
			}
		}
		return true;
	}
	
	
	private static boolean findMatch(Data d, List<Data> candidates) {
		for (Data c : candidates) {
			if (isEquivalent(d, c)) {
				return true;
			}
		}
		return false;
	}
}
