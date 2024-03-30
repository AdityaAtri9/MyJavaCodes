
public class Marks {
	
	static void Result (int p, int c, int m, int o) 
	{
		int total = p + c + m + o;
		
		if(p < 35 || c < 35 || m < 35 || o < 35) {
			
			System.out.println("Fail");
		}
		else {
			
			float perc = (total/400.0f)*100;
			System.out.println(perc);
			System.out.println("Pass");
		}
		
	}
	public static void main(String[] args) {
		Result(36,65,78,44);
	} 

}
