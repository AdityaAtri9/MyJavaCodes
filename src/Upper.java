
import java.util.Scanner;

public class Upper 
{
	public static String check(char a)
	{
		if(a == 'A') 
		{
			return "A is selected";
		}
		else if(a == 'B') 
		{
			return "B is selected";
		}
		else if(a == 'C')
		{
			return "C is selected";
		}
		else if(a == 'D')
		{
			return "D is selected";
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
