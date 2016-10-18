// Variables
// Saving information in Variables
public class CreatingVariables {
	public static void main(String[] args) {
		int x, y, age, year; // year added as drill
		double seconds, e, checking, doub; // doub added as drill
		String firstName, lastName, title, str1, str2; // str1 & str2 added as drill
		
		x=10;
		y=400;
		age=39;
		year=2016;
		
		seconds=4.71;
		e=2.71828182845904523536;
		checking=1.89;
		doub=3.1456;
		
		firstName="Randy";
		lastName="Volters";
		title="Mr.";
		str1="Howdy";
		str2=firstName;
		
		System.out.println( "|----------------------------------------------------------|" );
		System.out.println( "The variable \"x\" contains "+x );
		System.out.println( "The value "+y+" is stored in the variable \"y\"." );
		System.out.println( "The value "+year+" is stored in the variable \"year\"." );
		System.out.println( "The experiment took "+seconds+" seconds." );
		System.out.println( "A favorite irrational # is Euler's number: "+e );
		System.out.println( "Just another double "+doub+"!" );
		System.out.println( "Hopefully you have more $"+checking+"!" );
		System.out.println( "My name's "+title+" "+firstName+" "+lastName+"." );
		System.out.println( str1+" "+str2+"!" );
		System.out.println( "|----------------------------------------------------------|" );
		System.out.println( "| End Program..............................................|" );
	}
}