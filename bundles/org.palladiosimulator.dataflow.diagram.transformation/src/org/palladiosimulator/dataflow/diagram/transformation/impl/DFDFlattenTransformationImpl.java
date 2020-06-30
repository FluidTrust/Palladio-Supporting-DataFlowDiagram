package org.palladiosimulator.dataflow.diagram.transformation.impl;

import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.EdgeRefinement;
import org.palladiosimulator.dataflow.diagram.transformation.DFDFlattenTransformation;

public class DFDFlattenTransformationImpl implements DFDFlattenTransformation {

    public DataFlowDiagram transform(DataFlowDiagram originalDfd) {
        var newDfd = EcoreUtil.copy(originalDfd);
        flattenDataFlowdiagram(newDfd);
        return newDfd;
    }

    @Override
    public void flattenDataFlowdiagram(DataFlowDiagram newDfd) {
        var refinements = newDfd.getRefinedBy();
        for (var refinementIter = refinements.iterator(); refinementIter.hasNext();) {
            var refinement = refinementIter.next();
            flattenDataFlowdiagram(refinement.getRefiningDiagram());
            apply(refinement);
            refinementIter.remove();
        }
    }

    protected void apply(DataFlowDiagramRefinement refinement) {
        addReplacementComponents(refinement);
        removeReplacedComponents(refinement);
    }

    protected void addReplacementComponents(DataFlowDiagramRefinement refinement) {
        var refinedDiagram = (DataFlowDiagram) refinement.getRefinedProcess()
            .eContainer();
        refinedDiagram.getNodes()
            .addAll(refinement.getRefiningDiagram()
                .getNodes());
        refinedDiagram.getEdges()
            .addAll(refinement.getRefiningDiagram()
                .getEdges());
    }

    protected void removeReplacedComponents(DataFlowDiagramRefinement refinement) {
        var oldNode = refinement.getRefinedProcess();
        var oldEdges = refinement.getRefinedEdges()
            .stream()
            .map(EdgeRefinement::getRefinedEdge)
            .collect(Collectors.toList());
        EcoreUtil.remove(oldNode);
        EcoreUtil.removeAll(oldEdges);
    }

}
