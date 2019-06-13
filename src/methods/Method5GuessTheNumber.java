package methods;

import java.util.Random;

public class Method5GuessTheNumber {

	public static void main(String[] args) {
		
	//	playGuessNUmComputerOnly ();

		playGuessWithlimit(5); 
		
		//playGuessNUmComputerVSMe (int secretNum)
	}
	
	
	public static void 
	playGuessWithlimit(int limit) {
		
		Random rand=new Random();
		
		int secretNumber = rand.nextInt(21);
		
		int count=0; 
		do {
			count++;
			int guessNumber=rand.nextInt(21);
			
			System.out.println("Guessing : " + guessNumber+" Counter: " +count);
		
			if (guessNumber==secretNumber) {
				System.out.println("You won! Guessed the Secret Number!");
			
				break;
			}else {
				
				
        System.out.println("Wrong! Try again");
		}
			if(count==limit) {
				System.out.println("you lost!Game over!");
				break;
			}	
		}while(true);
		
		
		
		
	}

}
