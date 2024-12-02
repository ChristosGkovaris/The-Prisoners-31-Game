abstract class Player {
    private String nameOfPlayer;  // Name of the player
    private int roundsWon;        // Total rounds won by the player


    // Constructor to initialize player's name
    public Player(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
        
		// Default rounds won is 0
		this.roundsWon = 0; 
    }


    // Abstract method to be implemented by subclasses for selecting a number
    public abstract int selectNumber();


    // Method to play a round for the player
    public int play(Player other) {
        int points = 0;
        while (points < 26) {
            int selectedNumber = this.selectNumber();
            points += selectedNumber;
            System.out.println(this.nameOfPlayer + " has " + points + " points.");
        }
        return points;
    }


    // Method to declare the winner between this player and another
    public Player declareWinner(Player other) {
        if (this.roundsWon > other.roundsWon) {
            return this;
        } else if (this.roundsWon < other.roundsWon) {
            return other;
        } else {
			// Return null in case of a tie
            return null; 
        }
    }


    // Method to increase the player's win count
    public void addWin() {
        this.roundsWon++;
    }


    // Getter for player's name
    public String getName() {
        return this.nameOfPlayer;
    }


    // Getter for rounds won
    public int getRoundsWon() {
        return this.roundsWon;
    }


    // Overridden toString method to return player's name
    @Override
    public String toString() {
        return this.nameOfPlayer;
    }
}