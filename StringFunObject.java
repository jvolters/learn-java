public class StringFunObject{
	String message;
	
	public void setMessage( String s){
		message=s; // s parm value goes into instance var message
	}
	
	public String getMessage() { // no void as method returns message
		return message;
	}
	
	public void reverse() {
		String rev = "";
		for (int i=message.length() -1; i>=0; i--) // 0-based, start at and count down to 0.
			rev += message.substring(i,i+1);// start at right-most char, and load into rev.
		
		message = rev; // set message (reference?) equal to rev
	}
	
	public void reverse2() { // Study drill - take every other letter & reverse
		String rev = "";
		for (int i=message.length() -1; i>=0; i=i-2) // 0-based, start at and count down to 0.
			rev += message.substring(i,i+1);// start at right-most char, and load into rev. 
		
		message = rev; // set message (reference?) equal to rev
	}
	
	public void camelCase() {
		String[] words = message.toLowerCase().split(" ");
		String result = "";
		for ( String w : words )
		result += w.substring(0,1).toUpperCase() + w.substring(1); //public String substring(int beginIndex)
		/*
		The substring begins with the character at the specified index and extends to the end of 
		this string or up to endIndex – 1, if the second argument is given.
		*/

		message = result;
	}
}