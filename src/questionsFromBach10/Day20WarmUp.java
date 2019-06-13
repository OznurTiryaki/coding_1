package questionsFromBach10;

import java.util.Scanner;

public class Day20WarmUp {

	public static void main(String[] args) {

//		ask user to enter 2 numbers for variables and end;
//				
//				if start is less than end: loop from start position to end position 
//				and print step+ number
//				
//				id starts is more than end: loop backwards from end to start and print "Step"+ number
//				
//				Ex: enter 2 numbers
//				5 10
//				step 5 6
//				
//				enter two number 
//				10 5 
//				step 10 
//				step9 //geriye dogru gider

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number");
		int start = scan.nextInt();
		int finish = scan.nextInt();
		
		if (start < finish) {
			
		
		while (start<=finish){
			
			System.out.println("Step " + start);
			start++;
		}
		}else if (start > finish) {
		
		while (start >=finish ){
		System.out.println("Step " + start);
		start--;
		}
		}
}
}