# Spice-Mixologist
CS1811: OOP1 Assignemnt 2

A text based game to guess the perfect spice mix.


Learning Outcomes Assessed:

This assignment tests your ability to write a complete Java program, using the following features; classes,
arrays,
linked lists.

You will also need to be able to use the loops, conditionals, and method calls learned early in the module.

You will write a game that allows the user to solve a puzzle.


Goal:

You will write a game called “The Spice Mixologist”

The user plays the role of an apprentice chef who has been asked to conceive a new five-spice mix for an eccentric chef at a famous restaurant in Knightsbridge.

Like many chefs of his caliber, he has a very specific idea of the right mix, but is not able to tell his apprentice exactly what it should be.

They “know it when they taste it”, however. This means the apprentice has to suggest a spice mix to the chef. The chef is able to tell them:

how many spices taste good and are in the right quantity, and
how many taste ok and should appear in the mix, but are given in the wrong quantity.
With this feedback, the apprentice can refine their recipe until the mix is the right blend of spices.

For the purpose of this program, the spices we will consider are; Nutmeg,
Oregano,
Pepper,
Quassia,
Rosemary,
Salt, and
Thyme.

We use letters N, O, P, Q, R, S, and T to represent them (first letter of each spice). We use the order of the sequence to represent the quantity of each spice (position 1 = 1 tea spoons (tsp), position 2 = 2 tsp, etc.)

For instance 'Q P T S R' represents a spice mix with 1 tsp of quassia, 2 tsp of pepper, 3 tsp of thyme, 4 tsp of salt, and 5 tsp of rosemary.

Suppose the chef was expecting the mix  'Q P T S R' and  the user played 'R P O S Q' the chef would say that 'two spices taste good and are in the right quantity (Pepper and Salt), and
two spices taste ok, but are given in the wrong quantity (Rosemary and Quassia).'.
The game will proceed in a loop. First, the list of previous attempts so far is displayed – this includes the guesses and the chef’s feedback. The user is then asked to input their next suggestion. If the answer is correct, “Congratulations!” is displayed and the program terminates. Otherwise, the game loops.

If the user enters a recipe containing a letter that does not represent a spice, the program should indicate that the recipe is not valid and ask the user to enter another attempt.
