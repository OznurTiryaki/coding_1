package methods;

import java.util.Scanner;

public class Method14Stringmethods {

	public static void main(String[] args) {
		
		/*
		 * Method : Reverse
		 * 
		 * parameters: 1 string
		 * 
		 * return typres :String 
		 * 
		 * it reverses the pram string and returns the result
		 */
     Scanner scan= new Scanner (System.in);
	 String name= scan.next();
		String reversed = reverse (name);
     System.out.println(reversed);
     System.out.println(isPalindrom (name)); 
		
	}
	
	public static String reverse (String name) {
		String newStr= "";
		int count=name.length()-1;
		while (count >= 0 ) {
			newStr += name.charAt(count)+"";
				count--;
			}
			return  newStr ;
		}

	/*
	 * method :isPalindorom
	 * param: 1 string
	 * return type boolean 
	 * if param String is turn true otherwise false
	 * 
	 * 
	 */
	
	
	public static boolean isPalindrom (String word) {
		String reversed="";
		int count=word.length()-1;
		
		while(count >=0) {
			reversed += word.charAt(count);
			count--;
		}
		if (reversed.equalsIgnoreCase(word)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isPalindromV2 (String word) {
	//	return reverse (word).equalsIgnoreCase(word);   // we will call method, which created before
		
		if (reverse (word).equalsIgnoreCase(word)) {    //usteki gibi tek seferde ya da bu sekilde ayri ayri yapabiliriz.
			return true;
		}
		return false;
	}
	
	
}
