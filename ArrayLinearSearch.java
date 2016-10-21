import java.util.Scanner;

public class ArrayLinearSearch {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] orderNumbers = { 12345, 54321, 101010, 8675309, 31415, 271828 };
		int toFind;

		System.out.print("There are " + orderNumbers.length);
		System.out.println(" orders in the database.");

		System.out.print("Orders: ");
		// for each integer 'num' in the array 'orderNumbers'...
		for ( int num : orderNumbers ) {
			System.out.print( num + " " );
		}
		System.out.println();

		System.out.print("Which order to find? ");
		toFind = keyboard.nextInt();

		boolean found = false; // changed, added bool found
		for ( int num : orderNumbers ) {
			if ( num == toFind ) {
				found = true; // changed, if matched then found is true
				System.out.println( num + " found.");
		/* in both for loops the int variable num is declared.
		   the reason num cannot be declared along with toFind
		   above where the array is also defined is because of 
		   for loop syntax for arrays - the variable is local in 
		   scope to the loop and must be declared there.
		   so each instance of 'num' is local to the for(each)
		   loop that uses it.
		*/
			}
		}
		// added below if. if exiting the loop found is still false there was no match.
		if (found == false){
			System.out.println("Sorry, "+toFind+" is not in the system.");
		}
	}
}