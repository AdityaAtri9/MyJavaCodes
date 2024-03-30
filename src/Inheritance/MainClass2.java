package Inheritance;

//Constructor Chaining

public class MainClass2 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started.\n");
		
		Demo5 d1 = new Demo5(true,5.6,123);
		
		System.out.println("x value: " + d1.x);
		System.out.println("y value: " + d1.y);
		System.out.println("z value: " + d1.z);
		
		System.out.println();
		System.out.println("Main method ended.");
		
	}

}
