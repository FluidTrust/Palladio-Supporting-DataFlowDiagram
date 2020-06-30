package org.palladiosimulator.dataflow.diagram.transformation;

import org.palladiosimulator.dataflow.diagram.transformation.impl.DFDFlattenTransformationImpl;

public interface DFDFlattenTransformationFactory {

    static DFDFlattenTransformation create() {
        return new DFDFlattenTransformationImpl();
    }
    
}
