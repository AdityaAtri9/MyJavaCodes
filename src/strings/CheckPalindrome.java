package strings;

public class CheckPalindrome 
{
	public static void print(String[] str)
	{
		for(int i = 0; i <= str.length-1; i++)
		{
			if(check(str[i]))
			{
				System.out.println(str[i]);
			}
		}
	}
	
	public static boolean check(String s)
	{
		String res = "";
		for(int i = 0; i <= s.length()-1; i++)
		{
			res = s.charAt(i)+res;
		}
		if(s.equals(res))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		String[] str = {"hello","aba","madam","abc"};
		print(str);
	}

}
