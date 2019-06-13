package questionsFromBach10;


public class StringManipulation {

	public static void main(String[] args) {
	//	We have a message variable already declared and assigned value in this format
		//
//				Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}
		//
//				Variables are already declared:
		//
//				sender, phoneNumber, message
//				- by using String methods:
//				retrieve related information from SMSmessage string and assign to those 3 variables.
//				-print each variable in separate line
		//
//				Sender: Mike Smith
//				Phone Number: 202-123-3456
//				Message body: I love programing and problem solving

		
		String sender="";
		String phoneNumber= "";
		String mainMessage= "";
		
		
		String message= "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
		
		
//		int senderFirstLetter = message.indexOf("<");
//		int senderLastLetter = message.indexOf(">");
//		int numberFirstLetter = message.indexOf("[");
//		int numberLastLetter = message.indexOf("]");
//		int messageFirstLetter = message.indexOf("{");
//		int messageLastLetter = message.indexOf("}");
//		
//		sender =( message.substring(senderFirstLetter+1,senderLastLetter));
//		phoneNumber=(message.substring(numberFirstLetter+1, numberLastLetter));
//		mainMessage=( message.substring(messageFirstLetter+1, messageLastLetter));
//		
//		System.out.println("Sender :" + sender);
//		System.out.println("Number :" + phoneNumber);
//		System.out.println("Message : " + mainMessage);
		
		
	//short way---->this is common way
		
		sender = message.substring(message.indexOf("<")+1, message.indexOf(">"));
		System.out.println("Sender : "+ sender);
		
		phoneNumber = message.substring(message.indexOf("[")+1, message.indexOf("]"));
		System.out.println("Number : "+ phoneNumber);
		
		mainMessage=  message.substring(message.indexOf("{")+1, message.indexOf("}"));
		System.out.println("Message: "+ mainMessage);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
