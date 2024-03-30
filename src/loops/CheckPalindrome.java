package loops;

public class CheckPalindrome 
{
	public static boolean pal(int n)
	{
		int  i = 0;
		int temp = n;
		
		while(n>0)
		{
			int rem = n%10;
			i = i*10+rem;
			n = n/10;
		}
		if(temp==i)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		System.out.println(pal(1234321));
		
	}
}
