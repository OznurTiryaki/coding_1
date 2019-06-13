package overloading_ArrayList;

import java.util.*;

public class _9ArrayListMethod5 {

	public static void main(String[] args) {
	
		//how to write method that accepts an ArrayList
		//calculate sum of values and return
		
		ArrayList <Integer> nums = new ArrayList <> ();
		
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		int result =sumList(nums);
		System.out.println(result);
//		or
//		System.out.println(sumList(nums));
	}

	public static int sumList (ArrayList <Integer> nums) {  //or List <Integer> nums
	int sum=0;
		
		
		for (int i = 0; i < nums.size(); i++) {
			sum+=nums.get(i);	
		}
		
//		OR
//		for (Integer n :nums) {
//			sum+=n;
//		}
		
		return sum;
	}
	
     
}