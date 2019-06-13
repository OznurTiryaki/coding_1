package methods;

public class Method12CallFromOtherClasses {

	public static void main(String[] args) {
		// call method from Method11CompareCalcolator classes
		//medhods names (ayni paket icinde olmasini bekliyor
	// 	 TO CALL METHOD WE HAVE TO DO USE CLASS NAME

//		add(100, 30);
//		sub(100, 30);
//		mult(100, 30);
//		div(100, 30);
//		mod(100, 30);
//		calculate('*', 100,30);
		
		int result =Method11CompareCalcolator.add(100, 30);  // bu sekilde yaziyoruz cunku no void
		                                                     //it is more usefull you can do something like
		if (result ==7.0) {   // bu sekilde islem yapabilir yada yazdirabiliriz ancak void de direk yazdiriyoruz, store yapamiyoruz .
			System.out.println("PASS");
			
		}else {
			System.out.println("FAIL");  
		}
	
	}

}
