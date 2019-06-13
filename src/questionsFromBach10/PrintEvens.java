package questionsFromBach10;

public class PrintEvens {

	public static void main(String[] args) {
		/*
		 * 
		 * using if condition within while loop
		 * start variable number with 1
		 * and loop until 100
		 * check if number is even 
		 * if it is even print number
		 * 
		 * 
		 */
		
		int x = 1 ;
		
		while (x <= 100) {
			
			if (x%2 == 0) {
			
			System.out.print(x + " ");
			
			}
			x++;	//bunu if in icine koysaydik yazdirmazdi.
		}

	}

}
