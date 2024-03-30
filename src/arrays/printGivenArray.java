package arrays;

public class printGivenArray 
{
	public static void printArray(int arr[]) 
	{
		for(int i = 0; i <=arr.length-1; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) 
	{
		int num[] = {1,2,3,4,5};
		printArray(num);
		
	}
	

}
