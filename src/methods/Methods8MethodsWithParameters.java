package methods;

import java.util.Scanner;

public class Methods8MethodsWithParameters {

	public static void main(String[] args) {
		
		//build email that will accept a firstname and lastname and return a full email.
		
		Scanner scan= new Scanner (System.in) ;
		
		System.out.println("enter your firstname: ");
		
	    String firstname= scan.next();
	     
	     System.out.println("enter your lastname: ");
			
	   String  lastname= scan.next();
	      
	     System.out.println("enter your emailing data: ");
			
	   String  emaildata= scan.next();
		
	    System.out.println( email (firstname,lastname,emaildata));
	
	}
     
	
	
	
	public static String email (String firstname, String lastname, String emaildata) {
	    
	
			String email= firstname + " _" + lastname +  emaildata;
		
	      
	return email;
	     
      }
}
