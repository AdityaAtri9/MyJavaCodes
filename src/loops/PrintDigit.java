package loops;

public class PrintDigit 
{
	public static void printDig(int n)
	{
		while(n>0)
		{
			int rem=n%10;
			System.out.print(rem+" ");
			n=n/10;
		}
	}
	public static void main(String[] args) 
	{
		printDig(9283469);
		
	}

}
