package methods;

public class Method19MethodSteps {

	public static void main(String[] args) {
		
		
		step (-5);   //jump
		step (5);    //step
		step (0);     //sit
	}
  
	public static void step (int n) {
		if (n < 0) {
			for (int i = 1; i <= -n; i++) {
				System.out.println("Jump " +i);
			} 
		}else if (n==0) {
			System.out.println("Sit");
		}else {
			for (int i = 1; i <= n; i++) {
				System.out.println("Step " +i);
		}
	}
}
}
