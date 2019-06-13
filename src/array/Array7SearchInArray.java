package array;

public class Array7SearchInArray {

	public static void main(String[] args) {
		

//		create array nums and assign 10 different numbers to it
//		search for a number 100 in it using a loop, once fount print the index
//		location and "value found at index " + index
//        if that search value is not found print "100 not found in the array"
//        once you find 100 then exit the loop at that point,
//      
		
		boolean found =false; //simdilik buna false desek
		int [] nums = new int [] {3,5,8,100,10,100,6,9,11,24};  //sifirdan balagi icin indeximiz 3 olur.
		for (int x = 0; x <nums.length-1 ; x++) {
		
			if (nums [x] == 100) { 
				System.out.println( "100 was value found at index " + x );
				found =true; // eger bulursak bu degeri true'ya donustur diyoruz
				break;  //bulduktan sonra dur cunku biz sadece ilk 100'u ariyoruz //break'i silersek kac tane 100 varsa yazdirir
		}
		}
		if (found ==false) {   //bunu loop disinda yazma nedenimiz surekli her bulamadiginda yazmasini istemiyoruz.
			System.out.println( "100 not found in the array");
		}
	}

}
