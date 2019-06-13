package overloading_ArrayList;

import java.util.*;

public class _9ArrayListManipulations4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = new ArrayList<>();

		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(400);
		nums.add(500);

		System.out.println(nums);

		// Task update 100 to 1000

		// nums.add(0,1000); if we say add it takes 1000 and put on top, just changes
		// the index 0's elements

		nums.set(0, 1000); // if we say set, it takes 1000 and replace with 100

		System.out.println(nums);

		// task double the value of index 1

		nums.set(1, nums.get(1) * 2); // get index 1--> nums.add(200); //second part should be object
									  // we can take index 1 element with get and said double--> *2
		System.out.println(nums);

		// Task find the position of 300 and make it 3

//		int positionOf3 = nums.indexOf(300);
//		
//		nums.set(positionOf3, 3);
//		
//		OR
//		
		nums.set(nums.indexOf(300), 3); // find index ---> nums.indexOf(300), change value with set
                                        //if there is not 300, return as -1
		System.out.println(nums);
		
		

	}

}
