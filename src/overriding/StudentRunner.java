package overriding;

public class StudentRunner {

	public static void main(String[] args) {
		

		Student student= new Student ();
		
		OnlineStudent online= new OnlineStudent ();
		
		CampusStudent campus = new CampusStudent ();

		student.attentAClass();
		
		online.attentAClass();
		
		campus.attentAClass();
	}

}
