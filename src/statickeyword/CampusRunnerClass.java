 package statickeyword;

public class CampusRunnerClass {

	public static void main(String[] args) {
	
		Campus.city= "Mclean";
		Campus.aboutCampus();  
		
		/* Whenever we add any static variable or method into a class, 
		 * it means those belong to the class directly
		 * and can be used/accessed/called by using 
		 * class name only. No need to create object.
		 * 
		 */
		
		Campus c= new Campus();    //when you have a static you will do both way. but if you remove the static 
		// first one will not compile any more
		System.out.println(c.city);
		c.aboutCampus();
	}

}
