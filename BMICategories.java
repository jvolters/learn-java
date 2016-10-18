// if else chains
import java.util.Scanner;

public class BMICategories{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double bmi;
		
		System.out.print("Enter you BMI: ");
		bmi=keyboard.nextDouble();
		
		System.out.print("BMI Category: ");
		if (bmi < 15.0){
			System.out.println("very severely underweight! Order this person a pizza!!");
		}
		else if (bmi <=16.0){
			System.out.println("severely underweight! You could stand to eat something.");
		}
		else if (bmi < 18.5) {
			System.out.println("underweight! Have a Big Mac.");
		}
		else if (bmi < 25.0) {
			System.out.println("Normal! You don't need to eat, or diet.");
		}
		else if (bmi < 30.0) {
			System.out.println("overweight! Have a salad bar, Porky.");
		}
		else if (bmi < 35.0) {
			System.out.println("moderately obese - time to order a bood work-up, I bet you have T2 diabetes.");
		}
		else if (bmi < 40.0) {
			System.out.println("severly obese - you are an oinker.  Time to cut back your food intake.");
		}
		else {
			System.out.println("morbidly obese...Trying for a heart attack huh?");
		}

	}
}