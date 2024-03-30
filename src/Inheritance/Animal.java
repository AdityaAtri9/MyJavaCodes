package Inheritance;

public class Animal 
{
	String name;
	int age;
	Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

}

class Dog extends Animal
{
	Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	String sound = "bark";
}

