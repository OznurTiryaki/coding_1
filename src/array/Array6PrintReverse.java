package array;

public class Array6PrintReverse {

	public static void main(String[] args) {
//first check it is 10 item or not		
//		create int array point assign 10 different score and numbers between 100-0
		
		int [] points = new int [] {2,3,19,55,44,22,1,4,6,88};

		if (points.length ==10) {
			
			System.out.println("it is 10 items");
			
		}else {
			
			System.out.println("it is not 10 items");
		}
		
//		for (int x = points.length-1 ; x>=0 ; x--) {
//			System.out.println(points [x]+ " ");
//	}	
			int x = points.length-1;
			while (x>=0) {
			System.out.println(points [x]+ " ");
		    x--;
			}
			
		}
	}


