package array;

import java.util.Scanner;

public class Array10FindSmalestOne {

	public static void main(String[] args) {
		

//		create array nums and assign several values
//		print the smallest value in array
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many number you want to give:");
		int count = scan.nextInt();
		int [] nums  = new int [count];
        for (int x =0 ; x <count ; x++) {
        	System.out.println("Enter number: " + (x +1) );
         nums [x] = scan.nextInt();
        	
        }
        
        for (int num :nums) {
        	System.out.print(num+ " ");
        }
        int smallest = nums[0]; //start compare from num0 
       
        for (int y=0 ; y < count ; y++) {   // or for (int num : nums){
        	if ( nums[y] < smallest ) { ///yani benim numaramdan daha kucukse aldigim numara onu yeni degere ata
        		smallest = nums [y];
        	}
        //	smallest = n <smallest ? n : smallest ;   turnary way. if is n is smaler than smalest choose n; if n greater than smalest stay same/
        }
        System.out.println("smallest is "+ smallest);
	}

}
