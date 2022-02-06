package oops;

class Cat{
	int noOfLegs;
	boolean hasFur;
	String breed,colour;
	
	public void eat() {
		System.out.println("Cat is eating ");
	}
	public void walk() {
		System.out.println("Cat is walking");
	}
	
	public void description() {
		System.out.println("my cat has"+noOfLegs+ "legs and" + hasFur);
	}
	
}

public class ClassesAndObjects {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.noOfLegs = 3;
		cat2.hasFur=false;
		
		cat1.walk();
		cat2.eat();
		cat1.description();
		
		

	}

}
