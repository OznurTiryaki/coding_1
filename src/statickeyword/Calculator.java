package statickeyword;

public class Calculator {

	public String operating; //it is non static, so to print it we need to create object
	
	
	public static double add(double num1, double num2) {   //it is static we don't need to create an object
		return num1+num2;
	}
	
	public static double minus(double num1, double num2) {
		return num1-num2;
	}
	public double multiply(double num1, double num2) { //this is not static
		
		return num1*num2;
	}
//	public static double multiply2(double num1, double num2) {
//		System.out.println(multiply (num1,num2));
//	}  it is nor compile, you cannot call static method with non static methods
}
