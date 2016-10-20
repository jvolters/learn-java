// Exercise 40: Programs that Write to Files
// PrintWriter
// Try Catch
/*
	To make the program throw an execption and see how the catch block functions, 
	simpley set the read-only property on receipt.txt.
*/
import java.io.PrintWriter;
import java.io.IOException;

public class ReceiptRevisited_TryCatch {
	public static void main( String[] args ) {
		PrintWriter fileout;
		// try catch means we can dump the throws Exception from main declaration.
		try {
			fileout = new PrintWriter("receipt.txt");
		}
		catch ( IOException err ) {
			//System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
			//System.out.println("Maybe the file exists and is read-only?");
			// Added the line below to include the actual error message thrown.
			System.err.println("Caught IOException: " + err.getMessage());
			fileout = null;
			System.exit(1);
		}
		fileout.println( "+------------------------+" );
		fileout.println( "|                        |" );
		fileout.println( "|      CORNER STORE      |" );
		fileout.println( "|      ------ -----      |" );
		fileout.println( "|                        |" );
		fileout.println( "| 2014-06-25 04:38PM     |" );
		fileout.println( "|                        |" );
		fileout.println( "| Gallons: 12.464        |" );
		fileout.println( "| Price/gallon: $ 3.459  |" );
		fileout.println( "|                        |" );
		fileout.println( "| Fuel total: $ 43.11    |" );
		fileout.println( "|                        |" );
		fileout.println( "+------------------------+" );
		fileout.close();
	}
}