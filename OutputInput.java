/*
Read file line and write to screen.
*/
import java.io.File;
import java.util.Scanner;

public class OutputInput {
	public static void main(String[] args) throws Exception {
		String file = "LOTR.txt";
		System.out.println();
		Scanner readFile = new Scanner(new File(file));
		// currently this loop writes each word to screen, not line.
		// need to figure logic for line.
		while (readFile.hasNext()){
			String line = readFile.next();
			System.out.println(line);
		}
		readFile.close();
		System.out.println();
	}
}