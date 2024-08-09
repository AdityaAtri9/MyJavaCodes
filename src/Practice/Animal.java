package Practice;

public abstract class Animal 
{
	String name;
	int age;
	
	void details()
	{
		System.out.println("Name - "+this.name);
		System.out.println("Age - "+this.age);
	}
	 abstract void eat();
}

class Lion extends Animal
{
	void eat()
	{
		System.out.println(this.name+" eats flesh");
	}
}

class Sheep extends Animal
{
	void eat()
	{
		System.out.println(this.name+" eats grass");
	}
}
