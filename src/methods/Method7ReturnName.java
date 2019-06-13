package methods;

public class Method7ReturnName {

	public static void main(String[] args) {
		// method getFirstName, getLastName
		//main you will call these methods and build and email
		// String email= [firstname]_[lastname]@gmai.com
    
		String firstName= getFirstName();
		String lastName=  getLastName ();
		String email= firstName+"_"+lastName+"@gmail.com";
		System.out.println(email);
		
	}
  public static String getFirstName() {
	 
	 return "oznur";
	 
  }
  
  public static String getLastName () {
	  
	  return "tiryaki.karakus";
  }
}
