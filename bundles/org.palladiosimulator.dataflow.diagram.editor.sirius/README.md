## It's not a bug, it's a feature

- Changes made to a DFD containing refined processes will not propagate to those refining DFDs, they will have to be resolved manually.
- Data flows from/to a refined process cannot be refined by double-clicking due to possible inconsistencies in the related edge refinement objects.
- Data flows cannot have an external actor as a target.
- "Gray" nodes cannot be connected.
- The current equivalence-check is very strict (i.e., every attribute has to be equal); it may be made less strict in the future. 

## It's a bug, not a feature

- The reference selection dialog requires the user to double click any reference.
- During development there were *occasional*, *non-terminating* exceptions logged, seemingly related to text input fields in the property view and the creation of refining diagrams. However they (apparently) cannot be reliably reproduced.

## A note on object orientation

- Due to the interface with AQL/Sirius nearly all functionality in Java is implemented statically in *util-classes since there would be no real advantage to instantiate said classes without parameters only to execute one method. Services.java serves as a delegator. Note: DFDRefinementUtil.java actually has a state. It contains an instance of the edge refinement selected in the respective dialog. This is somewhat of an antipattern but there seems no obvious alternative.
- Related to this situation is the fact that sometimes the actual location of any given method may seem (and indeed is) arbitrary. However, the general principle underlying it can be described as one of "least distance to use case" and may obviously be changed in the future.
- Also due to the hierarchy of inheritance used by EMF, Ecore and Sirius there is a need for the extensive use of (generally discouraged) operations such as **instanceof** and casts. Perhaps polymorphic switch classes that are part of the Sirius-API can be used to clean up code in some cases (such as antipatterns like *simulated polymorphism*)

## Future Work

- Other naming schemes for programmatic leveling
- modifications to validation algorithm, e.g. heuristics, specialized data structures etc.