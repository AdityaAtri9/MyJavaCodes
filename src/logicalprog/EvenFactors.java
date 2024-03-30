package logicalprog;

public class EvenFactors 
{
	public static void check(int n)
	{
		int i = 0;
		System.out.println("The even factors of "+n+ " are");
		
		for(i = 1; i <= n; i++)
		{
			if(n%i == 0 && i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		check(20);
		
	}

}
