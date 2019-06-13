package array;

import java.util.Arrays;

public class Array24EqualsMethod {

	public static void main(String[] args) {
		
   //Equals method in Array class
		// when 2 arrays with same length and same order of element then they are equal
		
		
		
		int []a = {10,20,30};
        int [] b = {10,20,30};
        int [] c = {10,20,30,40};
        int [] d = {10,20,40,30};
        
        System.out.println(Arrays.equals(a, b)); //true
        System.out.println(Arrays.equals(b, c)); //different length
        System.out.println(Arrays.equals(c, d));  //false because of not same order

        
        
       //TAsk sort to d array and check equality
        
        Arrays.sort(d);
        System.out.println(Arrays.equals(c, d)); //not we change the order and it gave us true
	}

}
