package Assignment;

public class Answer1 
{
	public static void fac(int n)
	{
		int x = 1 ;
		int i;
		for(i = 1; i <= n; i++)
		{
			x = i*x;	
		}
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		fac(10);
		
	}


}
