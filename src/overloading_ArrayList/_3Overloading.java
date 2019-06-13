package overloading_ArrayList;

public class _3Overloading {

	public static void main(String[] args) {

		/*
		 * Method work
		 * 
		 * 1. params : String JobType return boolean. if job os sdet or developer then
		 * true, else false prints :working as <JobType > and it is fun 2.param: int
		 * --->hours
		 * 
		 * return double--->salary (hours*60) Worked <this many > hours and made < that
		 * uch > income
		 */

		
		System.out.println(work("SDET") );   
		System.out.println(work("BA") );
		System.out.println(work(40) );
	}

	public static boolean work(String jobType) {
		
	
         
          
		if (jobType.equalsIgnoreCase("sdet") || jobType.equalsIgnoreCase("developer")) {
			 System.out.println("working as <" + jobType+"> and it is fun");
			return true;
		}
		 System.out.println("working as <" + jobType+"> and it is not fun");
		return false;
	}
	
	public static double work(int hours) {
		double	salary = hours*60;
    System.out.println("Worked <" +hours+ "> hours and made < "+salary+ "> income");
	return salary;
}
}
