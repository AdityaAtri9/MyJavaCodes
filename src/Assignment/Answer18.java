package Assignment;

//wajp to print n prime numbers.

public class Answer18 
{
	public static boolean checkPrime(int n)
	{
		int i = 0;
//		int c = 0;
		if(n <= 1)
		{
			return false;
		}
		for(i = 2;i < n;i++)
		{
			if(n%i==0)
			{
				return false;
//				c++;
			}
		}
//		if(c==0) --------> this is another way or we can directly return false in the loop itself.
//		{
//			return true;
//		}
//		return false;
		return true;
	}
	public static void printNPrime(int num)
	{
		int c = 0;
		for(int i = 2;c < num; i++)
		{
			if(checkPrime(i))
			{
				System.out.print(i+" ");
				c++;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		printNPrime(17);
		
	}

}
	