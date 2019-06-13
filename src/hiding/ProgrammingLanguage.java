package hiding;

public class ProgrammingLanguage extends Language {

//   public String name= "General Language";
//	
//	
//	public static void staticMethod () {
//		System.out.println("Language - static method" );
//	
//	}
//	
//	public void printName() {
//		System.out.println("Language: " + name);

	public String name = "Programming Language-Java";

	// if we create same method also here

	public void printProgrammingName() {
		
		System.out.println("Programing Language: " + name);
	}
		// bu sefer pl.printName(); we created method/ ProgrammingLanguage
		// objesi ile cagirilinca aynisindan kendi sinifinda da oldugu icin digerini
		// hide edecek.
		
		//hiding static method
		
	public static void staticMethod() {
			System.out.println("ProgrammingLanguage-static method");
		}

}
