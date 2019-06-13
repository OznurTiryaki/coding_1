package finalkeyword;

public class FinalMethods {
	
    public final void makePhoneCall (String phoneNumber) {
    	System.out.println("Dial number:" + phoneNumber + " \n Press On Call");
    }
    
    public static final void readSMSMessage (String sender) {
    	System.out.println("Open messages and read for " + sender); 

    }
}

class Sub extends FinalMethods { 
	
//	public final void makePhoneCall (String phoneNumber) { 
//  not possible to override final method
		
		
	public final void makePhoneCall (int number) {  //overloading is fine because we always create different method, not same
		
		System.out.println("Dial number:" + number + " \n Press On Call");
	}
	
	
}
   
    

