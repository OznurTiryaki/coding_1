package overloading_ArrayList;

import java.util.ArrayList;

public class _6ArrayListCreateRestrictedType {

	public static void main(String[] args) {

//  ArrayList <String > names ;
//  names = new ArrayList <String>();
		// or

		ArrayList<String> names = new ArrayList<>();

		names.add("Ali");
		names.add("Shapkat");
		names.add("Ismail");
		names.add("Z");

		System.out.println(names);
		
		
		// get size of elements
		
		int length = names.size ();
		System.out.println("Number of names: " + length);
		
		//to get first parameters
		
		String first = names.get(0);
		System.out.println("First string: " + first);
		
		String last= names.get(names.size()-1);
		System.out.println("Last string: " + last);
		
		//How we can remove element
		
		names.remove(2);
		System.out.println(names);   //ismail'i cikarmis olduk
		
	}
	

}
