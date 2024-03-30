package logicalprog;

public class FactorsExcludingItself 
{
	public static void check(int n)
	{
		int i = 0;
		
		System.out.println("Factors excluding 1 and " + n);
		
		for(i = 2; i < n; i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		check(100);
		
	}

}
