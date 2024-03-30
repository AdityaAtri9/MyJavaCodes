package arrays;

public class reverseArray 
{
	public static void reverse(int num[])
	{
		int i = 0;
		
		for(i = num.length-1; i >= 0;i--)
		{
			System.out.print(num[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5};
		
		reverse(arr);
	}
}
