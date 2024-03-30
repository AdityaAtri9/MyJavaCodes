package logicalprog;

public class CheckPrimeOrNot 
{
	public static String check(int n)
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
		System.out.println(c);
		if(c==0)
		{
			return "Prime number";
		}
		else
		{
			return "Not prime";
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(check(10));
		
	}

}
