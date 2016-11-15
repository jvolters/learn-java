public class TweetDriver{
	public static void main(String[] args) {
		Tweet t = new Tweet( "Thu Feb 19 20:29:00 +0000 2105", 8, true,
			568507566168223744L, 2, false,
			"You can now buy 'Learn Java the Hard Way' using bitcoin! Probably!"
			+ "\nThanks, @stripe ! #ljthw"
		);
		
		System.out.println( t.toString() );
		System.out.println("\n------------------------\n");
		System.out.println( t );
	}
}
/*
On line 11 we are attempting to print the entire object itself! 
Normally this would display a weird jumble of letters, but since 
our object defined a public method called toString(), the Java
compiler will print out what toString() returns instead of the 
object itself.
*/