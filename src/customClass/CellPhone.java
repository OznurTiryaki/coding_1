package customClass;

public class CellPhone {

	//properties/data/information
	
	String brand ;
	String color;
	double price;
	
	//behavior/method
	
	public void call() {
		System.out.println("Calling...");
	}
	public void text() {       //it is not static so we dont't call with class name.(instance method )if we write a static 
		                       //when we call,we will say CellPhone.call();  
		System.out.println("Sending a text message");
		
	}
}
