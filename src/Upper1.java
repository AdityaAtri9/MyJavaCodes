import java.util.Scanner;

public class Upper1 
{
	public static String check(char a)
	{
		if(a == 'A' || a == 'B' || a == 'C' || a == 'D')
		{
			return a + " is selected";
		}
		else
		{
			return "Invalid";
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char");
		char ch = sc.next().charAt(0);
		System.out.println(check(ch));
		sc.close();
	}

}
