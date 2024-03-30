package recursion;

public class Hello 
{
	public static void print(int n)
	{
		if(n == 0)
		{
			return;
		}
		System.out.print(n+" ");//push()
		n--;
		print(n);
//		System.out.print(n+" ");//pop()

//	or	print(n-1);
	}
	public static void main(String[] args) 
	{
		print(5);
		
	}

}
