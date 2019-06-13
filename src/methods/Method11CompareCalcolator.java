package methods;

public class Method11CompareCalcolator {

	public static void main (String [] args) {
		
		System.out.println(sum(3,5));
		System.out.println(add(3,5));
		System.out.println(sub(5,3) );
		System.out.println(mult(100,30));
		System.out.println(div(100,30));
		System.out.println(mod(100,30));
		
		
		System.out.println(calculate (100,30,'/'));
	}
	
	public static int calculate (int n1, int n2, char operator) {    //bir metod icinden bir suru diger methodlari cagirdik
		
		switch (operator) {
		case '+' :
			return add (n1,n2);  //we dont need break, return more powerful than break
		case '-' :
			return sub(n1,n2);
		case '*' :
			return mult (n1,n2);
		case '/' :
			return div (n1,n2);
		default :
			throw new RuntimeException("Erroe: Invalid Operator" + operator);
			
		}
		
	}
	
	public static int sum(int num1, int num2) {
		int sum = (num1 + num2)/2;
		
        return sum;
	
}
	public static int add(int num1, int num2) {
		int add = num1 + num2;
		return add;
	}
	public static int sub(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

	public static int mult(int num1, int num2) {
		int multi = num1 * num2;
		return multi;
	}

	public static int div(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}

	public static int mod(int num1, int num2) {
		int mod = num1 % num2;
		return mod;
	}
	
}
