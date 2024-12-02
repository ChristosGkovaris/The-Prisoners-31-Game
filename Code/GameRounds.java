public class GameRounds {
    private Player[] players;          // Array of two players
    private int currentPlayerIndex;    // Index of the player who starts the current round


    // Constructor to initialize the game with two players
    public GameRounds(Player player1, Player player2) {
        this.players = new Player[]{player1, player2};
        // Default starting player
		this.currentPlayerIndex = 0; 
    }


    // Method to play a single round of the game
    public void playRound() {
        Player first = players[currentPlayerIndex];
        Player second = players[1 - currentPlayerIndex];

        int firstScore = first.play(second);
        int secondScore = second.play(first);

        if (firstScore > 31) {
            System.out.println(first.getName() + " busted! " + second.getName() + " wins the round.");
            second.addWin();
        } else if (secondScore > 31) {
            System.out.println(second.getName() + " busted! " + first.getName() + " wins the round.");
            first.addWin();
        } else {
            Player roundWinner = firstScore > secondScore ? first : second;
            roundWinner.addWin();
            System.out.println(roundWinner.getName() + " wins the round.");
        }

        // Update turn order
        currentPlayerIndex = 1 - currentPlayerIndex;
    }


    // Method to print the current scores
    public void printScore() {
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getRoundsWon() + " wins.");
        }
    }
}