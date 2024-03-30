public class Icecream {


    static void getPrice(int flavourCode, boolean topings, boolean dryFruits) 
    {
    	int price = 0; String flavour = null;
    	
    	if(flavourCode == 1) {
    		price = 100; flavour = "Vanilla";
    	}
    	if(flavourCode == 2) {
    		price = 125; flavour = "Dragon";
    	}
    	if(flavourCode == 3) {
    		price = 140; flavour = "kiwi";
    	}
    	if(topings == true) {
    		price = price + 10;
    	}
    	if(dryFruits == true) {
    		price = price + 15;
    	}
    	float gst = price * 0.18f;
    	float withoutGst = price - gst;
    	float withGst = price + gst;
    	System.out.println("You selected " + flavour);
    	System.out.println("Price is :" + price);
    	System.out.println("Total GST " + gst);
    	System.out.println("Price without 18% GST :" + withoutGst);
    	System.out.println("Price with 18% GST :" + withGst);
    
    }
    public static void main(String[] args) {
        // Example input
        getPrice(3, true, false);
    }
}
