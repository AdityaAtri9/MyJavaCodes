package Practice;

public class FirstNonNonRepeating 
{
	static final int max = 52;
	
	static char nonRepeatingChar(String s) {
		
		int[] freq = new int[max];
		
		for(char c : s.toCharArray())
		{
			if (Character.isLowerCase(c)) {
                freq[c - 'a']++;
            } else if (Character.isUpperCase(c)) {
                freq[c - 'A' + 26]++; 
            }
		}
		
		 for (int i = 0; i < s.length(); ++i) {
	            char c = s.charAt(i);
	            if ((Character.isLowerCase(c) && freq[c - 'a'] == 1) ||  //it is checking for lowercase
	                (Character.isUpperCase(c) && freq[c - 'A' + 26] == 1)) { // it is for checking uppercase
	                return c;
	            }
	        }
	
	return '*';
}
	
	public static void main(String[] args) 
	{
		String s = " Swiss";
		System.out.println(nonRepeatingChar(s));
		
	}
}
