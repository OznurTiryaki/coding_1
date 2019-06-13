package customClass;

public class Employee {
    /*instance variables:
     * firstname, last name, email, job title
     * salary
     
     */
	 String firstname;
	 String lastname;
	 String email;
	 String jobtitle;
	 double hourlySalary;
	
	 
	 public static void main (String []args) {    ///you can print at same class too
		 
		 Employee emp1 = new Employee();
		 
		 emp1.firstname="Mike";
		 emp1.lastname="Smith";
		 emp1.email=  emp1.firstname + emp1.lastname +"@mail.com";
		 emp1.jobtitle = "Scrum Master";
		 emp1.hourlySalary = 65.50;
		 
		 System.out.println("Firstname: " + emp1.firstname);
		 System.out.println("Lastname: " + emp1.lastname);
		 System.out.println("Job title: " + emp1.jobtitle);
		 System.out.println("email: "+ emp1.email.toLowerCase());  //we can use method
	 }
}
