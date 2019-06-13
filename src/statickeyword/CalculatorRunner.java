package statickeyword;

public class CalculatorRunner {

	public static void main(String[] args) {
		

	/*	Calculator.add(num1, num2)  when we write like this, eclipse not show us multiply
	because it is not static. to call that method we need to create a method
		
		
		*/

		
		System.out.println(Calculator.add(4, 5));
		System.out.println(Calculator.minus(5, 4));
		//System.out.println(Calculator.multiply(4, 5)); this is not static this not be compile
		
		Calculator cal= new Calculator ();
		System.out.println(cal.multiply(4, 5));  //it is work now
		
		System.out.println(cal.add(4, 5)); //but we will able to use like that
		System.out.println(cal.minus(5, 4));//static method will work with object.
		
	//	Calculation.operation= "add"; it is not work with class name because it is static , we need object
	
		cal.operating="math caculations" ; //it compile because it has object and it is non-static
	
	
	}

	
}
