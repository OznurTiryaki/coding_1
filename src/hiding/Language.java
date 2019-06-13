package hiding;

public class Language {
 
	
	public String name= "General Language";
	
	
	public static void staticMethod () {
		System.out.println("Language - static method" );
	
	}
	
	public void printName() {
		System.out.println("Language: " + name);
		staticMethod ();   
	}
}
