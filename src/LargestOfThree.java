
public class LargestOfThree 
{
	public static int largest(int a, int b, int c)
	{
		if(a>b && a>c) 
		{
			System.out.println("the largest number is " + a);
		}
		else if(b>a && b>c) 
		{
			System.out.println("The largest number is " + b);
		}
		else 
		{
			System.out.println("The largest number is " + c);
		}
		return 0;
	}
	public static void main(String[] args) {
		largest(5,7,12);
	}

}
