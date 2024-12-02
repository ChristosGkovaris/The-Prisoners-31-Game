import java.util.Scanner;

public class PrisonerGame {
    public static void main(String[] args) {
		// Scanner for user input
        Scanner scanner = new Scanner(System.in); 
        try {
            System.out.println("Do you want to play 1. Human vs Computer, or 2. Computer vs Computer?");
            int choice = scanner.nextInt();

            Player player1;
            Player player2;

            if (choice == 1) {
                player1 = new HumanPlayer("Human");
                player2 = new ComputerPlayer("Computer");
            } else {
                player1 = new ComputerPlayer("Computer1");
                player2 = new ComputerPlayer("Computer2");
            }

            GameRounds gameRounds = new GameRounds(player1, player2);

            String continueGame;
            do {
                gameRounds.playRound();
                gameRounds.printScore();
                System.out.println("Do you want to play another round? (y/n)");
                continueGame = scanner.next();
            } while (continueGame.equalsIgnoreCase("y"));

            Player winner = player1.declareWinner(player2);
            if (winner != null) {
                System.out.println(winner.getName() + " has won the game!");
            } else {
                System.out.println("The game is a tie!");
            }
        } finally {
            // Close the scanner to release resources
            scanner.close();
        }
    }
}