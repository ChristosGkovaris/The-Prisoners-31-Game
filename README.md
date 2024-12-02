# The Prisoner's 31 Game

Welcome to "The Prisoner Game," a competitive and strategic game inspired by the classic "31". This project simulates the game between two players, where the goal is to accumulate points without
exceeding a limit.


## Game Instructions
- Objective: Accumulate as many points as possible without exceeding 31 in a round. Play multiple rounds and aim to win the most rounds overall.
- How to Play: At the start, players take turns selecting numbers (between 1 and 5). Each number represents "points" that get added to the player's total for the round. A player stops
  drawing numbers when they reach at least 26 points but must avoid exceeding 31 points, as that will cause them to "bust." Players alternate turns in each round, and the one with the
  most wins after multiple rounds becomes the overall winner.
- Scoring: If a player exceeds 31 points, they lose the round ("bust"). If both players stay under 31, the one with the higher points wins the round. In case of a tie, the first player wins.
- Game Modes: Human vs. Computer: A human player competes against the computer. Computer vs. Computer: Two computer players compete automatically.


## Implementation Details
- The game is implemented in Java, adhering to object-oriented design principles.
- Key Classes: **`Player`**: Abstract class defining common functionality for all players, including scoring and win-tracking. **`HumanPlayer`**: A concrete subclass of `Player` that allows
  a human to select numbers via user input. **`ComputerPlayer`**: A concrete subclass of `Player` that selects numbers randomly. **`GameRounds`**: Manages individual game rounds, alternating turns,
  and updating scores. **`PrisonerGame`**: The entry point for the program, managing the game flow, user input, and determining the overall winner.


## How to Run
- Clone the Repository:
  ```bash
     git clone https://github.com/ChristosGkovaris/The-Prisoner-Game.git
     cd The-Prisoner-Game
