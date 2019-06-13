package array;

public class Array4PrintArrayValues {

	public static void main(String[] args) {
		//create an array cars and directly assign foolowing values;
		
		//Audi, Porsche ,BMW , Toyota , honda, Tesla, dodge, kia, Acura , fiat
		
		String [] cars = new String [] {"Audi", "Porsche" ,"BMW" , "Toyota" , "Honda", "Tesla", "Dodge", "Kia", "Acura" , "Fiat", "Ford"} ;
		
	    System.out.println(cars.length); // bu bize kac String oldugunu gosterir
	                                     // array uzunlugunu
		
		for (int x =0 ; x < cars.length;x++) {
		System.out.println(cars [x]); //busekilde sqaure brakets icinde yazmazsak bozuk print eder
		}
		
		
		System.out.println("----------FOR EACH LOOP------------"); 
		
		//print all values using a for each loop
		
		for (String car : cars ) {  // type must match with array type cars was String and we use String
             //left side any name--right side array                       // u can use this kind of loop in array and 
			System.out.println(car);
		}
	
			
	}

}
