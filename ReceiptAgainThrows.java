/*
Yet another Receipt program for throws Exception.
*/
import java.io.IOException;
import java.io.PrintWriter;

public class ReceiptAgainThrows {
		public static void main(String[] args) throws Exception {
			PrintWriter fileout = new PrintWriter("anotherReceipt.txt");
						
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