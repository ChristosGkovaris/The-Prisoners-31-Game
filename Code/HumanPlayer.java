import java.util.Scanner;

public class HumanPlayer extends Player {
    // Scanner for user input
	private Scanner scanner; 


    // Constructor to initialize the human player with a name
    public HumanPlayer(String nameOfPlayer) {
        super(nameOfPlayer);
        this.scanner = new Scanner(System.in);
    }

	
    // Implementation of the abstract method to select a number
    @Override
    public int selectNumber() {
        int number;
        do {
            System.out.print("Give a number between 1 and 5: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 5); // Validate input
        return number;
    }
}