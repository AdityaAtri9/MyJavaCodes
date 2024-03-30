package Inheritance;

public class Father 
{
	private long money = 1000000000000000000L;
	String car = "Rolls-Royce";
	String bike = "Ninja H2";
	private String scooter = "C-650 GT";
	
	
//	@Override
//	public String toString() {
//		return this.money+" "+this.car+" "+this.bike+" "+this.scooter;
//	}

	public long getMoney()
	{
		return this.money;
	}
	
	public String getScooter()
	{
		return this.scooter;
	}
}
class Child1 extends Father
{
	
}
class Child2 extends Father
{
	
}

