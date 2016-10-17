import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double h, lb, bmi;
		
		System.out.println("Your height in feet: ");
		h = keyboard.nextDouble();
		
		System.out.println("Your weight in kilos: ");
		lb = keyboard.nextDouble();
		
		bmi= lb / (h*h);
		
		System.out.println("Your BMI is: "+bmi);
		
	}
}