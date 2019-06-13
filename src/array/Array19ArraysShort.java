package array;

import java.util.Arrays;

public class Array19ArraysShort {

	public static void main(String[] args) {
		// sort method of array class
		
		int [ ]  nums = {9,4,3,0,-4,5,3,10};
		
		for (int n : nums ) {
			System.out.print(n+ " ");
		}
		
		System.out.println();
          
		Arrays.sort(nums);  //sort is array to change Array
          
       for (int n :nums) {  
    	   
    	   System.out.print(n+ " ");
		}
		
		System.out.println();
     
		
		
	}

}
