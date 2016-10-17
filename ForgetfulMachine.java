import java.util.Scanner;
/*
So let us talk about the code. On line 1 we have an import statement. The library we import is the
scanner library java.util.Scanner (“java dot util dot Scanner”). This library contains functionality
that allows us to get information into our program from the keyboard or other places like files on
the computer or from the Internet.
*/
public class ForgetfulMachine {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		/*
		Here is something else new: we create a “Scanner object” named “keyboard”. 
		It doesn’t have to be named “keyboard”; you could use a different word there as long 
		as you use it everywhere in your code.) This Scanner object named keyboard contains abilities 
		we’ll call functions or “methods”. You must create and name a Scanner object before you can use 
		one.
		*/
		
		System.out.println("What city is the capital of France?");
		keyboard.next();
		/*
		We ask the Scanner object named keyboard to do something for us. We say “Keyboard, run 
		your next() function.” The Scanner object will pause the program and wait for the human to type 
		something. Once the human types something and presses Enter, the Scanner object will package it 
		into a String and allow your code to continue.
		*/
		
		System.out.println("What is 6 multiplied by 7?");
		keyboard.nextint(); // accept only an int input
		
		System.out.println("Enter a number between 0.0 and 1.0.");
		keyboard.nextDouble(); // accept only a double input
		
		System.out.println("Is there anything else you would like to say?");
		keyboard.next();
		
	}
}