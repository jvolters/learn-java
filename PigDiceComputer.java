// Adding values for the dice game 'Pig'
/*
Basically the whole program is in the body of one big do-while loop that tells the 
computer when to stop: either it rolls a 1 or it gets a total of 20 or more. 
As long as the roll is not one and the total is less than 20, the condition will be true 
and the loop will start over from the beginning (on line 6).
And we choose a do-while loop because we want the computer to roll at least once no matter 
what.
The roll is made on line 7: a random number from 1-6 is a good substitute for rolling a 
dice.
On line 9 we check for rolling a 1. If so, all points are lost. 
If not (else), we add this roll to the running total. 
Notice we used “plus equals”, which we have seen before.
The if statement on line 17 is just so we can get a nice message that the computer is 
going to roll again.
*/
public class PigDiceComputer {
	public static void main( String[] args ) {
		int roll, total;
	total = 0;

	do {
		roll = 1 + (int)(Math.random()*6);
		System.out.println( "Computer rolled a " + roll + "." );
			if ( roll == 1 ) {
				System.out.println( "\tThat ends its turn." );
				total = 0;
			}
			else {
				total += roll;
				System.out.print( "\tComputer has " + total );
				System.out.print( " points so far this round.\n" );
				if ( total < 20 ) {
					System.out.println( "\tComputer will roll again." );
				}
			}
		} while ( roll != 1 && total < 20 );
		
		System.out.println("Computer ends the round with " + total + " points.");
	}
}