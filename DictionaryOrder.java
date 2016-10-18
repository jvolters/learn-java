// comparing strings for alpha ordering
// compareTo()
// toLowerCase()
import java.util.Scanner;

public class DictionaryOrder {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		System.out.print( "Make up the name of a programming language! " );
		name = keyboard.nextLine(); // nextLine() accepts multiple word inputs until ENTER is pressed.

	if ( name.compareTo("c++") < 0 )
		System.out.println( name + " comes BEFORE c++" );
	if ( name.compareTo("c++") == 0 )
		System.out.println( "c++ isn't a made-up language!" );
	if ( name.compareTo("c++") > 0 )
		System.out.println( name + " comes AFTER c++" );
	/*
	You compare Strings to each other using the String object’s .compareTo() method. The .compareTo()
	method doesn’t work the way you probably expect, but there is genius in how it works.
	The comparison involves two Strings. The first String is the one to the left of the .compareTo(). The
	second String is the one in the parentheses. And the comparison simplifies to an integer! If we call
	the first one self and the second one other it would look like this:
	int n = self.compareTo(other);
	So self compares itself to other. If self is identical to other (the same length and every character the
	same), then n would be set to 0. If self comes before other alphabetically, then n would be set to a
	negative number (a number less than 0). And if self comes after other alphabetically, then n would
	be set to a positive number (a number greater than 0).
	*/

	if ( name.toLowerCase().compareTo("go") < 0 )
		System.out.println( name + " comes BEFORE go" );
	if ( name.toLowerCase().compareTo("go") == 0 )
		System.out.println( "go isn't a made-up language!" );
	if ( name.toLowerCase().compareTo("go") > 0 )
		System.out.println( name + " comes AFTER go" );

	if ( name.toLowerCase().compareTo("java") < 0 )
		System.out.println( name + " comes BEFORE java" );
	if ( name.toLowerCase().compareTo("java") == 0 )
		System.out.println( "java isn't a made-up language!" );
	if ( name.toLowerCase().compareTo("java") > 0 )
		System.out.println( name + " comes AFTER java" );

	if ( name.toLowerCase().compareTo("lisp") < 0 )
		System.out.println( name + " comes BEFORE lisp" );
	if ( name.toLowerCase().compareTo("lisp") == 0 )
		System.out.println( "lisp isn't a made-up language!" );
	if ( name.toLowerCase().compareTo("lisp") > 0 )
		System.out.println( name + " comes AFTER lisp" );

	if ( name.toLowerCase().compareTo("python") < 0 )
		System.out.println( name + " comes BEFORE python" );
	if ( name.toLowerCase().compareTo("python") == 0 )
		System.out.println( "python isn't a made-up language!" );
	if ( name.toLowerCase().compareTo("python") > 0 )
		System.out.println( name + " comes AFTER python" );

	if ( name.toLowerCase().compareTo("ruby") < 0 )
		System.out.println( name + " comes BEFORE ruby" );
	if ( name.toLowerCase().compareTo("ruby") == 0 )
		System.out.println( "ruby isn't a made-up language!" );
	if ( name.toLowerCase().compareTo("ruby") > 0 )
		System.out.println( name + " comes AFTER ruby" );

	if ( name.toLowerCase().compareTo("visualbasic") < 0 )
		System.out.println( name + " comes BEFORE visualbasic" );
	if ( name.toLowerCase().compareTo("visualbasic") == 0 )
		System.out.println( "visualbasic isn't a made-up language!" );
	if ( name.toLowerCase().compareTo("visualbasic") > 0 )
		System.out.println( name + " comes AFTER visualbasic" );
	}
}