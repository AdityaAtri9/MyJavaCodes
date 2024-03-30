package Assignment;

//wajp to print prime numbers within given range.

public class Answer17 
{
	public static boolean checkPrime(int n)
	{
		int i = 0;
		int c = 0;
		
		for(i = 2; i < n; i++)
		{
			if(n%i==0)
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
	public static void range(int e)
	{
		int i = 0;
		
		for(i = 2; i <= e; i++)
		{
			if(checkPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		range(100);
		
	}

}
