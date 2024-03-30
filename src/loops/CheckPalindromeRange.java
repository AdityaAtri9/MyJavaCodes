package loops;

public class CheckPalindromeRange 
{
	public static boolean pal(int n)
	{
		int i = 0;
		int temp = n;
		
		while(n>0)
		{
			int rem = n%10;
			i = i*10+rem;
			n = n/10;
		}
		if(temp == i)
		{
			return true;
		}
		return false;
	}
	public static void check(int s, int e)
	{
		for(int j = s; j < e; j++)
		{
			if(pal(j)) 
			 {
			System.out.println(j);
			}
		}
	}

	public static void main(String[] args) 
	{
		check(1,1000);
		
	}
}
