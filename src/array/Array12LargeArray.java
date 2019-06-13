package array;

import java.util.Random;
import java.util.Scanner;

public class Array12LargeArray {
	
	public static void main (String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
	    Random random =  new Random (); // it a class gave us random numbers, have to compile
		
	    System.out.println("How many items in Array?");
	    
	    int count = scan.nextInt();
	    
	    int []nums = new int [count];
	    for (int i=0 ; i <count ; i++) { 
	    	
	    	nums[i] = random.nextInt(1000); //bana 0 ile 1000 araliginda bir sayi ver diyoruz.
	    }
	    
	    for (int n :nums) {   //aldigimiz random numberlari yazdiriyoruz.
	    	System.out.println(n + " ");
	    }
	}

}
