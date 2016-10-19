// Exercise 40: Programs that Write to Files
// PrintWriter
// throws Exception
// Try Catch
import java.io.PrintWriter;
import java.io.IOException;

public class ReceiptRevisited_TryCatch {
	public static void main( String[] args ) throws Exception {
		PrintWriter fileout;

		try {
			fileout = new PrintWriter("receipt.txt");
		}
		catch ( IOException err ) {
			System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
			System.out.println("Maybe the file exists and is read-only?");
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