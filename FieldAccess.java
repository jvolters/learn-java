public class FieldAccess {

	public String first; // public
	private String last; // private
	String nick;         // package private
	
	public FieldAccess() { // default (zero-argument) constructor
		first = last = nick = "";		
	}
	
	public FieldAccess ( String f, String l, String n ) { // constructor
		first = f;
		last = l;
		nick = n;
	}
	
	public void setFirst( String s ) { // setter
		first = s;
	}
	
	public void setLast( String s ) { // setter
		last = s;
	}
	
	public void setNick( String s ) { // setter
		nick = s;
	}
	
	public String getFirst() { return first; } // getter
	public String getLast() { return last; }   // getter
	public String getNick() { return nick; }   // getter
	public String getFullName() { // getter
		return first + " \"" + nick + "\" "+ last;
	}
}