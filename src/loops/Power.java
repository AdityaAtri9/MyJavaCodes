package loops;

public class Power 
{
	public static int pow(int b, int p)
	{
		int i = 0;
		int c = b;
		if(p == 0)
		{
			return 1;
		}
		if(p == 1)
		{
			return b;
		}
		for(i = 2; i <= p; i++)
		{
			b = b*c;
		}
		return b;
	}
	public static void main(String[] args) 
	{
		System.out.println(pow(12,2));		
	}

}
