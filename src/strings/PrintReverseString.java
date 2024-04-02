package strings;


public class PrintReverseString 
{
	public static void print(String str)
	{
		String rev = "";
		for(int i = 0; i <= str.length()-1; i++)
		{
			rev = str.charAt(i)+rev;
		}
		
//		OR
		
//		for(int i = str.length()-1; i >= 0; i--)
//		{
//			rev = rev + str.charAt(i);
//		}
		System.out.println(rev);
	}
	public static void main(String[] args) 
	{
		print("hello");
		
	}

}
