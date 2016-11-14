/*
Assuming you did the last exercise, you have seen that some classes will not work properly if you
change their fields directly instead of going through their methods. 

In this exercise, you will learn how to put a stop to that.

You will also learn about something that wil make it easier for others to use your classes and 
make it safer, too.
*/

public class SphereCalc4 {
	
	private double radius, area, volume; // private access level modifier
	/*
	Instance variables are typically made private. 
	Almost always, as a matter of fact. 
	(You can designate methods as private instead of public, too, 
	but we will not see an example of that for a while.)
	Private means DO NOT TOUCH!
	Any private variable cannot be accessed in any way outside of the class where it is defined.
	Inside the class, private variables work just like the fields we have been using.
	Any method inside the class is free to change or access private variables just the same.
	Now the only way to change the value of radius is through the setRadius method!
	*/
	
	// Add constructor
	public SphereCalc4( double r ) {
		//radius = r;
		//area = 4*Math.PI*r*r;
		//volume = 4*Math.PI*Math.pow(r,3) / 3.0;
		setRadius( 5 ); // study drill; In SphereCalc4, edit the code inside the constructor 
		// so that it calls setRadius() instead of duplicating its code.
	}
		/*
	Lines 27 through 31 are the implementation of the constructor. 
	Notice on line 4 that unlike the setRadius() setter/mutator method, the constructor is not 
	void. 
	Constructors have no return type specifier at all; it’s just missing.
	Also notice that the constructor has the same name as the class itself. 
	This is required. 
	If you do those two things, then instead of having to remember to call some special method 
	to pass in initial values for the instance variables, you get to pass them in while you’re 
	instantiating the object.
	Which you would have to do anyway! Like so:
	SphereCalc4 sc = new SphereCalc4( 5 );
	*/
	
	public void setRadius( double r ) {
		radius = r;
		area = 4*Math.PI*r*r;
		volume = 4*Math.PI*Math.pow(r,3) / 3.0;
	}
	
	public double getRadius() { return radius; }
	public double getSurfaceArea() { return area; }
	public double getVolume() { return volume; }
}
