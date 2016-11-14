public class SphereCalc {
	double radius;
	
	public void setRadius( double r ) { // mutator
		radius = r;
	}
	
	public double getRadius() { // accessor
		return radius;
	}
	
	public double getSurfaceArea() {
		return 4*Math.PI*radius*radius;
	}
	
	public double getVolume() {
		return 4*Math.PI*Math.pow(radius,3) / 3.0;
	}
}