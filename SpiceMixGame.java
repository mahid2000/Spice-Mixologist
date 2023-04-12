import java.util.Random;

public class SpiceMixGame {

	// Linked List Node class
	class Node {
		Attempt data = null;
		Node next = null;
		
		Node(Attempt NewAttempt){
			data = NewAttempt;
		}
		
		// Return linked list data as a string with each new node value on a new line
		public String toString() {
			String result = "";
			if(data != null) 
				result += data.toString();
			if(next != null)
				result += "\n" + next.toString();
			return result;
		}
	}

	// Linked List data structure
	public class LinkedSpice {
		public Node head;
		
		public LinkedSpice() {
			Node head = null;
		}
		
		public void add(Attempt NewAttempt) {
			Node NewNode = new Node(NewAttempt);
			NewNode.next = head;
			this.head = NewNode;
		}
	}
	
	// Initialise solution and linked spicemix list
	private SpiceMix GameSolution;
	private LinkedSpice Attempts = new LinkedSpice();
	
	// Public constructor with game solution
	public SpiceMixGame(SpiceMix GameSol) {
		GameSolution = GameSol;
	}
	
	// Generate random spice mix solution
	public SpiceMixGame() {
		Random randNum = new Random();
		char[] Spicy = new char[5];
		for(int i = 0; i < 5; i++) {
			Spicy[i] = (char)('N' + randNum.nextInt(7));
			GameSolution =  new  SpiceMix(Spicy);
		}
	}
	
	// Creates new attempt from spice mix and game solution and stores in linked list
	public boolean attemptSpiceMix(SpiceMix Suggetion) {
		Attempt newAttempt = new Attempt(Suggetion, GameSolution);
		Attempts.add(newAttempt);
		// If attempt is correct, return True
		return newAttempt.isCorrect();
	}
	
	// Returns head of list of previous attempts or null if its empty
	public Node getPreviousAttempts() {
		return Attempts.head;
	}
	
	// Returns solution
	public SpiceMix getSolution() {
		return GameSolution;
	}
}
