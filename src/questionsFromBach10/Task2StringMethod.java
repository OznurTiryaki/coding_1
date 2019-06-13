package questionsFromBach10;

public class Task2StringMethod {

	public static void main(String[] args) {
//		 contains method
//		
//		create a string variable garage and assign following string:
//		"Toyota, Nissan,Honda, BMW,  Mazerati, Ford"
//
//		convert whole garage into lowercase letters
//		if garage is Empty print no cars in garage
//		using contains method check

		String garage = "Toyota, Nissan,Honda, BMW,  Mazerati, Ford";

		garage = garage.toLowerCase(); // burada garage esittir koymasaydik stringi degistiremeyecektik ve hala ayni yazdiracakti
       
		System.out.println(garage);
		
		if (garage.isEmpty()) {
			
			System.out.println("No cars in garage");
		}
		
		if (garage.contains("toyota") || garage.contains("nissan")) {

			System.out.println("There is a Japaese car in garage");

		} else {
			System.out.println("No Japaese car in garage");

		}
		if (garage.contains("bmw")) {

			System.out.println("There is a German car in garage");
		} else {
			System.out.println("No German car in garage");
		}
		if (garage.contains("mazerati")) {

			System.out.println("There is a Italian car in garage");

		} else {
			System.out.println("No Italian car in garage");

		}
		if (garage.contains("jaguar")) {

			System.out.println("There is a British car in garage");

		} else {
			System.out.println("No Bristish car in garage");
		}

	}
}