package org.palladiosimulator.dataflow.diagram.transformation.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.transformation.impl.DFDFlattenTransformationImpl;

import tools.mdsd.library.standalone.initialization.StandaloneInitializationException;
import tools.mdsd.library.standalone.initialization.StandaloneInitializerBuilder;
import tools.mdsd.library.standalone.initialization.log4j.Log4jInitilizationTask;

public class DFDFlattenTransformationImplTest {

    private DFDFlattenTransformationImpl subject;

    @BeforeAll
    public static void init() throws StandaloneInitializationException {
        StandaloneInitializerBuilder.builder()
            .registerProjectURI(DFDFlattenTransformationImplTest.class,
                    "org.palladiosimulator.dataflow.diagram.transformation.tests")
            .addCustomTask(new Log4jInitilizationTask())
            .build()
            .init();
    }

    @BeforeEach
    public void setup() {
        this.subject = new DFDFlattenTransformationImpl();
    }

    @Test
    public void testOneLevelRefinement() throws IOException {
        testDiagramFlattening("one_level");
    }

    protected void testDiagramFlattening(String folderName) throws IOException {
        var rs = new ResourceSetImpl();
        var folderURI = URI.createPlatformPluginURI(
                "org.palladiosimulator.dataflow.diagram.transformation.tests/models/" + folderName, false);

        var originalDfdUri = folderURI.appendSegment("original.dataflowdiagram");
        var originalDfdResource = rs.getResource(originalDfdUri, true);
        var originalDfd = (DataFlowDiagram) originalDfdResource.getContents()
            .get(0);

        var actualDfd = subject.transform(originalDfd);

        var flatDfdUri = folderURI.appendSegment("flat.dataflowdiagram");
        var flatDfdResource = rs.getResource(flatDfdUri, true);
        var flatDfd = (DataFlowDiagram) flatDfdResource.getContents()
            .get(0);

        var comparator = EMFCompare.builder()
            .build();
        var comparisonScope = new DefaultComparisonScope(actualDfd, flatDfd, null);
        var comparison = comparator.compare(comparisonScope);
        assertThat(getDifferenceMessage(comparison), comparison.getDifferences(), is(empty()));
    }

    private static String getDifferenceMessage(Comparison comparison) throws IOException {
        try (var baos = new ByteArrayOutputStream()) {
            try (var ps = new PrintStream(baos)) {
                EMFComparePrettyPrinter.printDifferences(comparison, ps);
                return "There are differences in the models:" + System.lineSeparator() + baos.toString();
            }
        }
    }

}
