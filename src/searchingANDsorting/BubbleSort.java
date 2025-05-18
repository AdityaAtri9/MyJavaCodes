package searchingANDsorting;
import java.util.Scanner;

public class BubbleSort 
{
	public static void sort(int[] n)
	{
		int c = 0; // for counting number of iterations

		for(int i = 0; i <= n.length-1; i++)
		{
			boolean b = false; //if the array is already sorted like 1 2 3 4 5 6
                               //then it will go for only 1 pass(i.e. 5 iterations that means size X size-1). 
			for(int j = 0; j <= n.length-2; j++)
			{
				c++;
				if(n[j] > n[j+1])
				{
					b = true;
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp;
				}
			}
			if(b == false) // for reducing number of iterations
			{
				break;
			}
		}
		System.out.println("Total iterations - "+c);
		printArray(n);
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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size - ");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		
		System.out.println("Enter integer elements - ");
		for(int i = 0; i <= num.length-1; i++)
		{
			num[i] = sc.nextInt();
		}
		sort(num);
	}

}
