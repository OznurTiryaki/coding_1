package methods;

public class Methods9GetMax {

	public static void main(String[] args) {
		// get 2 int and return larger one

		
		System.out.println(getMax (3,5));
		
		System.out.println( getLast (9,5,7));
		//or
		int max=getLast (9,5,7);
		System.out.println(max);
	}
  
	
	
	public static int getMax (int num1, int num2) {
	     
		int largest;
		
		if (num1>num2) {
			largest= num1;
			
		}else {
			largest=num2;
		}
		return largest;
		
   }
	public static int getLast (int num1, int num2 ,int num3) {
		
		
		
		if (num2 > num1 && num3>num2) {
			return num3;
		}else if (num2 > num1) {
			return num2;
		}else {
		return num1;
	}
	}
}
