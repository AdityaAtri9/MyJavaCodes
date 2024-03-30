package loops;

public class EvenDigits 
{
	public static void evenDig(int n)
	{
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				System.out.print(rem+" ");
			}
			n=n/10;
		}
	}
	public static void main(String[] args) 
	{
		evenDig(267235);
		
	}

}
