/*
This is a tester for SphereCalc4 that makes it much easier to add additional tests
without adding any extra code!
This code uses arrays of doubles to hold the expected inputs and outputs, and they 
are in the same order in each array so that areas[0] holds the expected area output 
for radius inputs[0] and volumes[0] holds the corresponding expected volume. 
Arrays used like this are called parallel arrays.
*/
public class BetterTesting {
	public static void main( String[] args ) {

	double[] inputs = {
		5,
		0.1,
		3.3,
		20000,
		8
	};
	double[] areas = {
		314.159265359,
		0.125663706,
		136.84777599,
		5026548245.743669104,
		804.247719319
	};
	double[] volumes = {
		523.598775598,
		4.18879E-3,
		150.532553589,
		3.3510321638291125E13,
		2144.660584851
	};
	int passed = 0;
	double r, a, v, A, V;

	SphereCalc4 c = new SphereCalc4(0);
	for ( int i=0; i<inputs.length; i++ ) {
		// pull out the expected radius, area and volume into r, a, & v
		r = inputs[i];
		a = areas[i];
		v = volumes[i];

		c.setRadius(r);
		A = c.getSurfaceArea();
		V = c.getVolume();
		if ( isNear(A, a) )
			passed++;
		else {
			System.out.print("FAIL: surfaceArea for radius " + r );
			System.out.println("-- Expected " + a + ", got " + A);
		}
		if ( isNear(V, v) )
			passed++;
		else {
			System.out.print("FAIL: volume for radius " + r );
			System.out.println("-- Expected " + v + ", got " + V);
		}
	}

	if ( passed == 2*inputs.length )
		System.out.println("PASS: All tests passed.");
	}

	public static boolean isNear( double a, double b ) {
		return Math.abs(a-b) < 1E-9;
	}
}