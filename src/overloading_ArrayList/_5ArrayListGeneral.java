package overloading_ArrayList;

import java.util.ArrayList;

public class _5ArrayListGeneral {

	public static void main(String[] args) {
		
		
		//create a general( raw type) arrayList;
		//We can add any type of data to this list int, double, string etc.
		
		ArrayList list= new ArrayList ();
   
		
		list.add("Oznur");
		list.add(123);
		list.add(true);
		list.add(3.5);
		
		System.out.println(list);
		
		list.add('e');
		list.add(false);
		
		System.out.println(list);
		
		
		System.out.println(list.get(0)); //give us first element "Oznur"
		
		System.out.println(list.size()); //give us list size //6
	}

}
