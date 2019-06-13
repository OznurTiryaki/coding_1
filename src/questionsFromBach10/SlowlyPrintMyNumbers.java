package questionsFromBach10;

public class SlowlyPrintMyNumbers {

	public static void main(String[] args) throws InterruptedException {
		
		int x = 1;

		while (x <= 10) {

			System.out.print(x + " ");

			x++;
			
			Thread.sleep(1000); //1000 millisecond 1 second bunu koyarsan daha yavas yazar,
			                     //declaration secenegini sececeksin
			
		}
		

	}

}
