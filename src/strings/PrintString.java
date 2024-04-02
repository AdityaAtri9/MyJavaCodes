package strings;

public class PrintString 
{
	public static void print(String str)
	{
		String res = "";
		for(int i = str.length()-1; i >= 0; i--)
		{
			res = str.charAt(i) + res;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		print("Hello");
	}

}
