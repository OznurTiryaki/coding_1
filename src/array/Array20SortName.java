package array;

import java.util.Arrays;

public class Array20SortName {

	public static void main(String[] args) {
		//When sorting chars, follow the hierarchy;
		//number, < uppercase letter and  < lowercase letter
		
		String [] names = { "Said" , "John" , "Asel", "Alisiya", "Mijat" , "Tariq", "Z","Khalili"};
		
		//ABCDEFGHIJKLMNOPQRSTUVWYZ
		
		Arrays.sort(names);
		
		for( String n: names) {
			System.out.print(n + " ");
		}
		
		System.out.println();
        System.out.println("______**************___________");
        
		char [] charArray = {'c' , 'C' , 'D' ,'A','Z' };   //lower case is larger than uppercase
   
          Arrays.sort(charArray);    
		  // Arrays.sort(charArray,0,2);    you can do partial sort only starting from index and end index
  		
		
		for( char c: charArray) {
			System.out.print(c + " ");
		}
        
   
   
	}

}
