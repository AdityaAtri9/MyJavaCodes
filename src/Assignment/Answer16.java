package Assignment;

//wajp to check given number is prime number or not

public class Answer16 
{
	public static void checkPrime(int n)
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
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not prime");
		}
	}
	public static void main(String[] args) 
	{
		checkPrime(7);
		
	}

}
