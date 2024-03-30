package logicalprog;

public class SumOfFactors 
{
	public static void fac(int n)
	{
		int sum = 0;
		int i = 0;
		System.out.println("The sum of factors of " + n + " are");
		
		for(i = 1; i <= n; i++)
		{
			if(n%i==0)
			{
				sum = sum+i;
				System.out.println(sum);
			}
		}
	}
	public static void main(String[] args) 
	{
		fac(20);
	}

}
