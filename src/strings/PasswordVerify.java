package strings;
import java.util.Scanner;

public class PasswordVerify 
{
	public static String passwordCheck(String pswd)
	{
		if(pswd.length() < 8)
		{
			return "weak";
		}
		if(pswd.charAt(0) >= '0' && pswd.charAt(0) <= '9')
		{
			return "weak";
		}
		int spl = 0;
		int up = 0;
		for(int i = 0; i <= pswd.length()-1;i++) 
		{
			if(pswd.charAt(i) == ' ')
			{
				return "weak";
			}
			if(pswd.charAt(i) >= 65 && pswd.charAt(i) <= 90)
			{
				up++;
			}
			if(!(pswd.charAt(i) >= 65 && pswd.charAt(i) <= 90
			  ||(pswd.charAt(i) >= 97 && pswd.charAt(i) <= 122)
			  ||(pswd.charAt(i) >= 48 && pswd.charAt(i) <= 57)))
			{
				spl++;
			}
		}
		if(spl == 1 && up >= 1)
		{
			return "Strong";
		}
		return "weak";
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password");
		String str = sc.nextLine();
		System.out.println(passwordCheck(str));
		
	}

}
