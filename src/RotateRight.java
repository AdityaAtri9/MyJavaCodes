import java.util.Scanner;

public class RotateRight 
{
	public static int[] rotate(int[] num)
	{
		int last = num[num.length-1]; // Storing first element
		for(int i = num.length-1; i >= 1; i--)
		{
			num[i] = num[i-1];
		}
		num[0] = last;
		printArray(num);
		return num;
	}
	public static void printArray(int[] n)
	{
		for(int i = 0; i <= n.length-1; i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		int[] num = new int[n];
		System.out.println("Enter int elements");

		for(int i = 0; i <= num.length-1; i++)
		{
			num[i] = sc.nextInt();
		}
		sc.close();
		rotate(num);

	}

}
