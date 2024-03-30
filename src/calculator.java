import java.util.Scanner;

public class calculator 
{
	public static void cal(char a, int x, int y)
	{
		
		
		switch(a)
		{
		case '+':System.out.println(x + y);
		break;
		case '-':System.out.println(x - y);
		break;
		case '*':System.out.println(x * y);
		break;
		case '/':System.out.println(x / y);
		break;
		default:System.out.println("Invalid");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator +, -, *, / ");
		char q = sc.next().charAt(0);
		System.out.println("Enter two numbers");
		int r = sc.nextInt();
		int s = sc.nextInt();
		cal(q,r,s);
		
	}

}
