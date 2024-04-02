package strings;

public class StringToChar 
{
	public static char[] toCharArray(String str)
	{
		char[] res = new char[str.length()];
		for(int i = 0;i <= str.length()-1;i++)
		{
			res[i] = str.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) 
	{
		String str = "ADITYA";
		char[] ch = toCharArray(str);
		System.out.println(ch);
//		System.out.println(toCharArray(str));
		
	}

}
