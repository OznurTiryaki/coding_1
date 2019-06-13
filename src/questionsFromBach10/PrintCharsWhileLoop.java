package questionsFromBach10;

import java.util.Scanner;

public class PrintCharsWhileLoop {

	public static void main(String[] args) {
		

	
//	
//	//Write a program that accepts A string word
//	and using while loop and charAt print each character in seperate line
	
	Scanner scan= new Scanner (System.in);
		
	System.out.println("Enter word: " );
	
	String word =scan.next();
	
	int index = 0 ;    //geriye dogru yazdiricaz ve bu degeri arttiricaz
	
	while (index < word.length()) {      //diyoruz ki baslama harfimiz sifir her halukarda onun kendi uzunlugundan kucuktur, cond. true
		
		
   
		System.out.println((word.charAt(index)));    //yani ilk harfinden basla cara ve arttirarak diger numaralarini loppta yaz
		index ++;


	}
	}
}
