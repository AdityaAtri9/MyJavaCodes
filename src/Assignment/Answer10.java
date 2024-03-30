package Assignment;

public class Answer10 
{
	public static void digits(int n)
	{
		int sum = 0;
		int prod = 1;
		while(n>0)
		{
			int rem = n%10;
			sum = sum + rem;
			prod = prod*rem;
			n = n/10;
		}
		System.out.println("Sum of digits is - " + sum);
		System.out.println("Product of digits is - " + prod);
	}
	public static void main(String[] args) 
	{
		digits(456);
		
	}

}
