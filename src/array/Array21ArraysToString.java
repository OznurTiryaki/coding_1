package array;

import java.util.Arrays;

public class Array21ArraysToString {

	public static void main(String[] args) {
		// toString method is present in all java classes, and it is used to describe the object
		
		int[] nums= {7,32,5,23};
		System.out.println(Arrays.toString(nums));
		
		
    //sort this array
	//	With Array class to String is useful when quickly printing out all values in the array in same line without using any loops
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		

		
	}
}
