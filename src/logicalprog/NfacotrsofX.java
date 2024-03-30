package logicalprog;

public class NfacotrsofX 
{
	public static void check(int n)
	{
		
		System.out.println("Factors are - " + helper(n));
		
		
	}
	public static String helper(int x)
	{
		int i = 0;
		String f = "";
		for(i = 2; i<x; i++)
		{
			if(x%i==0)
			{
				
				f = f+i+" ";
				
			}
			
		}
		return f;

	}
	public static void main(String[] args) 
	{
		check(20);
		
	}

}
