package array;

public class Array8CountMatches {

	public static void main(String[] args) {
		
//		create a double array called prices
//		assign 10 or more different prices
//		using a loop count how many items that is more than 20 dollars
//		print the count 
//		if no price was found that is more than $20 then print
//		"no items thats cost more than $20"
		
		int count= 0;
		//boolean found = false;
		
		double[] prices= new double [] { 1.2, 4.5 , 5.6 , 4.3 ,66.7 , 112.2 ,5.2 , 7.3 ,6.8 ,9.7 };
		
//		for (int x =0 ; x< prices.length -1 ; x++) {  //or bunun yerine for each loop yapabiliriz 
//			if( prices [x] > 20.0) {
//				found=true;
//				System.out.println("Prices: "+ prices [x] + " Price place is: " +x);
//				count++;
//			
//			}
//			}
//		if ( found==false){
//			System.out.println("no items thats cost more than $20");
//		}
//		System.out.println(count);
//		
//		Second version
//		
		for (double price : prices){
		if (price >20.0) {  //artik price kullanabilirim
			count ++;
		}
		}
		if (count==0) {
			System.out.println("no items thats cost more than $20");
		}else {
			System.out.println(count+ " items more than $20");
		}
		}
	
	}


