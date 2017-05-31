
/*
 * This is the parent class. Also called the super class
 */
public class Animal {
	public String animalType;
	public Animal() {
		System.out.println("A new animal has been created!");
	}
	public String sleep() {
		return animalType+"sleeps";
	}
	public String eat() {
		return animalType+"eats";
	}
	public String whatAmI(){
		return "I am a "+animalType;
	}
}

