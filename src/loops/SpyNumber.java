package loops;

public class SpyNumber 
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
	public static void main(String[] args) 
	{
		System.out.println(spynum(123));
		
	}

}
