package Practice;

public class PrimeOrNot 
{
	public static boolean checkPrime(int n)
	{
		for(int i = 2; i < n; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void num(int x)
	{
		if(checkPrime(x))
		{
			System.out.println(x + " is prime number");
		}
		else
		{
			System.out.println(x + " is not prime number");
		}
	}
	public static void main(String[] args) 
	{
		num(6);
		
	}

}
