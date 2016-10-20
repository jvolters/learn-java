// Exercise 48: Arrays - Many Values in a Single Variable
// Arrays
public class ArrayIntro {
	public static void main( String[] args ) {
		String[] planets = { "Mercury", "Venus", "Earth", "Mars",
							 "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto" }; 
							 // I know, NDT can go jump.  Pluto IS A PLANET!!  
							 // You want to be remembered NDT? Do something really useful.
		// for each String 'p' in the array 'planets'...
		for ( String p : planets ) {
			System.out.println( p + "\t" + p.toUpperCase() );
		}
	}
}