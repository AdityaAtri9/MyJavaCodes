import java.util.Scanner;

public class Bank {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Withdraw
		long balance = 75000;
		
		System.out.println("Enter the amount");
		long amount = sc.nextInt();
		balance = balance - amount;
		
		if (amount <= balance) {
			System.out.println(balance);
		}else {
			System.out.println("You have insufficient balance");
		}
		
		

	}

}
