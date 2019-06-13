package questionsFromBach10;

import java.util.Scanner;

public class MuradilString1 {

	public static void main(String[] args) {
		

//		Write a Program Checkwords:
//		Program accept 3 words
//		- if they are same lenght: 
//			print ("All words are same lenght")
//        - if some same length and other not:
//	        print ("Not Same nor Different lenght")
//	    -if All different Lenght
//	        print("all different lenght")
		
		Scanner scan =new Scanner (System.in);
		
		String word1 = scan.next();
		
		String word2 = scan.next();
		
		String word3 = scan.next();

	if (word1.length() == word2.length() && word2.length()== word3.length()){
	
	System.out.println("All words are same lenght");
	
	}else if (word1.length() == word2.length() || word2.length()== word3.length () || word1.length() == word3.length()) {
	
		System.out.println("Not Same nor Different lenght");
	
	}else {
		System.out.println("all different lenght");
		
	}
}
}