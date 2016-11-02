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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class OutputInput {
	public static void main(String[] args) {
		System.out.println();
		String fileName = "C:\\Users\\npdjvolters\\IdeaProjects\\learn-java\\LOTR.txt";
		
		// read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))){
			
			//stream.forEach(System.out.println); bad
			stream.forEach(System.out::println);
						
		} catch (IOException e){
			e.printStackTrace();
		}
		System.out.println();
	}
}