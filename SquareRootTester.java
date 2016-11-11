public class SquareRootTester {
	public static void main( String[] args ) {

		SquareRootFinder sqrt = new SquareRootFinder();

		double max = 0, maxN = 0;
		double fakeroot, realroot, diff;

		System.out.print("Testing square root algorithm... ");
		for ( double n = 0; n<=2000; n += 0.01 ) {
			sqrt.setNumber(n);
			fakeroot = sqrt.getRoot();
			realroot = Math.sqrt(n);
			diff = Math.abs( fakeroot - realroot );
			if ( diff > max ) {
				max = diff;
				maxN = n;
			}
		}

		if ( max > 0.000001 ) {
			System.out.println("FAIL");
			System.out.println("Worst difference was " + max + " for " + maxN );
		}
		else
		System.out.println("PASS");
	}
}
/*
In the tester program, we compare the output of the getRoot() method with the real square root 
as computed by Java’s built-in Math.sqrt(). 

We test every number from 0 to 2000, in increments of 0.01.

For each number, we find the absolute difference between my square root and the real square 
root, and if the worst difference is more than 0.000001, then we throw an error.
*/