package Practice;

public class AnimalFactory 
{
	static Lion getLion()
	{
		return new Lion();
	}
	
	static Sheep getSheep()
	{
		return new Sheep();
	}
	
	public static void main(String[] args) 
	{
		Lion l1 = new Lion();
		
		l1.name = "Simba";
		l1.age = 6;
		
		l1.details();
		l1.eat();
	}

}
