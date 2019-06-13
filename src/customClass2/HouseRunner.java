package customClass2;

import java.util.*;


public class HouseRunner {

	public static void main(String[] args) {

		House house1 = new House();

		house1.type = "Single House";
		house1.addrss = "16502 Brogan";
		house1.bedrooms = 4;
		house1.year = 2018;

		
		House house2 = new House();

		house2.type = "Apartment";
		house2.addrss = "12001 Metric ";
		house2.bedrooms = 1  ;
		house2.year = 2000;

		
		
		House house3 = new House();
		
		house3.type="Condominuim";
		house3.addrss = "2234 K st Apt 543 ";
		house3.bedrooms = 2;
		house3.year = 2000;

		System.out.println("House1 type : " + house1.type);
		System.out.println("House2 type : " + house2.type);
		System.out.println("House3 type : " + house3.type);
		System.out.println("***************************");
		
		/*
		 * House is a class
		 * house is a data type of house1 variable
		 * house1 is a variable of type House
		 * house1 is a variable that is holding a House Object
		 * house 1 is a reference variable
		 * 
		 */
		
		
		//how we can store more information
		int [] nums = new int [3];
		nums[0]=234;
		String [] names = new String [3];
		names[0]="Bill";
	    House [] houses = new House [3];  //house u store yapmak istersek bu sekilde yazicaz
	   houses[0]= house1;   //I can just add houses object here  houses[0]="townHouse"; CALISMAZ
	   houses[1]= house2; 
	   houses[2]= house3; 
	 //  System.out.println(houses[0].addrss);  
	   
	   
	   for(House each : houses) {
		   System.out.println(each.type);
		   System.out.println(each.addrss);
		   System.out.println(each.bedrooms);
		   System.out.println(each.year);
	   }
	   System.out.println("***************************");
	   for(House h :houses) {
		   System.out.println((h.type + " ==> "  + h.addrss));
	   }
	   System.out.println("***************************");  //  you can do all in one line
	   for(int i=0; i< houses.length ; i++) {
		   System.out.println(houses[i].type + " | "+ houses [i].addrss);
	   }
	   
	   System.out.println("============ARRAYLIST OF HOUSE OBJECTS=============");
	    
	   ArrayList <Integer > numsList = new ArrayList <> ();
	   
	   ArrayList <House > housesList = new ArrayList <> ();
	   
	   housesList.add(house1);
	   
	   housesList.add(house2);
	   
	   housesList.add(house3);
	   
	   ArrayList <House > housesList2 = new ArrayList <> (Arrays.asList(houses));
	   
	  List <House > housesList3 = Arrays.asList(houses);   //or you can create like this but this is not dianamic
	  
	  
	  //print year of each house object in ArrayList if year is between 2006 and 2018
	
	   for(House h : housesList) {
		   if(h.year >=2006 && h.year <=2018) {
			  System.out.println(h.type + " is a built in " + h.year);
		   }
	   }
	   
	   System.out.println("***************************");  
	   for (int i = 0; i < housesList.size (); i++) {
		   House tempHouse=housesList.get(i);  //olarak assign yaparak da kullanmabiliriz.  House olarak assign yapmaya dikkat et.
		   if(tempHouse.year >=2006 && tempHouse.year <=2018) {
			   System.out.println(tempHouse.type + " is a built in " + tempHouse.year);
		   
//			   if(housesList.get(i).year >=2006 && housesList.get(i).year <=2018) {
//				  System.out.println(housesList.get(i).type + " is a built in " + housesList.get(i).year);
//	
			   }
	   }
	   
	   
	   printHouseInfo(house1);  // bu sekilde methodu cagirabilirsin
	   
	   
	}

	public static void printHouseInfo(House house){  //this method want to ready House class
		System.out.println("=================");
		System.out.println("Type: " + house.type);
		System.out.println("Address: " + house.addrss);
		System.out.println("Year: " + house.year);
		System.out.println("=================");
		
	}
}
