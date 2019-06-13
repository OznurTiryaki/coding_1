package wrapperClass_ArrayList;

public class _2CreatingWrapperClasses {

	public static void main(String[] args) {
		
		//Create Wrapper class objects
		
		Integer n1 = new Integer (100);   //most easiest way
		
		Integer n2 = Integer.valueOf(456);
		
		Integer n3 = Integer.parseInt("2345");  //convert from String to Int
		
		Double d1 = new Double(123.45);
		
		Double d2 = Double.valueOf(345.9);
		
		Double d3 = Double.parseDouble("1000.3");
		
		System.out.println(d3);
		
		//similarly we can do with other Wrapper classes as well
		
		
		//isDigit
		char ch3 = '3';
		System.out.println(Character.isDigit(ch3));  //turn boolean--> true
		
		System.out.println("**************************");
		
		String str = "ab5c";
		
		System.out.println(Character.isAlphabetic(str.charAt(0)));     //true
		System.out.println(Character.isAlphabetic(str.charAt(2)));    //false  because it is number not letter
		
		System.out.println("**************************");
		
		System.out.println(Character.isUpperCase('A')); //true
		System.out.println(Character.isUpperCase('a'));  //false
		System.out.println(Character.isLowerCase('a'));  //true
		System.out.println(Character.isLetter(ch3));//false
        System.out.println(Character.isLetterOrDigit('1'));//true   harf mi rakam mi harf veya rakamsa true;
        System.out.println(Character.isLetterOrDigit('e'));//true
        System.out.println(Character.isLetterOrDigit('*'));//false
        System.out.println(Character.isLetterOrDigit(' '));//false
	}

}
