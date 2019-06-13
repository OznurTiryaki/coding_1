package wrapperClass_ArrayList;

import java.util.*;

public class _4AutoBoxingVSUnBoxing {

	public static void main(String[] args) {
		
        //auto boxing. take primitive and convert into Wrapper class
		
		//object
		
		int i = 1000;
		
		Integer j= i;   //auto-boxing
		
		Double d = 34.2;  //auto-UNboxing
		
		  List <Integer > nums = new ArrayList <> ();
		  
		  nums.add(433);
		  
		  int p =555;
		  
		  nums.add(p);// dedigimizde de yine auto-unboxing oluyor

		  nums.add(new Integer(77)); //burada herhangi bir convert olmuyor. Wrappercreate edip list e ekliyor.
		  
		  //Taking the Wrapper class object and converting into primitive and happens automatically
		  
		  int r = nums.get(0); //dedigimizde ilk indexi alirken int olarak aliyoruz unboxing yapiyor
		  
		  Boolean bool= new Boolean(false);
		  
		  boolean boolPrim =bool;    //unboxing yapiliyor
		  
		  System.out.println(boolPrim);
		  
		  Character chObj = '^';   //boxing
		  
		  char chPrim = chObj;
		  
	}

}
