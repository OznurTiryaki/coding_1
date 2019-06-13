package methods;

public class Method13ConvertUtility {

	public static void main(String[] args) {
		// 

	//Write method mile 2 km accepts miles and return km value
	//	return type double
	//	parameters 1 double

		double km = turnMile(20.0);
		System.out.println(km);
		
		
		if (turnMile(20.0) < 35.0) {   // void kullanmamizin avantaji bu sekilde islem yapabiliyor olmamiz
			System.out.println("Speed is high");
		}else {
			System.out.println("Speed is low");
		}
		//second task
		//Method name : Fahrenheit To celcius
		//Action= accepts fahreneits and return celcius value
		//return type: int
		// Params; 1 int
		
		int celc= turnCelcius (72);
		if (celc ==22) {
		System.out.println("Test #1 passed");
		}else {
		System.out.println("Test #1 NOT passed");
		}
	}

	
	public static double turnMile(double km) {
		
		double miles = km * 1.6;     //  (	double miles =Method11CompareCalcolator.mult( km * 1.6);) bu sekilde baska bir sinifta carpma metodu da cagirabilirdik, 
		return miles;                // ama cagirirken metodun da double olduguna dikkat et, burada int oldugu icin method compile olmadi
	}                               //method icerisinden method cagirabiliriz.
	
	public static int turnCelcius (int fah) {
		int celcius = (fah-32)*5/9;
		return celcius;
	}
}
