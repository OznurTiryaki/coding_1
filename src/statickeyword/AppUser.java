package statickeyword;

public class AppUser {
  
	private String userId;
	private String name;
	private String password;
	private  static int count=0;  //if we put static its mean we share the value with other object 
	//it is attached to the class itself and it has only one copy. And same variable is shared by all objects.
	//We can call it: Shared variable
	//Class variable
	
	//All non-static instance variables are refer to only independent object and they are not shared centrally
	//When a variable is static, it is kind of shared and single copy/central.
	
	
	public AppUser() {
	count++;
	}
	
	public AppUser(String userId, String name, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		count++;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
