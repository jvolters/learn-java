import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;
		
		System.out.println("Your height in meters: ");
		m = keyboard.nextDouble();
		
		System.out.println("Your weight in kilos: ");
		kg = keyboard.nextDouble();
		
		bmi= kg / (m*m);
		
		System.out.println("Your BMI is: "+bmi);
		
	}
}