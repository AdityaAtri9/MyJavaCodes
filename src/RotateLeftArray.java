import java.util.Scanner;

public class RotateLeftArray 
{
	public static int[] rotate(int[] num)
	{
		int first = num[0]; // Storing first element
		for(int i = 0; i <= num.length-2; i++)
		{
			num[i] = num[i+1];
		}
		num[num.length-1] = first;
		
		for(int i = 0; i <= num.length-1; i++)//printing array
		{
			System.out.print(num[i] + " ");
		}
		return num;
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
		rotate(num);
		
	}
}
