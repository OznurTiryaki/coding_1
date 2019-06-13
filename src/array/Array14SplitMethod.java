package array;

public class Array14SplitMethod {

	public static void main(String[] args) {
		
		
		String words ="java-selneium-cucumber-testing-junit-eclipse-maven-git-github";
		
		//words.split ("-");  // take an String and cut it ang give us array
		
		String[] splittedWords = words.split("-");  
		
		System.out.println(splittedWords.length);   // bu bize kac array oldugumuzu verir
		
	//	System.out.println(splittedWords[0]); //boyle yazdirirsak bize O'inci Stringi verir oda java
		
		for (String w :splittedWords) {   // bu sekilde de hepsini array disina cikardik
			System.out.println(w);
		}
		
		
	System.out.println("___________************_____________");
	
	//task find how many words in String
	
	String searchResults = "All categorieg \"wooden spoon\" 13,623 Results. ";
	
	String[]splitted = searchResults.split(" ");   //ikisi yerine direk System.out.println(searchResults.split(" ").length); seklinde de yapabilirsin
	
	System.out.println(splitted.length);
	
	for(String each :splitted) {
		System.out.println(each);
	}
	
	System.out.println(splitted[4]);
	}

}
