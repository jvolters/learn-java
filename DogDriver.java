public class DogDriver {
	public static void main(String[] args) {
		Dog a = new Dog();
		
		Dog pal = new Dog("Lassie", "Rough Collie", 2, 26);
		Dog spike = new Dog("Yeller","Mastador", 5, 43);
		// study drill
		Dog suzee = new Dog( "Suzette", "French Std. Poodle", 6, 25 );
		
		System.out.println( pal.getName() + " is a " + pal.getBreed() +"." );
		System.out.println( spike.getName() + " is a " + spike.getBreed() +"." );
		//study drill
		System.out.println( suzee.getName() + " is a " + suzee.getBreed() + ", " 
		+ suzee.getAge() + " years old, " + suzee.getWeight() + "kg." );
		
		System.out.println( pal.getEverything() );
		System.out.println( a.getEverything() );
	}
}