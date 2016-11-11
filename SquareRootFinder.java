public class SquareRootFinder {

	double n;
	int iterations;

	public void setNumber( double number ) {
		n = number;
		iterations = 7;
		if ( n < 10 )
			iterations++;
	}

	public double getRoot() {
		double x = n/4;
		for ( int i=0; i<iterations; i++ ) {
			x = (x+(n/x))/2.0;
		}
		return x;
	}
}
/*
Why does the getRoot() method start out x with n/4? 
Why is iterations set to 7 inside setNumber()?
Why not 5 or 6 or 70?
Why don’t we let the user of the class pass in a value for iterations like we do for n?

The answer to all these questions is that sometimes the user of the class isn’t the 
same person as the creator of the class and sometimes the user doesn’t have the training 
and has better things to do or would probably mess these decisions up anyway.

For most programming tasks, there is more than one person involved. 

It is often better to let a single person say here is an object, you use it in this way: 
put in a number here and the answer will come out here. 

This is a form of information hiding called encapsulation, and it is one of the important
concepts in object-oriented programming.

In encapsulation, an object has fields and forces the user of the object to use the methods 
provided instead of messing with the variables directly. 

In this example, SquareRootFinder allows the user of the class to pass in a value for n through 
the setNumber() method but does not allow them to pass in a value for iterations.
*/