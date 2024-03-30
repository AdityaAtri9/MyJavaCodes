package loops;

public class SumDigits 
{
	public static void add(int n)
	{
		int sum = 0;
		while(n>0)
		{
			int rem =n%10;
			sum += rem;
			n=n/10;
		}
		System.out.print("The sum is - " + sum);
	}
	
	public static void mul(int x)
	{
		int prod = 1;
		while(x>0)
		{
			int rem = x%10;
			prod = prod*rem;
			x = x/10;
		}
		System.out.println("\nThe product is - " + prod);
		
	}
	public static void main(String[] args) 
	{
		add(23679689);
		mul(6798);
	}

}
