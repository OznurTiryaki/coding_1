package overloading_ArrayList;

import java.util.*;

public class _9ArrayListManipulations2 {

	public static void main(String[] args) {
		
		// Array can hold object, cannot hold primitives, that why we use wrapped class.
        //ArrayList use own class
		
		// Create arrayList fruits using 5 different ways

		
		//1st way
		ArrayList<String> fruits = new ArrayList<>();

		//2nd way
		ArrayList<String> fruits1 = new ArrayList<String>();

		//3rd way
		List<String> fruits2 = new ArrayList<>();

		//4rd way
		List<String> fruits3 = new ArrayList<>(10); // we will say 10 but we can increase that

		//5th way (like copyOf method)
		
		ArrayList<String> fruits4 = new ArrayList<>(fruits); /// whatever inside the fruits it will be copy to fruits4
		
		fruits4.add("Cherry"); //after that you can add something else
		
		
		// we will do fruits and if you want to add more
        //6th and 7th way help to initilase at one line 
		
		String[] myFruits = { "kiwi", "watermelon ", "melon", "mango", "orange", "apple", "papaya" };

		List<String> fruits5 = Arrays.asList(myFruits);   //first you can store at array and also you can initialize in one line

		List<String> fruits6 = Arrays.asList("kiwi", "watermelon ", "melon", "mango", "orange", "apple", "peach" ); //also you can initialize in one line
		
		List<String> fruits7= new ArrayList<>(Arrays.asList(new String[] { "plum", "cherry ", "apple", "pineapple"})); 

		fruits7.add("pears"); //we can also add new elements, it is flexible
		
		//How we can add values
		
		fruits.add("grapes");
		fruits.add("Blueberries");
		fruits.add("Blackberries");
		fruits.add("peach");
		
		System.out.println(fruits);
		
		//add element from one list to another 
		
		fruits1.addAll(fruits);      //took fruits all elements and add fruits1
		
		fruits1.add("Dragon Fruit"); // when we print , we need to see everything from fruits+ dragon fruit
		
		System.out.println(" Fruits1"+fruits1);
		
		//clear method remove all elements\
		
//		fruits.clear();
//		System.out.println(fruits);  //is just shows us empty square bracket
		
		//remove value from specific index
		
		fruits1.remove(1);  //we want to remove Blueberries
//		fruits1 (1); //index
//		fruits1( new Integer (1));  obj
//		fruits1(Integer.valueOf(1)); obj  for int
		
		System.out.println(fruits1);
		
		//if you don't know the index number, you can write object directly
		
		fruits1.remove("grapes");  //we want to remove grapes
		System.out.println(fruits1);
		
		//removeAll -- will remove all matching elements between fruits and fruits1
		
		fruits.removeAll(fruits1);  //only accept ArrayList
		System.out.println(fruits);
		System.out.println(fruits6);
		
	}

}
