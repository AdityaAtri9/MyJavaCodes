package arrays;

public class EvenNumbersInArray 
{
	public static void printEven(int[] n)
	{
		int c = 0;
		for(int a:n)
		{
			if(a%2==0)
			{
				System.out.print(a + " ");
				c++;
			}
		}
		System.out.println("\n There are total "+c+" even numbers.");
	}
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		printEven(arr);
		
	}

}
