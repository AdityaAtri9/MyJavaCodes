package searchingANDsorting;

//[1,6,4,3,2,5]
public class InserstionSort 
{
	public static void sort(int[] arr, int key)
	{
		
		for(int i = 1; i <= arr.length-1; i++)
		{
			key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key )
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		for(int c = 0; c <= arr.length-1; c++)
		{
			System.out.print(arr[c] + " ");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {3,6,4,1,2,5};
		int key = 6;
		sort(arr,key);
		
	}

}
