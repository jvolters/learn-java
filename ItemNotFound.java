import java.util.Scanner;
/*
Another way to check for a match.  Rather than a bool flag, the for(each)
could include a counter (declared outside of the loop, initialized to 0, 
but incremented in it).
IF, after exiting the loop the counter is still 0, then you know there was 
no match.
*/
public class ItemNotFound {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		String[] heroes = {
			"Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
			"Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
			"Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
			"Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"
		};
		String guess;
		boolean found;

		System.out.println( "Pop Quiz!" );
		System.out.print( "Name any *mortal* hero from Greek mythology: " );
		guess = keyboard.next();

		found = false;
		for ( String hero : heroes ) {
			if ( guess.equals(hero) ) {
				System.out.println( "That's one of them!" );
				found = true;
			}
		}

		if ( found == false ) {
			System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
		}
	}
}