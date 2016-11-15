// Excercise 13: Default Values for Fields
public class Dog {
	private String name, breed;
	private int age;
	private double weight;
	
	public Dog() {} // default constructor
	
	public Dog( String n, String b, int a, double w ){ // constructor
		name = n;
		breed = b;
		age = a;
		weight = w;
	}
	
	public String getName() { return name ;}
	public String getBreed() { return breed; }
	public int getAge() { return age; }
	public double getWeight() { return weight; }
	
	public String getEverything() {
		return name + " is a " + breed + ", " + age + " years old, " 
		+ weight + " kg."; // nice string suitable for printing :-)
	}
}