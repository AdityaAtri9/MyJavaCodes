package Inheritance;

public class MainClass3 
{
	public static void main(String[] args) {
	Watch w1 = new Watch("G-Shock",5999);
	Watch w2 = new Watch("Rolex",1600000);
	Bike b1 = new Bike("Super meteor 650",475000);
	Bike b2 = new Bike("Ninja H2R",4500000);
	Student2 s1 = new Student2("Aditya","B.Tech",93.5f);
	Student2 s2 = new Student2("Ankush","B.Tech",92.4f);
	Pen p1 = new Pen("Cello","Blue",10);
	Pen p2 = new Pen("Pilot","Blue",40);
	
	Object x[] = {w1,w2,b1,b2,s1,s2,p1,p2};
	
	for(int i = 0; i <= x.length-1; i++)
	{
		if(x[i] instanceof Student2)
		{
			System.out.println(x[i]);
		}
	}
  
  }
	
}
