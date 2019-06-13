package methods;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		askHowRU ();
		 reply ();
		 sayBy();
		System.out.println("Bye!"); // we can mix with loop and some statements with method
		whatsName("Nazim");
		
		
		String nameofOnline= "Umit";  // bu sekilde de yapabilirsin yine yazdirir
		whatsName(nameofOnline);
	}

	public static void askHowRU () {
	
		System.out.println("How are you doing?");
	
	}
	public static void reply () {
		
		System.out.println("I'm doing well. What about you?");
	}
    public static void sayBy() {
		
		System.out.println("Bye, Have a good day!");
	}
    public static void whatsName(String name) {
		
    	
		System.out.println("Nice to meet you " + name);
    }
}
