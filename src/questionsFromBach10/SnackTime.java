package questionsFromBach10;

import java.util.Scanner;

public class SnackTime {

	public static void main(String[] args) {
		

		//create a boolean variable hungry and assign true
		//create int variable apples and assign 1 to eat it
		//as soon as you are hungry print "eating an apple"
		//and increase the apple
		//once you eat 5 apples, no nonger hungry
		
		
		
		
		boolean hungry= true;
		
		
	     int apples = 1; 
	     
	     while (hungry) {
	    	
	    	 System.out.println("eat apple");
	    	 
	     
	    	  
	    	  if (apples==5) {  // burada once 5 kere yazdirdi sonra arttirdi,disina koydugumuz icin
	    	  
	       hungry = false ;
	    		 
	    	 }
	    	  apples++; // if we put it here doesn't matter if condition
	    	  //because out of curly braces
	     }
	    	 
	    	 System.out.println("no longer hungry");
	     
	   
	    

		

	}

}
