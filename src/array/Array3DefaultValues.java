package array;

public class Array3DefaultValues {

	public static void main(String[] args) {
	
		
//		Whenever we declare an array with size, depending on what type is it, 
//		it will get default values assigned.

		int [] arr = new int [3]; //(normalde bunu yazdigimizda 0 , 0 , 0  seklinde icine deger veriyor)
		
		//eger biz bir deger vermezsek arr' a o zamn print ettgimizde sifiri verir.
		
		System.out.println(arr [0]); //hepsi sifir olarak donus yapti cunku bir assign yapmadik
		System.out.println(arr [1]); 
		System.out.println(arr [2]); 
		
		//byte, short, int, long arrays will get default values of 0.
        // float and double turn as 0.0 
		// char  turn as ' '
		// boolean turn as false
		// String turn as null
		//and other object value get null value
}
	
}
