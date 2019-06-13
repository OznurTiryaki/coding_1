package customClass;
import java.util.*;
import java.lang.*;
public class stringBuilder {

	public static void main(String[] args) {
		
		String [] words = new String [] {"coffee", "tea", "water", "juice", "milk" };
	
	   System.out.println(Arrays.toString(words));
	   
	   //create StringBuilder object
	    new StringBuilder ();
	    
	   StringBuilder  wordsStb = new StringBuilder ();   //string building not a collection like array, or ArrayList just one
                                                  //for that reason only for array we can use StringBuilder for each loop
                                                  //without that you cannot use with for each loop
                                                  //without loop if you have fixed number of values in String []

	   wordsStb.append(words[0])
	           .append(words[1])
	           .append(words[2])
	           .append(words[3])
	           .append(words[4]);
	   
	   System.out.println(wordsStb);
	   
	   //add everything into StringBuilder using a loop
	   
	   StringBuilder  wordsBuilder= new StringBuilder ();
	   
	   for(String drink : words) {
	   
	    wordsBuilder.append(drink);
	   }  
	    System.out.println(wordsBuilder);
	    
	}
	 	
	}

