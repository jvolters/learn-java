/*
Yet another Receipt program for Try Catch & write to file.
*/
import java.io.IOException;
import java.io.PrintWriter;

public class ReceiptAgain {
		public static void main(String[] args) {
			PrintWriter fileout;
			
			try{
				fileout = new PrintWriter("anotherReceipt.txt");
			}
			catch( IOException err ){
				System.out.println("IOException: " + err.getMessage());
				fileout = null;
				System.exit(1);
			}
			
			fileout.println("1 --------------------------|");
			fileout.println("2 Thanks for the business!  |");
			fileout.println("3 Item 1             $ 2.99 |");
			fileout.println("4 Item 2             $ 1.99 |");
			fileout.println("5 Item 3             $12.99 |");
			fileout.println("6                    ------ |");
			fileout.println("7 Total:             $17.97 |");
			fileout.println("8 --------------------------|");
			fileout.close();
	}
}