package loops;

public class ReverseTheNumber 
{
	public static int reverse(int n)
	{
		int  i = 0;
		
		while(n>0)
		{
			int rem = n%10;
			i = i*10+rem;
			n = n/10;
		}
		return i;
	}
	public static void main(String[] args) 
	{
		System.out.println(reverse(1234));
		
	}
}
