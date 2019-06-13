package methods;

public class Method10AccumalatorMethods {

	public static void main(String[] args) {

		// method getStars that accept an int and return string

		// it will return that many* s from method

		System.out.println(getStars(5));

		System.out.println(sumTon(6)); // or

		String mystars = getStars(9);

		System.out.println(mystars);
		
		int [] nums = {1,2,3,4,5};
		
		for (int n :nums) {
			System.out.println(getStars(n));
		}
}
		
		
		
	

	public static String getStars(int n) {
		
		String newStr = "";
		for (int i = 0; i < n; i++) {
			newStr += "*";
		}
		return newStr;
	}

	public static int sumTon(int n) {

		int total = n * (n + 1) / 2;
		return total;
	}

}
