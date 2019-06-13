package methods;

import java.util.Arrays;

public class Method18MethodsWithConditions {

	public static void main(String[] args) {
		
		/* Create a METHOD GetLarger THAT ACCEPTS 2 NUMBERS AND PRINTS LARGER ONE
		 * 
		 * If they are equal it print "numbers are equal: number"
		 * 
		 * 
		 * 
		 */
		
		GetLarger (8,11);
		int [] arr= {1,5,6,9,3};
		getMax (arr);
		
		//or
		
		getMax (new int [] {1,5,6,9,3}) ;
	}
	
  public static void GetLarger (int num1, int num2) {
	  
	  if (num1> num2) {
		 System.out.println(num1);
	  }else if (num2> num1) {
		  System.out.println(num2);
  }else {
	  System.out.println("numbers are equal: " +num1);
  }
	
  } 
    /*
     * Create a method getMax - that accepts int array and print ;argest number
     * in the array, if array is emty, print "Error:Array is empty"
     * 
     */
  public static void getMax (int []arr) {
	  
	  if (arr.length==0) {
		  System.out.println("Error:Array is empty");
		  return;  //bunu koyarsan break gibi oluyor
	  }else {
		  int max =arr[0];
		  for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max= arr[i];
		//or
//		Arrays.sort (arr);   //once sort yaparsam en sondaki max olur
//		
//		System.out.println(arr [arr.length-1]; 
//		
			}
		}
		  System.out.println(max);
	  }
  }
}
