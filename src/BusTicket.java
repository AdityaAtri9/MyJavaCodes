
public class BusTicket 
{
	public static void ticket(String gender, int km)
	{
		float price = 0;
		if(gender == "Male")
		{
			price = 2*km;
			System.out.println(price);
		}
		else
		{
			System.out.println(0.0);
		}
	}
	public static void main(String[] args) 
	{
		ticket("Male",15);
		
	}

}
