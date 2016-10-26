/*
Read file line and write to screen.
Work in progress...
For further study:
http://www.programcreek.com/2011/03/java-read-a-file-line-by-line-code-example/
https://www.mkyong.com/java8/java-8-stream-read-a-file-line-by-line/
http://www.avajava.com/tutorials/lessons/how-do-i-read-a-string-from-a-file-line-by-line.html

Also; once I get the reader working, make a change to the program so that the program
asks the user what file to read.  Allow the user to enter the file (path/filename).

Then read that file.
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