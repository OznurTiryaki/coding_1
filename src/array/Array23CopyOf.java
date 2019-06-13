package array;

import java.util.Arrays;

public class Array23CopyOf {

	public static void main(String[] args) {
		

		
		//Copy of used to copy an array into another array and  we can also specify
		//another index where we want to stop

		
		int []a= {10,20,30};
		int []b = Arrays.copyOf( a, 2); //it means go to a and copy of to second one and add b
		                                //it takes a 10,20
		System.out.println(Arrays.toString(b));
		
		int []c = Arrays.copyOf(a, 5);   //copy from a and take 5 items  
		System.out.println(Arrays.toString(c)); // a 3 taneydi bu yuzden son ikisi default value oldu sifir olarak dondu [10, 20, 30, 0, 0]
		
		
		System.out.println("-----------------------");
		
		System.out.println((Arrays.toString(a)));   //burada a nin hala ayni oldugunu goruruz.   [10, 20, 30]
		
		a= Arrays.copyOf(a,4); // we says copy from a and take 4 item, but we already have just 3 items, 
		
		System.out.println(Arrays.toString(a));  //4rd one default value and zero  [10, 20, 30, 0]
		
		a[3] = 100;
		
		System.out.println(Arrays.toString(a));  //[10, 20, 30, 100]

		
	
	}

}
