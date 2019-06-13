package methods;

import java.util.Arrays;
import java.util.Random;

public class method16ArrayMethods {

	public static void main(String[] args) {
		
		/* Method: getIntArray5
		 * 
		 * params/args : nothing
		 * return : int array
		 * 
		 * 
		 * 
		 * Creates an array with 5 ints and assigns random numbers,
		 * between 0-100 then return the arrays
		 * 
		 * 
		 * getIntArray5 ()--> [43,23,54,1,89]
		 * 
		 */
		
		System.out.println(Arrays.toString(getIntArray5 ()));

		//or you can write
		
		int [] myNums=getIntArray5 ();
		
		System.out.println(Arrays.toString(myNums));
		System.out.println(Arrays.toString(findsum()));
	}

  public static int[]getIntArray5 (){
	  
	  int []arr= new int[5];
	   
		Random rand= new Random();
		
		for (int i = 0; i < arr.length; i++) {
				arr[i]= rand.nextInt(101); 
		   

	  
	}
	 return (arr);
			
  }
  
  public static int[] findsum () {
	 int sum1=0;
	 int sum2=0;
	 
	  int [] nums1=getIntArray5 ();
	  int [] nums2=getIntArray5 ();

		System.out.println(Arrays.toString(nums1));

		System.out.println(Arrays.toString(nums2));
		
	  
	  for (int each : nums1) {
		sum1 += each;
	}
	  for (int nums : nums1) {
			sum2 += nums;
  }
   if (sum1>sum2) {
	   return nums1;
	   
   }else {
	   return nums2;
   } 
   }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
