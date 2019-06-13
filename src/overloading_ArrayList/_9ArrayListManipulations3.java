package overloading_ArrayList;

import java.util.*;

public class _9ArrayListManipulations3 {

	public static void main(String[] args) {
		

		List <Integer> nums = new ArrayList <> ();
		
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		System.out.println(nums);
		
		//if I want to remove 3, I cannot say just nums.remove(3);
		//because it will understand as a index and remove third index not number 3
		//it need to be like below
		
		nums.remove(new Integer (3));   //to remove number 3
		
		System.out.println(nums);  //[2, 4, 5]
		
		nums.remove(new Integer (2));  //to remove number 2
		//nums.remove(Integer.valueOf(2)) or like this
		
		System.out.println(nums);   //[4, 5]
	}
}
