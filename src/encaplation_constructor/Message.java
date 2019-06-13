package encaplation_constructor;

public class Message {

	private String body;
	private String sender;
	private String receiver;
	
	
	
	public Message(String body, String sender, String receiver) { //compiler don't give us default because we create one already
		
		this.body = body;
		this.sender = sender;
		this.receiver = receiver;
	}
	
	//overload the constructor
	public Message(String body) {
		
		
		this(body,"Unknown","Unknown"); 
//		this.body = body;      bunun yerine cons i cagirip kod tekrarini kaldiriyoruz
//		this.sender = "unknown";     //we know it is go above contructior because it has 3 parameter
//		this.receiver = "unknown";		
	}
	
	//overload the constructor
    
	public Message(String body, String receiver) {
		
		this(body,"unknown",receiver ); //3 paramli cons cagirdik.iki param almamiza ragmen cons icinde 3 kullandigimiz icin
//		this.body = body;
//		this.sender = "unknown";
//		this.receiver = receiver;
	}
	

	public Message() {
		
		this.body = "";
		sender = "unknown";  //we don't have to use this because we dont have same param name
		                     //to make us confusing
		receiver = "unknown";		
	}

	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	@Override
	public String toString() {
		return "Message [body=" + body + ", sender=" + sender + ", receiver=" + receiver + "]";
	}

}
