# SokoBot: Comprehensive Project Checklist

Based on the project specifications and architecture, this guide is divided into four critical phases.

## Phase 1: Exploration & Environment Setup
- [ ] **Technical Audit**:
    - [ ] Run `freeplay.bat` to confirm JDK installation and environment setup.
    - [ ] Run `sokobot.bat` to observe the baseline bot behavior.
- [ ] **Data Analysis**:
    - [ ] Inspect `SokoBot.java` and the `solveSokobanPuzzle` method.
    - [ ] Map the `mapData` (walls `#`, targets `.`) and `itemsData` (player `@`, crates `$`) arrays.
- [ ] **Constraint Awareness**:
    - [ ] Note the **15-second** thinking time limit.
    - [ ] Confirm output requirement: a string of moves (`u`, `d`, `l`, `r`).

## Phase 2: Core Logic & Knowledge Representation
- [ ] **State Implementation**:
    - [ ] Create a `State` class to represent crate/player positions.
    - [ ] Implement `equals()` and `hashCode()` for efficient state tracking.
- [ ] **Physics Engine**:
    - [ ] Implement valid move generation (Up, Down, Left, Right).
    - [ ] Code collision detection (Walls and Crate-on-Crate).
    - [ ] Implement "push" mechanics (crate moves if space behind is empty).
- [ ] **Goal Check**:
    - [ ] Function to identify when all crates are on target positions.

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
