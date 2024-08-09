package strings;
//GEEKS FOR GEEKS Parenthesis Checker
import java.util.Scanner;
import java.util.Stack;

public class BracketBalancing 
{
	public static boolean check(String str)
	{
		Stack<Character> s1 = new Stack<Character>();
		
		for(int i = 0; i <= str.length()-1; i++)
		{
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[')
			{
				s1.push(str.charAt(i));
			}
			else if(s1.isEmpty()==false && (s1.peek()=='{' && str.charAt(i)=='}'
				 || s1.peek()=='(' && str.charAt(i)==')'
				 || s1.peek()=='[' && str.charAt(i)==']'))
			{
				s1.pop();
			}
			else
			{
				s1.push(str.charAt(i));
			}
		}
		return s1.isEmpty();
		
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter brackets");
		String str = sc.nextLine();
		
		System.out.println(check(str));
		
	}

}
