

# Bacteria Simulation 
#### Relevant links:

 - Bacteria https://en.wikipedia.org/wiki/Bacteria
 - Evolution https://en.wikipedia.org/wiki/Evolution
 - Mutation https://en.wikipedia.org/wiki/Mutation
 - Biological fission https://en.wikipedia.org/wiki/Fission_(biology)
 - Chemotaxis https://en.wikipedia.org/wiki/Chemotaxis
 - Discrete-event simulation  https://en.wikipedia.org/wiki/Discrete-event_simulation
 - Behavior tree wiki https://en.wikipedia.org/wiki/Behavior_tree_(artificial_intelligence,_robotics_and_control)
 - Behavior tree gitHub https://github.com/libgdx/gdx-ai/wiki/Behavior-Trees#introduction

## Basic Concept
#### -Goal: 
Illustration of the basic concepts of evolution.
#### -Method: 
Simulation of an environment hosting single celled organisms (Bacteria). 
Environment includes relevant features for hosted organisms. Organisms accurately  model attributes and behaviors needed to simulate evolution and related concepts.
#### -Result
Data output of hosted organisms information with visible change of information over time illustrating basic evolutionary concepts.

## Biology
### Evolution
*Definition*: "Evolution is change in the heritable characteristics of biological populations over successive generations. These characteristics are the expressions of genes that are passed on from parent to offspring during reproduction. Different characteristics tend to exist within any given population as a result of mutation, genetic recombination and other sources of genetic variation. Evolution occurs when evolutionary processes such as natural selection (including sexual selection) and genetic drift act on this variation, resulting in certain characteristics becoming more common or rare within a population "

- Reproduction
- Passing information from parent to offspring
- Sources of genetic variation (Mutation)
- Evolutionary pressure (Natural selection)
- Preference of certain characteristics

### Bacteria
*Definition*: "Bacteria are a type of biological cell. They constitute a large domain of prokaryotic microorganisms"
#### -Metabolism
Energy received through photosynthesis or chemotrophy drive cellular reactions to obtain or produce carbon compounds needed for reproduction.
#### -Information (DNA)
Most bacteria have a single circular chromosome of DNA containing the information for cellular structure and activity. Bacteria can also contain plasmids, small extra-chromosomal molecules of DNA that may contain genes for various useful functions such as antibiotic resistance, metabolic capabilities, or various virulence factors.
Through asexual reproduction bacteria inherit an identical copy of the parent's genomes. However, all bacteria can evolve through changes to their genetic material caused by genetic recombination or mutations.
Transformation also allows most bacteria to take up extracellular DNA. These are then either incorporated into the chromosome or kept as extra-chromosomal plasmids.
#### -Reproduction (Binary fission)
Bacteria grow to a certain size before asexually reproducing through binary fission. In binary fission, the parent cell divides into two equal sized daughter cells. The genetic material is replicated, then equally split. The daughter cells are genetically identical (unless a mutation occurs during replication).

![drawing of showing the processes of binary fission, mitosis, and meiosis](https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Three_cell_growth_types.svg/1280px-Three_cell_growth_types.svg.png)

#### -Mutation
A mutation is a random alteration in the nucleotide sequence of the genome of an organism. A mutation may either have a negative effect, a positve effect or no effect at all on the characteristics of an organism. Due to the structure of DNA and the complexity of the encoded information, most mutations have either a negative effect or no effect. Only very few mutations lead to a beneficial change in the organisms characteristics. Mutations play a key role in the progression and persistence of life. Too many mutations leads to dysfunctional offspring. Too few mutations reduces the populations' ability to adapt to its environment.

![Nicht reparierte Fehler in der DNA-Synthese führen zu Punktmutationen](https://i.imgur.com/JZpGMbS.png)

#### -Behavior (Chemotaxis)
The overall movement of a bacterium is the result of alternating tumble and swim phases. As a result, the trajectory of a bacterium swimming in a uniform environment will form a random walk with relatively straight swims interrupted by random tumbles that reorient the bacterium.
In the presence of a chemical gradient bacteria will chemotax, or direct their overall motion based on the concentration of a certain chemical. If the bacterium senses that it is moving in the correct direction it will keep swimming in a straight line for a longer period before tumbling. However, if it is moving in the wrong direction, it will tumble sooner and try a new direction at random.
Positive chemotaxis describes movement toward a higher concentration of a chemical like (i.e finding nurishment). Negative chemotaxis describes movement in the opposite direction of concentration( i.e fleeing toxins).

![Quorumtaxis: Programming E. coli to Eavesdrop, Stalk, and Kill B ...](https://slideplayer.com/slide/4762322/15/images/12/Bacterial+Chemotaxis+Works+by+Modulating+Run+Lengths.jpg)
