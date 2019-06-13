package overloading_ArrayList;

import java.util.*;

public class _9ArrayListMethod6 {

	public static void main(String[] args) {
		
		/*
		 * Task methos: sum2Lists
		 * Args  : 2 integer arrayLists
		 * return type : int
		 * Sum of both arraylists
		 * 
		 */
		
      ArrayList <Integer> nums1 = new ArrayList <> ();
		nums1.add(100);
		nums1.add(200);
		nums1.add(300);
		
      List <Integer> nums2 = new ArrayList <> (); //bunu list yaparsan methodun icinde de list olmasi gerekiyor
     
      nums2.add(400);
      nums2.add(500);
      nums2.add(600);
      nums2.add(700);
      nums2.add(800);
      
      int result =sum2Lists(nums1,nums2);
     
      System.out.println(result);
     
	}
	public static int sum2Lists (ArrayList <Integer> nums1, List <Integer> nums2) {
   	 
    	int sum=0; 
    	for(Integer num: nums1) {
    		sum+=num;
    	}
    	for(Integer nums: nums2) {
    		sum+=nums;
	
}
    	return sum;
     }
}
