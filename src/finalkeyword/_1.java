package finalkeyword;

public class _1 {
	
	private final String SCHOOL_NAME;  //we will do in class too
	
	public static final int MAX_NUMBER_OF_STUDENTS;   //static one cannot call in constructor
	//it can be run in static block
	
	public static final String ETSY= "https://etsy.com";
	
    //static block
	static {
		MAX_NUMBER_OF_STUDENTS=50;
	}
	
	
	//constructor
	public _1 () {
		SCHOOL_NAME= "Cybertek";  //local variables, we can declare then initialize in  the next/below 
		//constructor run always, and when it run, it assign the school name
		
	//	final instance variable initialize in same line or in init block, constructor
	
	}
	
	public static void main(String[] args) {
	 
	   final int MAX=100;
	  
	//static final variable should be same line, static block
	   
	   // MAX=100; not compile, we cannot assign it again
	 
	 System.out.println(MAX);
}
}
