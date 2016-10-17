import java.util.Scanner;

public class SecretWord {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String secret="please", guess; // two strings, secret and guess
		
		System.out.println( "What's the secret woid?" );
		guess=keyboard.next();
		
		if( guess.equals(secret) ) {
			System.out.println( "That's correct, you have guessed the secret woid" );
		}
		else {
			System.out.println( "No, the secret woid isn't \"" +guess+"\"." );
		}
		if ( guess==secret ) {
			System.out.print("(This will never ever show, no matter what.)");// this is never true; (object reference is not object value.)
		}
		
	}
}