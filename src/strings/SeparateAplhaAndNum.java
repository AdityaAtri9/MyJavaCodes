package strings;

import java.util.Scanner;

//Separate alphabets and numbers from a String

public class SeparateAplhaAndNum 
{
	public static String concat(char ch, int n)
	{
		String res = "";
		for(int i = 1; i <= n;i++)
		{
			res = res + ch;
		}
		return res;
	}
	public static String separate(String str)
	{
		String res = "";
		for(int i = 0; i <= str.length()-1; i++)
		{
			if(str.charAt(i) >= '1' && str.charAt(i) <= '9')
								// OR 
			//if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
			{
				res = res + concat(str.charAt(i-1), (str.charAt(i)-48)-1);
			}
			else
			{
				res = res + str.charAt(i);
			}
		}
		return res;
	}
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println(separate(str));
		}
//		System.out.println(concat('B', 4));		
	}

}
