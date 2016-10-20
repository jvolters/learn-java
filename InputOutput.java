/*
Take input line and write to file.
*/
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutput {
		public static void main(String[] args) throws Exception {
			Scanner kbdinput = new Scanner(System.in);
			String input;
			input = kbdinput.nextLine();
			
			System.out.println("You typed: "+input+". Check LOTR.txt");
			
			PrintWriter fileout = new PrintWriter("LOTR.txt");
			fileout.println(input);
			fileout.close();
	}
}