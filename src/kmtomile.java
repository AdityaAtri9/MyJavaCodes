import java.util.Scanner;

public class kmtomile {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your distance in kilo meters :");
		
		float km = s.nextFloat();
		float miles = (0.621f)*km;
		
		System.out.println("Your distance in miles will be " + miles);
		

	}

}
