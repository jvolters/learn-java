/*
Take input line and write to file.
*/
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) throws Exception {
		Scanner kbdinput = new Scanner(System.in);
		PrintWriter fileout = new PrintWriter("LOTR.txt");
		fileout.println("");
		String input;
		System.out.println("");
		System.out.println("Program accepts keyboard input and writes to a file.");
		System.out.println("When finished typing a line, press Enter.");
		System.out.println("To finish entering lines, press Enter.");
		input = "0"; // init the var
				
		while (!input.equals("")) {
			input = kbdinput.nextLine();
			if(!input.equals("")){
				//System.out.println("You typed: "+input+".");
				fileout.println(input);
			} else {
				fileout.println("");
				fileout.close();
				System.out.println("Check LOTR.txt");	
				System.out.println("Program ended");	
			}
		}	
	}
}