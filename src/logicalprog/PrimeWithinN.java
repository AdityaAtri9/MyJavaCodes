package logicalprog;

public class PrimeWithinN 
{
	public static void printPrime(int n)
	{
		int i = 0;
		
		for(i = 2; i < n; i++)
		{
			if(checkprime(i)) {
			System.out.print(i + " ");
			}
		}
		
	}
	public static boolean checkprime(int x)
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
		if(c==0)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		printPrime(20);
		
	}
}
