package strings;

import java.util.Scanner;

public class CharUpper 
{
	public static char upper(char ch)
	{
		if(ch >= 97 && ch <= 122)
		{
			ch = (char)(ch-32);
		}
		return ch;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a lowercase character");
		char ch = sc.next().charAt(0);
		sc.close();
		System.out.println(upper(ch));
	}

}
