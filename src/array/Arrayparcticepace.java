package array;

import java.util.Scanner;

public class Arrayparcticepace {

	public static void main(String[] args) {
	
     String [] words = {"hello", "why","by", "apple","note", "water"};
    
     char first =' ';
     char last=' ';
     for (int x =0; x < words.length ; x++) {
    	 
    	 first = words[x].charAt(0);
    	 last= words[x].charAt(words[x].length()-1);
    	 
    	 System.out.println(first+""+last);    
    	
     }
     
      
     
     
     
     
	}
}