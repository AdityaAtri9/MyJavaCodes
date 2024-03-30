package loops;

public class CountDigit 
{
	public static void countDig(int n) 
	{
		int c = 0;
		while (n > 0) 
		{

			int rem = n % 10;

			System.out.print(rem + " ");
			n = n / 10;
			c++;

		}
		System.out.println("\nNumber of digits - " + c);
	}
	
	public static void main(String[] args) 
	{
		countDig(983769538);
	}

}
