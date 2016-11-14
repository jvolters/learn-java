/*
Assuming you did the last exercise, you have seen that some classes will not work properly if you
change their fields directly instead of going through their methods. 

In this exercise, you will learn how to put a stop to that.

You will also learn about something that wil make it easier for others to use your classes and 
make it safer, too.
*/

public class SphereCalc3 {
	
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
