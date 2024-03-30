package logicalprog;

public class SumOfEvenFactors 
{
	public static void add(int n)
	{
		int i = 0;
		int sum = 0;
		System.out.println("The sum of even factors of " + n + " are");
		
		for(i = 1; i <= n; i++)
		{
			if(n%i==0 && i%2==0)
			{
				sum = sum + i;
				System.out.println(sum);
			}
		}
	}
	public static void main(String[] args) 
	{
		add(100);
		
	}

}
