package var_args;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WarmUpAbout2DARRAY {

	public static void main(String[] args) {
		 
		/*
		 * method addElements accept 2 int array and add each element
		 * and create new element
		 * addElements (new int [] {10,40,50,3,1}, new int [] {11,0,500,44,1101} );
		 * 
		 * 
		 */
   
		int[] myArr1= new int [] {10,40,50,3,1};
		int[] myArr2 = new int [] {11,0,500,44,1101} ;
		


		System.out.println(Arrays.toString(addElements  (myArr1,myArr2))); //array yazdirirken methodda boyle olmak zorunda
		
	}
  public static int []addElements (int [] arr1, int [] arr2){
	  
	  int [] newArr= new int [arr1.length];
	 
	 for (int i = 0; i <newArr.length; i++) {
	
			newArr[i] = arr1[i]+  arr2[i];  //burada zaten rakam degistikce yeni degeri eklemis olacak
		}
	
	 return newArr;
 }
}
