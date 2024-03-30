package arrays;

public class Basic 
{
	public static void insert(int n)
	{
		int arr[] = new int[n];
		
		for(int i = 1; i<=n-1; i++)
		{
//			int arr[] = {i};
			System.out.println(arr[i]);
			
//			System.out.println(arr[i]);		
		}
	}
	public static void main(String[] args) 
	{
		insert(5);
		
	}

}
