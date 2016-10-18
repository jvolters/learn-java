// RudeQuestions
// Storing input
import java.util.Scanner;

public class StoringInput {
	public static void main(String [] args) {
		String name, answer; // answer is for drill
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello. What is your name?");
		name = keyboard.next();
		
		System.out.println("Hi, "+name+"! How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("So you're "+age+", eh? That's not very old.");
		System.out.println("How much do you weigh, "+name+"?");
		weight = keyboard.nextDouble();
		
		System.out.println(weight+"! Better keep that quiet!!");
		System.out.println("Finally, what's your income, "+name+"?");
		income=keyboard.nextDouble();
		
		System.out.println("I hope that is "+income+" per hour\n and not yearly income!");
		System.out.println("Well, thanks for answering my rude questions, "+name+".");
		
		System.out.println("Oh!  One more question... What is your favorite color?");
		answer = keyboard.next();
		System.out.println(answer+"? That is a hideous color.  You have bad taste in color!");
		System.out.println("Bye the way, I not only ask rude questions, I give rude responses!");
	}
}