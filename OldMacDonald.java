/*
Lines 19 to 34 define the class that matches the name of the Java file. 
Notice that in this file, the class OldMacDonald has the keyword public in front, 
but none of the other classes do. 
In Java, each file may only have one public class in it, and the name of that public 
class has to match the name of the file.
This class contains the main() method in it, which is where the Java Virtual Machine 
begins when executing a file. 
The OldMacDonald class is listed after the other classes in the file, but it would work
the same if the classes were in a different order.
*/
class Cow {
	public void moo() {
		System.out.println("Cow says moo. ");
	}
}

class Pig {
	public void oink() {
		System.out.println("Pig says oink. ");
	}
}

//class Duck {
//	public void quack(){
//		System.out.println("Duck says quack. ");
//	}
//}

public class OldMacDonald{
	public static void main(String[] args){
		Cow maudine = new Cow();
		Cow pauline = new Cow();
		maudine.moo();
		pauline.moo();
		
		Pig snowball = new Pig();
		snowball.oink();
		snowball.oink();
		
		Duck ferdinand = new Duck();
		ferdinand.quack();
		// study drill #2
		Duck daffy = new Duck();
		daffy.quack();
	}
}

// study drill #1 - relocating a class doesn't affect the program's ability to run
class Duck {
	public void quack(){
		System.out.println("Duck says quack. ");
	}
}
