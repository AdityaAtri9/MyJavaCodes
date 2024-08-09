package Practice;

public class MainClass4 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Aditya", 5000000);
		Employee e2 = new Employee("Ankush", 4000000);
		
		Bike b1 = new Bike("H2R", 4000000);
		Bike b2= new Bike("Hayabusa", 1800000);
		
		Object[] o1 = {e1,b1,e2,b2};
		
		for(int i = 0; i <= o1.length-1; i++)
		{
			if(o1[i] instanceof Bike)
			{
//			System.out.println(o1[i]);
				Bike b = (Bike)o1[i];
				System.out.println(b);
			}
			else
			{
			Employee e = (Employee)o1[i];
			System.out.println(e);
			}
		}
		
		
	}

}
