package arrays;

public class ForEachLoop 
{
	public static void printArray(int[] n)
	{
		for(int a:n)
		{
			System.out.print(a+" ");
		}
	}

	public static void main(String[] args) 
	{
		int n[] = {1,2,3,4,5};
		printArray(n);
		
	}
}
