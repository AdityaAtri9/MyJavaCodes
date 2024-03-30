
public class banking 
{
	public static void deposit(int balance, int amount, boolean panCard)
	{
		
		if (amount < 100000 || panCard == true) 
		{
			System.out.println("Amount deposited");
			balance = amount + balance;
			System.out.println(balance);
		}
		else
		{
			System.out.println("Pancard rquired\nLink your pancard");

		}
		
	}
	public static void main(String[] args) 
	{
		deposit(5000, 1000970, false);
		
	}

}
