class SpiceMix {
    
    // Generate ana Array of size 5 to store characters representing Spices
    char[] Spices = new char[5]; 
    
    // Public Constructor to initialise Spice Mix
    public SpiceMix(char[] Spices) {
        this.Spices = Spices;
    }
    
    // Return Spice at position i in array
    public char getSpice(int i) {return Spices[i];}
    
    // Returns sequence of spice chars seperated by spaces
    public String toString() {
        String spicy = "";
        for (int i = 0; i < Spices.length - 1; i++) {
                spicy = spicy + Spices[i] + " ";
        }
        spicy = spicy + Spices[4];
        return spicy;
    }
} 