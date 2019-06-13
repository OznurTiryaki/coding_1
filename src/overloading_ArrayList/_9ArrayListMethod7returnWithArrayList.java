package overloading_ArrayList;

import java.util.*;

public class _9ArrayListMethod7returnWithArrayList {

	public static void main(String[] args) {
		
     /*
      * how to write a method that return an ArrayList of integers
      * 
      * Method name: buildIntList
      * 
      * return type: ArrayList of integer
      * Args:int
      * 
      * 
      * This method gets an int and creates an arraylist with that many random
      * numbers between 0-100 and returns it
      */
		ArrayList <Integer> ramdomList= buildIntList(10);
		System.out.println(ramdomList);
		
		 //OR
		
		System.out.println(buildIntList(10));  //we got 10 numbers in array

		//let call method from other class to sum
		
		System.out.println(_9ArrayListMethod5.sumList(ramdomList));  //first I wrote class name. and chose method
		                                                             //it gave us 15 random number's sum
	}
    public static ArrayList <Integer> buildIntList (int count){
    	
    	Random rand = new Random ();
    	
    	ArrayList <Integer> returnList = new ArrayList <> ();   //we need to create ArrayList to return it
    	
    	for (int i = 1; i <=count ; i++) {           //count mean how many number you want
    		returnList.add( rand.nextInt(101));     //random values between 0-100 
    	}
    	
	return returnList;
}
}
