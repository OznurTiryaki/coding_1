package array;

import java.util.Arrays;

public class Array22BinarySearch {

	public static void main(String[] args) {
		
        //binarySearch like indeof you give word, it says location
		//ARRAY MUST BE SORTHED FOR BINARYSEARCH TO WORK
		
		String [] words= {"cake", "tomato" , "wooden spoon" , "pizza"};
		
		Arrays.sort(words);
		
		
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.binarySearch(words, "pizza")); // it gave 1 because it is location after sort
		
    
		
		
		
		//if you dont want to sort your array and need to find a index of element in the array.
		//how we can do it!
		// we can do it with index
		
//		int index = -1;
//    
//    for (int i =0 ;  i < words.length ; i++) {
//    	if (words[i].equals("tomato")){
//    		index = i;
//    		break;
//    		
//    		
//    	}
//    }
//    
//    System.out.println(index);
//    
//    if (index== -1) {
//    	System.out.println("not found");
//    }
	}

}
