 package overloading_ArrayList;

import java.util.*;

public class _9ArrayListManipulations {

	public static void main(String[] args) {
		
		//How to add elements to ArrayList
		
		ArrayList <Integer> nums = new ArrayList (1000) ;  //that is capacity not already include 1000 elements
		
		Integer [] numsArr= {123, 34, 23, 765};
		List <Integer> numsList = Arrays.asList(numsArr);

		
		Integer [] numsArr1= {4, 6, 8, 9};
		List <Integer> numsList1 = Arrays.asList(numsArr1);
		
		System.out.println(numsList);
		
		List <String> cities = Arrays.asList (new String [] { "Austin", "San Antonia" , "Dallas"});
		
		System.out.println(cities);
		
	}
}
