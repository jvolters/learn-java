public class SphereCalc2 {
	double radius, area, volume;

	public void setRadius( double r ) {
		radius = r;
		area = 4*Math.PI*r*r;
		volume = 4*Math.PI*Math.pow(r,3) / 3.0;
	}

	public double getRadius() {
		return radius;
	}

	public double getSurfaceArea() {
		return area;
	}

	public double getVolume() {
		return volume;
	}
}
/*
SphereCalc2 has one serious problem, however. 
Well, it is more like a vulnerability than a problem.
When someone is using a SphereCalc2 object and they want to change the radius, 
we expect them to use the provided setRadius() method. 
We hope that is what they will do.
But as you might recall from TVActorDriver.java way back in Exercise 4, a driver 
class can access instance variables directly. 
At least, the way we have been writing them up to this point. 
What is to prevent someone from writing code like this?
SphereCalc2 sph = new SphereCalc2();
sph.setRadius(5);
sph.radius = 7; // OH NOES!
System.out.println( sph.getVolume() );
*/
