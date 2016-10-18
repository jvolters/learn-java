// while loop
import java.util.Scanner;

public class EnterPIN {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		
		pin = 12345;
		
		System.out.println("WELCOME TO JAVA BANK.");
		System.out.println("PLEASE ENTER YOUR PIN: ");
		entry=keyboard.nextInt();
		
		while(entry != pin){
			System.out.println("SORRY. THIS IS NOT YOUR PIN.  PLEASE RE-ENTER.");
			System.out.println("PLEASE ENTER YOUR PIN: ");
			entry=keyboard.nextInt();
		}
		
		System.out.println("\nPIN ACCEPTED. BUT, UH-OH, YOU HAVE NO MONEY IN YOUR ACCOUNT.");
	}
}