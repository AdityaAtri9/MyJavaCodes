package Assignment;

//wajp to print even number within the range

public class Answer14 
{
	public static void printEven(int n)
	{
		int i = 0;
		
		for(i = 1; i <= n; i++)
		{
			if(i%2==0)
			{
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) 
	{
		printEven(5);
		
	}

}
