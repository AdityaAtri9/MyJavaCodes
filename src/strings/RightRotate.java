package strings;

public class RightRotate 
{
	public static String rotateRight(String str, int n)
	{
		n = n % str.length();
		
		str = str.substring(str.length()-n) + str.substring(0,str.length()-n);
		return str;
	}
	public static void main(String[] args) 
	{
		String str = "aditya";
		System.out.println(rotateRight(str, 2));
		
	}

}
