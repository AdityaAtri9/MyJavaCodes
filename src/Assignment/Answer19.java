package Assignment;

/*wajp to print nth prime number.
input:-n=6
output:-13
*/
public class Answer19 
{
	public static boolean checkPrime(int n)
	{
		int i = 0;
		
		if(n <= 1)
		{
			return false;
		}
		
		for(i = 2; i < n; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void printNthPrime(int num)
	{
		int i = 0;
		int c = 0;
		int last = 0;
		for(i = 2; c < num; i++)
		{
			if(checkPrime(i))
			{
				last = i;
				c++;
			}
		}
		System.out.println(last);
	}
	public static void main(String[] args) 
	{
		printNthPrime(17);
	}

}
