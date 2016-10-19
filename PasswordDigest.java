// Exercise 39: Importing Standard Libraries
// SHA-256
// Password
// Encryption
/*
An example importing multiple libaries to do something truly useful.
The author built this 'simple' program that took about half an hour to write because he spent
a lot of time searching the Internet and importing things and trying things that didn’t work.

What it does - The program allows the human to enter a password (or anything, really) and 
then prints out the SHA-256 message digest of that password.
*/

import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class PasswordDigest {
	public static void main( String[] args ) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		String pw, hash;

		MessageDigest digest = MessageDigest.getInstance("SHA-256");

		System.out.print("Password: ");
		pw = keyboard.nextLine();

		digest.update( pw.getBytes("UTF-8") );
		hash = DatatypeConverter.printHexBinary( digest.digest() );

		System.out.println( hash );
	}
}