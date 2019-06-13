package questionsFromBach10;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner (System.in);
		
		Random random = new Random ();  //RAndom is class name to generate random numbers
		
		
		
	//System.out.println(random.nextInt(10));  //yani diyorki int olsun ve 10 araliginda bir sayi olsun
     
		int secretNumber =random.nextInt (10);  //we dont know value come random //YUKARIDAKI GIBI DE YAZABILIRSIN AYNI SEY
		
		int guessNumber;
		int iTries =0; 
		
		// System.out.println("Num value: " + secretNumber);
		
		do {
		
		System.out.println("Enter a guess a number "); 
		
		guessNumber= scan.nextInt();
		iTries++;
		
		 if (guessNumber == secretNumber) {
			 System.out.println ("Congrats! you win");
			 break;   //we said if they know break don't read 
			 
		 }else {
			 System.out.println ("Incorrect guess, try again");
		 }
		 
		 if (iTries ==5) {
			 System.out.println("you lost");
			 System.out.println("Secret number is : " +secretNumber); 
			 break; //5 i gectiyse break don't read
			 
		 }
		
		}while(secretNumber!=guessNumber);   //bunun altina bir sey yazmamiza gerek yok, ona kadar kontrol et diyoruz
		 System.out.println("not same number");
		
		
	}

}
