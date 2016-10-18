// Calling a Function (technically a method since Java doesn't have Functions)
public class ThereAndBackAgain{
	public static void main(String[] args){
		System.out.println("Here. ");
		erebor();
		System.out.println("Back first time. ");
		erebor();
		System.out.println("Back second time. ");
	}
	
	public static void erebor() {
		System.out.println("There. ");
	}
	
}
