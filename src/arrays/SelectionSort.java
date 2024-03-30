package arrays;
import java.util.Arrays;

public class SelectionSort 
{
	public static int[] sort(int[] n)
	{	
		printArray(n);
		for(int i = 0; i <= n.length-1; i++)
		{
			for(int j = i+1; j <= n.length-1; j++)
			{
				if(n[i] > n[j])
				{
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
			System.out.print(n[i]+" ");
		}
//		System.out.println(Arrays.toString(n));
//		printArray(n);
		return n;	
	}
	public static void printArray(int[] a)
	{
		for(int i = 0; i <= a.length-1; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int num[] = {2,3,1,4,1,2,5};
		sort(num);
	}

}
