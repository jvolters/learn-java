// Exercise 41: Getting Data from a File
/*
Reads in a file, puts each line into a variable.
(You must know the exact file contents before writing the program).
Put another way, this program works for a static file format.
*/
import java.io.File;
import java.util.Scanner;

public class GettingFromFile {
	public static void main( String[] args ) throws Exception {
		String name;
		int a, b, c, sum;

		System.out.print("Getting name and three numbers from file...");
		Scanner fileIn = new Scanner(new File("GettingFromFile.txt"));
		name = fileIn.nextLine();
		a = fileIn.nextInt();
		b = fileIn.nextInt();
		c = fileIn.nextInt();
		fileIn.close();

		System.out.println("done.");
		System.out.println("Your name is " + name);
		sum = a + b + c;
		System.out.println( a + "+" + b + "+" + c + " = " + sum );
	}
}