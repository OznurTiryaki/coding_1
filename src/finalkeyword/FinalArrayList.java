package finalkeyword;

import java.util.*;

public class FinalArrayList {
	
	private String model;
	
	FinalArrayList(String model){
		this.model=model;
	}

	public static void main(String[] args) {
		
		
		final String CITY= "Miami";
//		CITY= CITY.toUpperCase();   NOT COMPILE BECAUSE it is create different obj in heap
		CITY.toUpperCase(); 
		System.out.println(CITY.toUpperCase());  //we can print because we dont change the city, just manipulate it,
		//but original city not change
		
		
		
	//	final Car car =new Car ("Kia");
		
		final int [] NUMS= new int [] {100,300,400};
		 
		NUMS[0]= 500;   //[500, 300, 400]  it updates but it cannot create a new aaray with this reference name. \
		
//		because array it ummutable, when we say 
//		
//		NUMS= new int [2] ;
//		
//		it is not remove or add, just copy the referance
//		and create a new object. So we cannot do this.
		
		System.out.println(Arrays.toString(NUMS));
		
		final List <String> PRODUCTS= new ArrayList <> ();
		
		PRODUCTS.add("water");   
		PRODUCTS.add("Cookies");
		PRODUCTS.add("Coffee");
		
		System.out.println(PRODUCTS);
		
		// we can add and remove it but we cannot re-assign 
	
	//	PRODUCTS=new ArrayList<> ();
		
	
      final FinalArrayList car= new FinalArrayList ("Audi");
      
      //car.model===model/ Audi
        
     // car= new FinalArrayList ("BMV");  not compile. since it is final and cannot refer to a new object
      
}
	
}
