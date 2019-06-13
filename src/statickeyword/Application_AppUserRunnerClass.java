package statickeyword;

public class Application_AppUserRunnerClass {

	public static void main(String[] args) {
		

		AppUser user1= new AppUser ("ironman", "Mark Smith", "ac124"); //when we asked the name it will gave us different for each object
		AppUser user2= new AppUser ("postman", "Sar Sma", "tc3535");//but we have just one count and it is static so this is cental
		AppUser user3= new AppUser ("superman", "Hi Joe", "fc1454");

		
		//when we create object each time increase count by one
		
		user1.setCount(100);  //first three change value and take 100 because it share the count
		System.out.println(user1.getCount());    //when we print we saw all count 100 because it it seperate object,
		                                         //not depend each other
		System.out.println(user2.getCount());
		System.out.println(user3.getCount());   
		
		AppUser user4 =new AppUser ();//here it shows one more 
		System.out.println(user4.getCount());   
		
	}

}
