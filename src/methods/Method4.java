package methods;

public class Method4 {

	public static void main (String [] args) {
		
		foodName ("Steak");
		
		youWillNeed ("Meat, Olive oil, Salt, Black Pepper, Rosemary");
		
		wayOfCooking (10, "Grilling");
		
		ready ();
	}
	
	public static void foodName (String foodname) {
		
		System.out.println("Today we are cooking: " + foodname );
		
	}
	
    public static void youWillNeed (String weNeed) {
		
		System.out.println("We need following items: " + weNeed );
	
		
    }	
    public static void wayOfCooking (int minute, String way ) {
    	System.out.println("You need cook for " + minute+ " minutes by "
    			
    			+way);
    }
    
    public static void ready () {
		
		System.out.println("Meal is ready, Enjoy! ");
    } 
}
