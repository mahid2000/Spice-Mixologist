import java.util.*;

public class Attempt {
	
	// Initialise private variables
	private SpiceMix suggest;
	private SpiceMix solve;
	private int good = 0;
	private int wrong = 0;
	private boolean correct;
	
	// Public Constructor 
	public Attempt(SpiceMix Suggestion, SpiceMix Solution) {
		suggest = Suggestion;
		solve = Solution;
		setValues();
	}
	
	// Public getters
	// Returns suggested spice mix
	public SpiceMix getSpiceMix() { return suggest; }
	// Returns number of required spices that match but are in wrong quantity
	private int getNumWrongQuantity() { return wrong; }
	// Returns how many required spices are given in correct quantity
	private int getNumGood() { return good; }

	//Generates a String that states if the spice macthes and how many are wrong Quantity
	public String toString() {
		return String.format(suggest.toString() + " (Good %d, Wrong quantity %d)", getNumGood(), getNumWrongQuantity());
	}
	
	// Set Score values for Spice Mix
	private void setValues() {
		correct = true;
		// Initialise and Calculate Score Values for each Spice
		char[] spices = {'N', 'O', 'P', 'Q', 'R', 'S', 'T'};
		int[] spiceValues = {0, 0, 0, 0, 0, 0, 0};

		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 5; j++) {
				if(spices[i] == solve.getSpice(j))
					spiceValues[i] += (j+1)*100;
				if(spices[i] == suggest.getSpice(j))
					spiceValues[i] += j+1;
			}
		}

		for(int i = 0; i < 7; i++) {
			// if the spice and quantity of the mix matches  then return good
			if(spiceValues[i] != 0 ) {
				if(spiceValues[i]%100 - spiceValues[i]/100 == 0)
					good++;
				// else if spice matches but is in wrong quantity then return Incorrect and Wrong quantity error
				else if (spiceValues[i]%100 != 0 && spiceValues[i]/100 != 0) {
					wrong++;
					correct = false;
				}
				// else if neither quantity nor spice maches return Incorrect
				else 
					correct = false;
			}
		}
	}
	// Checks if the spices and quantities match solution and returns correct if it is true
	public boolean isCorrect() {
		return correct;
	}


}
