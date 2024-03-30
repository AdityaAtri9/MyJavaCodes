package Inheritance;

//Constructor Chaining

public class Demo3 
{
	int x;
	Demo3(int x)
	{
		System.out.println("Running Demo3(int) constructor.");
		this.x=x;
	}

}
class Demo4 extends Demo3
{
	double y;
	Demo4(double y, int x)
	{
		super(x);
		System.out.println("Running Demo4(double,int) constructor.");
		this.y=y;
	}

}
class Demo5 extends Demo4
{
	boolean z;
	Demo5(boolean z, double y, int x)
	{
		super(y,x);
		System.out.println("Running Demo5(boolean,double,int) constructor.");
		this.z=z;
	}

}
