package Inheritance;

public class MainClass4 
{
	public static void main(String[] args) 
	{
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		System.out.println(c1.getMoney()+" "+c1.bike+" "+c1.car+" "+c1.getScooter());
		System.out.println(c2.getMoney()+" "+c2.getScooter());
		
	}

}
