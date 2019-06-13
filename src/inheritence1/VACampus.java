package inheritence1;


//VACampus has a relationship between classes
public class VACampus {


	VaCampusStudent campusStudent= new VaCampusStudent();   //diger siniftan object olusturduk
	
	public static void main(String[] args) {
		
		
		Student student= new Student ();
		
		student.name="Serik"; //public and same package
		
		//Student.ssn is private. Only visible in student class.
		
		student.age=27;   //protected visible in same package
		
		student.campus="Mclean VA";  //default is visible in same package
	}
}
