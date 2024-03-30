package recursion;

public class PrintEven 
{
	public static void printEven(int n)
	{
		if(n == 10)
		{
			return;
		}
		
		if(n%2 == 0)
		{
			System.out.print(n+" ");
		}
		n++;
		printEven(n);
	}
	
	public static void printOdd(int n)
	{
		if(n == 10)
		{
			return;
		}
		
		if(n%2 != 0)
		{
			System.out.print(n+" ");
		}
		n++;
		printOdd(n);
	}
	
	public static void main(String[] args) 
	{
		printEven(1);
		System.out.println();
		printOdd(1);
		
	}

}
