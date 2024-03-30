package Inheritance;

//Single Inheritance

public class MainClass1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started.\n");
		
		Demo2 d1 = new Demo2();
		System.out.println("y value: " + d1.y);
		d1.disp();
		
		System.out.println();
		
		System.out.println("x value: " + d1.x);
		d1.test();
		
		System.out.println();
		
		System.out.println("Main method ended.");
		
	}

}
