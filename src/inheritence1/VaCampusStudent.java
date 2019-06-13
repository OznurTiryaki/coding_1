package inheritence1;


//VaCampusStudent is a Student
public class VaCampusStudent extends Student {

	//this is inherit from Student class
//	public String name;
//	private int ssn;
//	protected int age;
//	String campus;
	
	private int badgeId;

	public int getBadgeId() {
		return badgeId;
	}

	public void setBadgeId(int badgeId) {
		this.badgeId = badgeId;
	}
	
	
}
