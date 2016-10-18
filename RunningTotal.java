// using a counter in a loop 
// accepts indefinite inputs; keeps a running total
import java.util.Scanner;

public class RunningTotal {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int current, total =0;
		
		System.out.println("Type in as many values as you like and I will add them for you.");
		System.out.println("Type a zero when you want to stop");
		
		do {
			System.out.println("Value: ");
			current = keyboard.nextInt();
			total += current;
			if (current != 0){
				System.out.println("The total so far is: "+ total);
			}
			else{
				System.out.println("OK, you typed "+current+", so we're done accepting input.");
			}
		} while ( current != 0 );
		
		System.out.println("The final total is: "+total);
	}
	
}