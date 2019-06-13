package overloading_ArrayList;

import java.util.ArrayList;

public class _8ArrayListWarmUp {

	public static void main(String[] args) {
		

		/* Task create ann ArrayList cities
		 * add 10 cities
		 * Print count of cities in the list
		 * Print all cities in onee line separetes by space
		 * 
		 * 
		 * create another ArrayList longnames
		 * and add all cities from cities list with more than 6 characters into longNames list.
		 * then print longNames in single line formatted way
		 * 
		 * 
		 */
		
		
		
		ArrayList <String> cities= new ArrayList <>();
		
		cities.add("Izmir");
		cities.add("Ankara");
		cities.add("Istanbul");
		cities.add("Bursa");
		cities.add("Malatya");
		cities.add("Bayburt");
		cities.add("Trabzon");
		cities.add("Mus");
		cities.add("Antalya");
		cities.add("Bolu");
		
		System.out.println(cities.size ());
		
		
		for(String each : cities) {
			System.out.print(each + " ");
		
			
			//OR
		}	
		System.out.println();
		
		for (int i= 0; i<cities.size() ; i++)	{
			System.out.print(cities.get(i)+ " ");
		}
			
	
		System.out.println();
		
		ArrayList <String>	longNames= new ArrayList <>();
		for(String each : cities) {
		if(each.length () >6) {
			longNames.add(each);
		}
		}
		
//	or
//	
//	for(int j =0; j <cities.size(); j++) {
//		String city= cities.get(j);
//		if(city.length()>6) {
//			longNames.add(city);
//		}
//			
//		}
	
		System.out.println(longNames);

}
}
