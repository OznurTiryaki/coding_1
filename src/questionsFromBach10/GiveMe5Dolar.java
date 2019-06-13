package questionsFromBach10;

import java.util.Scanner;

public class GiveMe5Dolar {

	public static void main(String[] args) {
		
//Ask for 5 dollars
//keep asking for 5 dollar until you get it
		// or user enters it.
		
		Scanner scan= new Scanner(System.in);
		
		int amount;
		
		do {
			
		 System.out.println("Give me 5 dollar");
		   amount=scan.nextInt();
		
			
		}while (amount !=5);       //condition dogru ise loop devam eder
		
	
		System.out.println("FInally I have 5 dollars");
	}

}
