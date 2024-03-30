package loops;

public class CountEvenDigit 
{
	public static void countEven(int n)
	{
		int c = 0;
		while(n>0)
		{
			int rem = n%10;
			if(rem%2==0) 
			{
			System.out.print(rem + " ");
			c++;
			}
			n = n/10;
			
		}
		System.out.println("\nTotal Even digits - " + c);
	}
	public static void main(String[] args) 
	{
		countEven(2385687);
		
	}

}
