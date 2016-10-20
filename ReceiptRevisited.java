// Exercise 40: Programs that Write to Files
// PrintWriter
// throws Exception
import java.io.PrintWriter;

public class ReceiptRevisited {
	public static void main( String[] args ) throws Exception {
		// declare a variable of type PrintWriter and name it fileout.
		// give fileout a value; the reference to a new PrintWriter object.
		// PrintWriter expects an argument, in this case, "receipt.txt", a string.
		// "receipt.txt" is the filename passed in as the argument.
		// By the way, System.out is a PrintWriter.
		PrintWriter fileout = new PrintWriter("receipt.txt");

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
