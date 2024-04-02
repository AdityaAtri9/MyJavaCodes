
public class NumericCharToInt 
{
	public static int num(char ch)
	{
		int n = ch - 48; // 48 is the unicode of '0'
		return n;
	}
	public static void main(String[] args) 
	{
		System.out.println(num('7'));
		
	}

}
