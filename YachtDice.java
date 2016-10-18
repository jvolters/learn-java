// another example of method calling (although it is more like function calling as there are no objects).
/*
Yacht is an old dice game that was modified for the commercial game Yahtzee. 
It involves rolling five dice at once and earning points for various combinations. 
The rarest combination is 'The Yacht', when all five dice show the same number.
This program doesn’t do any other scoring, it just rolls five dice until they are all 
the same.
(Computers go fast, so even if this takes a lot of tries it doesn’t take very long.)
*/
public class YachtDice {
	public static void main( String[] args ) {
		int r1, r2, r3, r4, r5;
		boolean allSame;

		do {
			r1 = 1 + (int)(Math.random()*6);
			r2 = 1 + (int)(Math.random()*6);
			r3 = 1 + (int)(Math.random()*6);
			r4 = 1 + (int)(Math.random()*6);
			r5 = 1 + (int)(Math.random()*6);
			System.out.print("\nYou rolled: " + r1 + " " + r2 + " ");
			System.out.println(r3 + " " + r4 + " " + r5);
			showDice(r1);
			showDice(r2);
			showDice(r3);
			showDice(r4);
			showDice(r5);
			allSame = ( r1 == r2 && r2 == r3 && r3 == r4 && r4 == r5 );
	} while ( ! allSame );
	System.out.println("The Yacht!!");
}

	public static void showDice( int roll ) {
		System.out.println("+---+");
		if ( roll == 1 ) {
			System.out.println("|   |");
			System.out.println("| o |");
			System.out.println("|   |");
		}
		else if ( roll == 2 ) {
			System.out.println("|o  |");
			System.out.println("|   |");
			System.out.println("|  o|");
		}
		else if ( roll == 3 ) {
			System.out.println("|o  |");
			System.out.println("| o |");
			System.out.println("|  o|");
		}
		else if ( roll == 4 ) {
			System.out.println("|o o|");
			System.out.println("|   |");
			System.out.println("|o o|");
		}
		else if ( roll == 5 ) {
			System.out.println("|o o|");
			System.out.println("| o |");
			System.out.println("|o o|");
		}
		else if ( roll == 6 ) {
			System.out.println("|o o|");
			System.out.println("|o o|");
			System.out.println("|o o|");
		}
		System.out.println("+---+");
	}
}