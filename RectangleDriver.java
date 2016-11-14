public class RectangleDriver{
	public static void main(String[] args) {
		/* --- this was the old way --- */
		// Rectangle r = new Rectangle();
		// r.length = 10;
		// w.width = 5;
		
		/* ----- below is the new way ----- */
		Rectangle r =  new Rectangle( 10, 5 ); // works because of the constructor
		System.out.println("The area is: "+ r.getArea() );
	}
}