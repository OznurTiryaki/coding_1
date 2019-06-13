package questionsFromBach10;

import java.util.Scanner;

public class WhileLoopTask {

	public static void main(String[] args) {

		/*
		 * writes a program that takes string word and converts first letter to
		 * uppercase ans the rest to lowercase, Print after conversation.
		 * 
		 * Write a program to print numbers from 1 to 10 in same line separated by space
		 * 
		 * Write the program to print number from 10 to 1 in same line, separated by
		 * space
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		// substring to take first letter of the word //bu sekilde yazmamizda sikinti
		// yok cunku zaten ikinci yazdigimizin bir oncesini okuyor.

		// or
//	System.out.println(word.substring(0,1).toUpperCase()); //once substring okur daha sonra Uppercase //its call string manipulation

//	System.out.println(word.substring(1).toLowerCase()); //sadece bir koyduk, 1 den basladi geriye dogru yazdi.

		Scanner scan = new Scanner(System.in);

		String word = scan.next();

		word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

		System.out.println(word);
		
		System.out.println("********************");

		int x = 0;

		while (x <= 10) {

			System.out.print(x + " ");

			x++;
		}
		System.out.println();

		int y = 10;

		while (y >= 0) {

			System.out.print(y + " ");

			y--;
		}

	}

}
