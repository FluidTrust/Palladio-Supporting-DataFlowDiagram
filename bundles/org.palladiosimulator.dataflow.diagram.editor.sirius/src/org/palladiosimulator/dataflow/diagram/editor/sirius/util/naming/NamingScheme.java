package org.palladiosimulator.dataflow.diagram.editor.sirius.util.naming;

/**
 * 
 * Interface for suffix generation while refining dataflows; may be extended in the future
 *
 */

public interface NamingScheme {

	public String makeSuffix(String name);

}
