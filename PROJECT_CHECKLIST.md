# SokoBot: Comprehensive Project Checklist

Based on the project specifications and architecture, this guide is divided into four critical phases.

## Phase 1: Exploration & Environment Setup
- [x] **Technical Audit**:
    - [x] Run `freeplay.bat` to confirm JDK installation and environment setup.
    - [x] Run `sokobot.bat` to observe the baseline bot behavior.
- [x] **Data Analysis**:
    - [x] Inspect `SokoBot.java` and the `solveSokobanPuzzle` method.
    - [x] Map the `mapData` (walls `#`, targets `.`) and `itemsData` (player `@`, crates `$`) arrays.
- [x] **Constraint Awareness**:
    - [x] Note the **15-second** thinking time limit.
    - [x] Confirm output requirement: a string of moves (`u`, `d`, `l`, `r`).

## Phase 2: Core Logic & Knowledge Representation
- [x] **State Representation**: Create a class (e.g., `SokobanState`) to represent a puzzle snapshot.
    - [x] Store player position `(row, col)`.
    - [x] Store crate positions (using a data structure like `HashSet<Point>`).
    - [x] Utilize `mapData` for static elements (walls/targets) during validation.
    - [x] **Requirements**: Implement `equals()` and `hashCode()` for state identity.
- [x] **Movement & Transitions**:
    - [x] Implement `getPossibleMoves()` returning a list of valid child states.
    - [x] Logic for single-crate pushes and wall collisions.
    - [x] Goal check: All crates must align with target tiles in `mapData`.

## Phase 3: AI Solver & Optimization
- [ ] **Search Strategy**:
    - [ ] Implement **A* Search** or **BFS** within the `solver` package.
    - [ ] Use a `Visited` set to prevent infinite loops and redundant exploration.
- [ ] **Heuristics**:
    - [ ] Implement **Manhattan Distance** (sum of distances from crates to nearest targets).
- [ ] **Deadlock Detection**:
    - [ ] Prune "Corner Deadlocks" where a crate becomes unmovable on a non-target tile.
- [ ] **Performance Tuning**:
    - [ ] Add an internal timer to stop searching at 14.5 seconds to return the best solution found.

## Phase 4: Evaluation, Report & Submission
- [ ] **Testing**:
    - [ ] Verify solve rates on levels with 2-8 crates.
    - [ ] Aim for >80% success rate to meet full credit requirements.
- [ ] **Documentation**:
    - [ ] Write the 4-page report (Algorithm description, Performance analysis, Challenges).
    - [ ] Generate Table of Contributions for the team.
- [ ] **Deliverables**:
    - [ ] Zip the full source code directory.
    - [ ] Save the report as a PDF.
