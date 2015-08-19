# Tahmuras II
Tahmuras II is a generic constraint programming (CP)-based framework for automatic construction of system-level design-space exploration (DSE) problems for embedded real-time systems.

At the moment, the constructed DSE problems are generated as [MiniZinc](http://www.minizinc.org/) models.
MiniZinc is a medium-level, solver-independent CP language designed for specification of constraint satisfaction and optimization problems.

Tahmuras II exploits the Clock Constraint Specification Language (CCSL) as a general method for representing the application semantics and platform services.
CCSL is part of the UML profile [MARTE](http://www.omgmarte.org/) and is used to express timing semantics of a model as constraints over logical clocks.

Tahmuras II uses model-driven engineering (MDE) methods, particularly the [Eclipse Modeling Framework (EMF)](https://eclipse.org/modeling/emf/) and associated technologies such as [Acceleo](http://www.eclipse.org/acceleo/), for capturing and transforming input models as well as code generation.

Further information is provided in [wiki pages](../../wiki).
