package encaplation_constructor;

public class EtsyAccount {
  
	
	private String email; //private yaptigimiz icin getters and setter yapmamiz lazim ulasmak icin 
	private String firstName;
	private String passWord;
	
	public void  setEmail (String email) {     //if we add same email with instance variable
		                 //java this this is just parameter in method and dont acccess the instance variable.
		 // for that  we need to do  this.email to say, this email is instance variable
	//	this.need to be at left with instance variable.
	      this.email= email; 
}
	//getters
	public String getEmail () {
	     return email;
	}
	//setters
	public void setFistName (String newFirstName) {
		firstName= newFirstName;    
		
	}
	public String getFistName() {

	return firstName;  
	}
	
	public void setPassWord (String newPassWord) {  //normalde setin icinde birsey koymuyorduk ve yazmiyordu, simdi
		//yazinca onlari da print ett
		passWord= newPassWord;
		if(newPassWord.length() < 6 ) {
			System.out.println("it has to be at least 6 characters");
			return; //get out from method
		}
	}

	public String getPassWord () {
	     return passWord;
	}
	
	public void setAllInfo(String firstName, String email, String passWord) {
	 this.firstName=firstName;
	 this.email=email;
	 this.passWord=passWord;
	 //or  you can call another method 
	 //setPassWord (passWord);
			 
	}
	 
	 public String getAllInfo () {
		 
	 //does not necessary to add this.firstName up to you
	 String info= "First name : "+ firstName + " | Email: " + email + "  | Password: " + passWord;
	 
	 return info;
	 }
	 
	
}
	
	
	
	
	
	
