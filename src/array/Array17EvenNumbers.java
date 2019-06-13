package array;

public class Array17EvenNumbers {

	public static void main(String[] args) {
		// Count even (cift) numbers in Array

		int[] nums = { 2, 1, 2, 3, 4 };

		int count = 0; // if increase we will see how many even number inside

		for (int n : nums) {
			if (n % 2 == 0) {
				count++;
				System.out.println("even number:"+ n);
			}
		}
		System.out.println(count);
	}

}
