package strings;

public class CharToString 
{
	public static String toString(char[] ch)
	{
		String res = "";
		for(int i = 0; i <= ch.length-1;i++)
		{
			res = res + ch[i];
		}
		return res;
	}
	public static void main(String[] args) 
	{
		char[] ch = {'A','D','I','T','Y','A'};
		String str = toString(ch);
		System.out.println(str);
//		System.out.println(toString(ch));
		
	}

}
