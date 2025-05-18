package searchingANDsorting;

public class LinearSearch 
{
	public static int search(int[] num, int key)
	{
		for(int i = 0; i <= num.length-1; i++)
		{
			if(num[i] == key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int arr[] = {5,8,6,4,2,3,11,1};
		
		System.out.println(search(arr, 1));
		
	}

}
