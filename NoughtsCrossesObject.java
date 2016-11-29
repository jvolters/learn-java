public class NoughtsCrossesObject {
	
	// Instance Variables
	private String[][] board;
	private int turns;
	
	// Constructor - SET UP A BLANK BOARD AND SET TURNS COUNT TO 0
	public NoughtsCrossesObject()
	{
		board = new String[3][3];
		turns = 0;
		
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = " ";
	}
	
	// Accessor Methods
	public boolean isWinner ( String p ){ // checks to see if someone has won
		// top row
		if ( winCheck(p, 0,0, 0,1, 0,2) ) return true;
		// middle row
		if ( winCheck(p, 1,0, 1,1, 1,2) ) return true;
		// bottom row
		if ( winCheck(p, 2,0, 2,1, 2,2) ) return true;
		// left column
		if ( winCheck(p, 0,0, 1,0, 2,0) ) return true;
		// middle column
		if ( winCheck(p, 0,1, 1,1, 2,1) ) return true;
		// right column
		if ( winCheck(p, 0,2, 1,2, 2,2) ) return true;
		// diagonal top-left to bottom-right
		if ( winCheck(p, 0,0, 1,1, 2,2) ) return true;
		// diagonal bottom-left to top-right
		if ( winCheck(p, 2,0, 1,1, 0,2) ) return true;
		
		return false; // if you pick the wrong coordinates
	}
	
	// helper method for isWinner... checks if row a and column b has the same letter 
	// in row c and column d and if that is also in row e and column f and returns true 
	// if this is the case.
	private boolean winCheck( String p, int a, int b, int c, int d, int e, int f ){
		return board[a][b].equals(board[c][d])
		&& board[a][b].equals(board[e][f]);
	}
	
	public boolean isFull() { // if all the squares are used up, then the game is over
		if ( turns == 9 )
			return true;
		else
			return false;
		// return turns == 9 // (another way to do what is done above.)
	}
	
	public boolean isCat(){
		return isFull() && !isWinner("X") && !isWinner("O"); // full but no winner
	}
	
	public boolean isValid( int r, int c ){
		if ( 0 <= r && r <=2 && 0 <= c && c <=2 ) // if r and c are both between 0 and 2
			return true;
		else
			return false;
	}
	
	public int numTurns() { // returns the value of turns
		return turns;
	}
	
	public String playerAt( int r, int c){ // returns the "X" or "O" in the requested coordinate; else "@"
		if ( isValid(r,c) )
			return board[r][c];
		else
			return "@";
	}
	
	public boolean isTaken( int r, int c ){ // check is coordinate is either X or O
		String p = playerAt(r,c);
		if ( p.equals(" ") )
			return false;
		else 
			return true;
	}
	
	public String toString() {  // draws the board
		String out = ""; // init
		out += "  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "\n";
		out += "   --+-+--" + "\n";
		out += "  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "\n";
		out += "   --+-+--" + "\n";
		out += "  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "\n";
		out += "     0 1 2 " + "\n";
		return out;
	}
	
	// Modifer / Mutator Method
	public void playMove( String p, int r, int c ){ // changes board, stores move and increments turns
		board[r][c] = p;
		turns++;
	}
}