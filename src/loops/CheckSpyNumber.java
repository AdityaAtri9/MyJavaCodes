package loops;

public class CheckSpyNumber 
{
	public static boolean spynum(int n)
	{
		int sum = 0;
		int prod = 1;
		while(n>0)
		{
			int rem = n%10;
			sum = sum + rem;
			prod = prod * rem;
			n = n/10;
		}
		
		if(sum == prod)
		{
			return true;
		}
		return false;
	}
	
	public static void check(int s, int e)
	{
		for(int i = s; i <= e; i++)
		{
			if(spynum(i))
			{
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) 
	{
		check(1,10000);
		
	}

}
