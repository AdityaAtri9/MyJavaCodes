package Inheritance;

public class MainStudent 
{
	public static void main(String[] args) 
	{
		Student1 s1 = new Student1("Aditya","CSE",72,2024);
		Student1 s2 = new Student1("Divyam","CSE",52,2024);
		Student1 s3 = new Student1("Daman","ECE",99,2023);
		Student1 s4 = new Student1("Ankush","CSE",41,2024);
		Student1 s5 = new Student1("Deepak","ECE",68,2023);
		Student1 s6 = new Student1("Akash","CSE",72,2024);
		
		Student1 x[] = {s1,s2,s3,s4,s5,s6};
		
		for(int i = 0; i <= x.length-1; i++)
		{
//			System.out.println(x[i]);
			
			String a1 = x[i].qualification;
			double a2 = x[i].percentage;
			int a3 = x[i].yop;
			
//			if(a1.equalsIgnoreCase("cse") && a2 >= 60)
//			{
//				System.out.println(x[i]);
//			}
//			if((a3 == 2023) && (a2 >= 50))
//			{
//				System.out.println(x[i]);
//			}
			if(a3 == 2023 || a3 == 2024 && a2 >= 55)
			{
				System.out.println(x[i]);
			}
		}

		
		
	}

}
