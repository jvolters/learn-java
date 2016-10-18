// Exercise 36: Returning a Value from a Function
// passing parameters into a method
// returning a value from a method

/*
Some functions have parameters and some do not. Parameters are the only way to send values into
a function. There is also only one way to get a value out of a function: the return value.
This exercise gives an example of a function that has three parameters (the side lengths of a triangle)
and one response: the area of that triangle using Heron’s Formula.
*/
public class HeronsFormula {
	public static void main( String[] args ) {
		double a, g;
		String tws = "A triangle with sides ";

		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3,3,3 has area " + a );

		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3,4,5 has area " + a );
		
		g = triangleArea(7, 8, 9);
		System.out.println(tws + "7,8,9 has area " + g );

		System.out.println(tws + "5,12,13 has area " + triangleArea(5, 12, 13) );
		System.out.println(tws + "10,9,11 has area " + triangleArea(10, 9, 11) );
		System.out.println(tws + "8,15,17 has area " + triangleArea(8, 15, 17) );
	}

// This function computes the area of a triangle with side lengths a, b, & c.
	public static double triangleArea( int a, int b, int c ) {
		double s, A;

		s = (a+b+c) / 2;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );

	// After computing the area, you must "return" the computed value:
	return A;
	}
}