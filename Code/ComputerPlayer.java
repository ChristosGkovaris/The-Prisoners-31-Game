import java.util.Random;

public class ComputerPlayer extends Player {
    
	// Constructor to initialize the computer player with a name
    public ComputerPlayer(String nameOfPlayer) {
        super(nameOfPlayer);
    }

    // Implementation of the abstract method to select a random number
    @Override
    public int selectNumber() {
        Random random = new Random();
		
		// Random number between 1 and 5
        return random.nextInt(5) + 1; 
    }
}