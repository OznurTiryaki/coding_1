package methods;

public class Method2 {

	public static void main(String[] args) {
		
		askHowRU ();  // bunu sysout icinde yazarsan compile olmaz, cunku void olur methoddan cikar
        reply();         //void de no return value.
        sayBye ();
	}
	
	public static void askHowRU () {
		System.out.println("How are you doing?");
	}
		
	public static void reply () {
		
		System.out.println("I'm doing well, How about you?");
		
	}
	public static void sayBye () {
		
		System.out.println("Bye! Have a good day!");
	}

}
