import java.util.Scanner;
public class SpiceMixologistCli {
	
	// Follows workflow of game / plays game
	public static void playGame(SpiceMixGame NewGame) {
		// Initialise gameplay operation condition
		boolean finished = false;
		// Initialise user input array and user spice mix
		char[] UserInput = new char[5];
		SpiceMix UserMix;
		String input = "";
		// Initialise spices array
		char[] spices = {'N', 'O', 'P', 'Q', 'R', 'S', 'T'};
		// Initialise  User spice input calculator
		int InputVal;			
		Scanner myScanner = new Scanner(System.in);

		// whilst game is in operation
		while(finished == false) {
			// Print previous attempts
			System.out.print("Previous attempts:\n");
			if(NewGame.getPreviousAttempts() != null) {
			System.out.print(NewGame.getPreviousAttempts().toString());}
			else { System.out.print("No previous attempts");}
			// Ask for user spice mix input
			System.out.print("\nEnter spice mix:\n");
			// Set input calcualtor to 0
			InputVal = 0;
			// While input is less than 5 characters (This is to allow user to input 5 characters regardless of weatehr they are right or not)
			while(InputVal != 5) {
				InputVal = 0;
				input = myScanner.nextLine();
				for(int i = 0; i < 5 && 2*i < input.length(); i++) {
					// Read every even value as we dont need to read the spaces (i.e layout is " char char char char " making the user input a array of 7 values, however we need to convert it to an array of 5 values
					for(int j = 0; j < 7; j++) {
						// Check if user input is a spice and if it is then increase the user spice input count
						if(input.charAt(i*2) == spices[j]) {
							UserInput[i] = input.charAt(i*2);
							InputVal++;
							break;
						}
					}
				}
				// Check if all 5 characters were a spice, if they werent then output invalid mix error
				if(InputVal !=5 )
					System.out.print("Invalid spice mix!\n");
					
			}
			// save user input as a user Spice mix
			UserMix = new SpiceMix(UserInput);
			// check if user spice mix matches and get reasults
			finished = NewGame.attemptSpiceMix(UserMix);
		}
		// Once game is finished, return congratuations message
		System.out.print("Congratulations!\n");
	}

	// Creates a new Spice Mix Game with random solutions
	public static void main(String[] args) {
		SpiceMixGame NewGame = new SpiceMixGame();
		// pass new game to playgame
		playGame(NewGame);

	}

}
