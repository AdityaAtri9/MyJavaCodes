package Inheritance;

//Single Inheritance

public class Demo1 
{
	int x = 10;
	void test()
	{
		System.out.println("Running test method.");
	}
}

class Demo2 extends Demo1
{
	int y = 20;
	void disp()
	{
		System.out.println("running disp() method.");
	}
}
