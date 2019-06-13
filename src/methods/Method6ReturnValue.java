package methods;

public class Method6ReturnValue {

	public static void main(String[] args) {
		// get president name from the method and assign to president
		// the print out "US president is [president]
				
		String g = getPresidentName ();
		
		System.out.println("Us president is :" +g);
	}
   
	
	public static String getPresidentName () {
		
		return "Obama";
	}
}
