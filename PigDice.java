// Adding values for the dice game 'Pig'
/*
The entire program you wrote in Lesson 31 corresponds roughly to lines 37 through 59 in 
this program.
The only major difference is that instead of a single total variable we will have a 
turnTotal variable to hold only the points for one turn and a ctot variable that holds 
the computer’s overall points from round to round.

We begin the program with two variables: ptot holds the human’s total and ctot holds the 
computer’s total. Both start at 0.
Then on line 12 begins a really huge do-while loop that basically contains the whole game 
and doesn’t end until line 62. 
This loop repeats as long as both ptot and ctot are less than 100.
*/
import java.util.Scanner;

public class PigDice {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int roll, ptot, ctot, turnTotal;
		String choice = "";

		ptot = 0;
		ctot = 0;

		do {
			turnTotal = 0;
			System.out.println( "You have " + ptot + " points." );

			do {
				roll = 1 + (int)(Math.random()*6);
				System.out.println( "\tYou rolled a " + roll + "." );
				if ( roll == 1 ) {
					System.out.println( "\tThat ends your turn." );
					turnTotal = 0;
				}
				else {
					turnTotal += roll;
					System.out.print( "\tYou have " + turnTotal + " points" );
					System.out.print( " so far this round.\n" );
					System.out.print( "\tWould you like to \"roll\" again" );
					System.out.print( " or \"hold\"? " );
					choice = keyboard.next();
				}
			} while ( roll != 1 && choice.equals("roll") );

			ptot += turnTotal;
			System.out.println("\tYou end the round with " + ptot + " points.");

			if ( ptot < 100 ) {
				turnTotal = 0;
				System.out.println( "Computer has " + ctot + " points." );

				do {
					roll = 1 + (int)(Math.random()*6);
					System.out.println( "\tComputer rolled a " + roll + "." );
					if ( roll == 1 ) {
						System.out.println( "\tThat ends its turn." );
						turnTotal = 0;
					}
					else {
						turnTotal += roll;
						System.out.print( "\tComputer has " + turnTotal );
						System.out.print( " points so far this round.\n" );
						if ( turnTotal < 20 ) {
							System.out.println( "\tComputer will roll again." );
						}
					}
				} while ( roll != 1 && turnTotal < 20 );

				ctot += turnTotal;
				System.out.print( "\tComputer ends the round with " );
				System.out.print( ctot + " points.\n" );
			}

		} while ( ptot < 100 && ctot < 100 );

		if ( ptot > ctot ) {
			System.out.println( "Humanity wins!" );
		}
		else {
			System.out.println( "The computer wins." );
		}
	}
}