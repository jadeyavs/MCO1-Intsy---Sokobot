# Sokoban Clone: Architecture & Implementation Checklist

This checklist provides a blueprint for creating a Sokoban-like game with an integrated AI solver, based on the `sokobot` architecture.

## 1. Project Foundation (Starter Integration)
- [x] **Language**: Java (JDK required).
- [x] **Provided Components** (Do Not Modify):
    - `main` package: Execution logic and mode switching.
    - `gui` package: Sprite rendering and grid display.
    - `reader` package: Level loading and `.txt` parsing.
    - `maps/`: Level data files.
- [x] **Task Area**: 
    - `solver` package: Specifically the `SokoBot` class and `solveSokobanPuzzle` method.

## 2. Core Game Logic (State Model)
- [x] **State Representation**: Create a class (e.g., `SokobanState`) to represent a puzzle snapshot.
    - [x] Store player position `(row, col)`.
    - [x] Store crate positions (using a data structure like `HashSet<Point>`).
    - [x] Utilize `mapData` for static elements (walls/targets) during validation.
    - [x] **Requirements**: Implement `equals()` and `hashCode()` for state identity.
- [x] **Movement & Transitions**:
    - [x] Implement `getPossibleMoves()` returning a list of valid child states.
    - [x] Logic for single-crate pushes and wall collisions.
    - [x] Goal check: All crates must align with target tiles in `mapData`.

## 3. AI Solver (Search Algorithm)
- [ ] **Algorithm**: Implement **A* Search** or **BFS**.
    - [ ] **Visited Set**: Track explored states to prevent infinite loops.
    - [ ] **Heuristic**: Manhattan Distance (sum of distance from crates to nearest goals).
- [ ] **Constraints & Optimization**:
    - [ ] **15-Second Limit**: The solver *must* return a result within 15 seconds.
    - [ ] **Deadlock Pruning**: Identify and discard states where crates are stuck in non-goal corners.
    - [ ] **Memory**: Optimize state storage to handle 2-8 crates efficiently.

## 4. Interface & Output
- [ ] **Input Signature**: `public String solveSokobanPuzzle(int width, int height, char[][] mapData, char[][] itemsData)`
- [ ] **Output Format**: Return a string of characters (e.g., `"uulrrd"`) representing the solution sequence.
- [ ] **Moves**: `u` (Up), `d` (Down), `l` (Left), `r` (Right).

## 5. Deliverables & Documentation
- [ ] **Performance**: Successfully solve at least 80% of test levels.
- [ ] **Report**: Max 4-page A4 PDF documenting logic, representation, performance, and contributions.

## 6. Prompt Basis (For AI Generation)
If you are using an AI to generate parts of this, use these prompt skeletons:

> **For the Solver:** "Create an A* search algorithm for a Sokoban game. The state should track crate and player positions. Include a Manhattan distance heuristic and a deadlock detection system for corners."

> **For the UI:** "Generate a Java Swing JPanel that renders a Sokoban map from a char array. Use 'TILE_SIZE = 32' and include methods to update the player position and handle 'repaint()' calls."

> **For the Engine:** "Write a movement handler that checks for wall collisions and implements crate pushing logic, ensuring a crate cannot be pushed into a wall or another crate."
