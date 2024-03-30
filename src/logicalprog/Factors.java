package logicalprog;

public class Factors 
{
	public static void fac(int n)

	{
		int i = 0;
		System.out.println("Factors of "+ n + " are ");
		
		for(i = 1; i <= n; i++)
		{
			if(n%i==0)
			{
				System.out.print(" "+i);
			}
			
		}
	}
	public static void main(String[] args) 
	{
		fac(20);
		

	}

}
