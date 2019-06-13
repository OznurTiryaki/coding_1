package overloading_ArrayList;

import java.util.ArrayList;

public class _7ArrayListWrapperClass {

	public static void main(String[] args) {
		
		
		Integer n =100;
        int n2=100;
        
        
        ArrayList <Integer> nums= new ArrayList <> ();
        
        nums.add(300);
        nums.add(500);
        nums.add(1234);
        
        System.out.println(nums);
        //or
        
        System.out.println(nums.toString());
        
        for(Integer each :nums) {     //to take out from array  also this work;  for(int each :nums) {    
        	                        //take Integer and convert int, we call it unboxing
        	
        	  System.out.println(each);
        }
        
        for (int i = 0; i <nums.size(); i++) {    //arraylist icin bu sekilde kullanmamiz lazim
        	System.out.println(nums.get(i));
			
		}
	}

}
