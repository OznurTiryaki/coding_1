package questionsFromBach10;

import java.util.Scanner;

public class String_StartEndWords {

	public static void main(String[] args) {
		
//		you have two words that must be 5 character
//		and check if last letter of first word and first letter of second work are same
//		if either one not 5 charac legth:
//		print "need to be exactly 5 chars legth"
//		if last letter of 1st word and first letter of 2nd word match
//		print "Fizz"
//		if they do not match
//		print "Buzz- did not match"
		
		Scanner scan = new Scanner(System.in);
		
		String word1 = scan.next();
		String word2 = scan.next();
		
		char lastCharacWord1 = word1.charAt(word1.length()-1);
		char firstCharacWord2 = word2.charAt(0);
		
		
		
		if (word1.length() !=5 || word2.length() !=5  ) {   //it check just 5 karakter obur conditionlar icin nested yapmamiz lazim
			System.out.println("need to be exactly 5 chars legth");
			
		}else if (firstCharacWord2==lastCharacWord1) {

			System.out.println("Fizz");
			
		}else { 
			
			System.out.println("Buzz, not match");	
		}
	}

}
