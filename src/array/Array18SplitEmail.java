package array;

import java.util.Scanner;

public class Array18SplitEmail {

	public static void main(String[] args) {
		
//		Given a String variable email, write code using split method to print email id and domain in separate lines.
//
//		Example:
//		email -> info@cybertekschool.com
//		Print:  
//		Email id: info
//		Email domain: cybertekschool.com
//
//
//		If email contains no @ character or multiple @ characters then print invalid email:
//
//		email -> hello-gmail.com
//		print:  
//		invalid email
//
//		email -> my@fancy@email.com
//		print:  
//		invalid email
		
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	 
	
	 int b1 = email.indexOf("@");
	 int b2 = email.lastIndexOf("@");
	   
	 
	 if ( email.contains("@") && b1==b2) {
		
	 
	 String [] splitted = email.split("@");
	    
	   
	    for (int x = 0 ; x < splitted.length ; x++ ) {
	    	System.out.println("Email id: " + splitted [x]);
	    	System.out.println("Email domain: " + splitted [x+1]);
	    	break;
	    }
	   
	    	
	    }else {
	    	 System.out.println("invalid email");
			 
	    }
//	 
//	                    OR
//	 
//	 
//		Scanner input = new Scanner(System.in);
//	    String email = input.nextLine();
//	    
//	    String [] splitted = email.split("@");
//	    
//	 if(splitted.length==2) {
//	 
//		 for (int x = 0 ; x < splitted.length ; x++ ) {
//		    	System.out.println("Email id: " + splitted [x]);
//		    	System.out.println("Email domain: " + splitted [x+1]);
//		    	break;
//		    }
//		   
//		    	
//		    }else {
//		    	 System.out.println("invalid email");
//				 
//		    }
//	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	    
	}

}
