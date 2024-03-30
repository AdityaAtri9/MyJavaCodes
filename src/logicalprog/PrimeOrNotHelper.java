package logicalprog;

public class PrimeOrNotHelper 
{
	public static void check(int n)
	{
		System.out.println(helper(n));
		
	}
	public static String helper(int x)
	{
		int i = 0;
		int c = 0;
		
		for(i=2; i<x; i++)
		{
			if(x%i==0) 
			{
				c++;
			}
		}
		System.out.println(c);
		
		if(c==0)
		{
			return "Prime number";
		}
		else
		{
			return "Not prime";
		}
		
	}
	public static void main(String[] args) 
	{
		check(10);
		
	}

}
