package encaplation_constructor;

public class MessageRunner {

	public static void main(String[] args) {
		

		Message msg1= new Message("Hello !" , "Marufjan" , "Akbar");
		
		Message msg2= new Message("Java is Fun...");
		
		Message msg3= new Message("This keyword is");
				
		Message msg4= new Message();
		
		System.out.println(msg1);   //if we don't create to String method we cannot write like this
		                           //we need to write like just like this --->System.out.println(msg1.getBody());
		System.out.println(msg1.getBody());
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
	}

}
