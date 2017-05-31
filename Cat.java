/*
All Cats are Animals but all Animals are not Cats
*/
public class Cat extends Animal {

public Cat()
{
super();
animalType="cat";
System.out.println("Now I am a Cat!");
}



public String purr(){
	return "purrr...";
}

}

