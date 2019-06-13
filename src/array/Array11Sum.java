package array;

public class Array11Sum {

	public static void main(String[] args) {
	

		int [] nums =  new int [] { 5,9, 68, 12, 35};
		
		int sum=0;
		
		int sumOfEvens = 0;
		
		int sumOfOdds = 0;
		
		for (int num :nums) {
			
			sum +=num;	
			
			if (num%2==1) {
			
				sumOfEvens +=num;
				
			}else {
				sumOfOdds +=num;
			}
			
		}
			System.out.println(sum);
			System.out.println("Sum of evens is " + sumOfEvens);
			System.out.println("Sum of odds is " + sumOfOdds);
	}

}
