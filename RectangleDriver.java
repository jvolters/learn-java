public class RectangleDriver{
	public static void main(String[] args) {
		/* --- this was the old way --- */
		// Rectangle r = new Rectangle();
		// r.length = 10;
		// w.width = 5;
		
		/* ----- below is the new way ----- */
		Rectangle r =  new Rectangle( 10, 5 ); // works because of the constructor
		System.out.println("The area is: "+ r.getArea() );
		
		// study drill below; quck and dirty addition of 2 more rectangles.
		Rectangle r2 =  new Rectangle( 15, 5 ); // works because of the constructor
		System.out.println("The area is: "+ r2.getArea() );
	
	    Rectangle d2 =  new Rectangle( 20, 10 ); // works because of the constructor
		System.out.println("The area is: "+ d2.getArea() );
	}
	
}