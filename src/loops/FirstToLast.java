package loops;

public class FirstToLast 
{
	public static int rotate(int n)
	{
		
		int res = 1;
		int t = n;
		
		while(t>9)
		{
			res = res * 10;
			t = t/10;
		}
		int first = n/res;
		int last = n%res;
		n = last*10+first;
		return n;
	}
	public static void main(String[] args) 
	{
		System.out.println(rotate(1234));
		
	}

}
