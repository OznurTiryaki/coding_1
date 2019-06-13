package customClass;

public class CellPhoneFactory {

	public static void main(String[] args) {

		CellPhone phone1 = new CellPhone();  ///different object thats why when we say 
		//phone2.brand it not change phone1.brand
		//WITHOUT CREATING OBJECT , YOU CANNOT USE ALL THESE 
		//OR YOU CANNOT CALL METHOD  

		phone1.brand = "Apple";
		phone1.color = "Space Grey";
		phone1.price = 999.0;

		System.out.println(phone1.brand);
		phone1.call();
		phone1.text();

		CellPhone phone2 = new CellPhone();   //create 2 cell phone objects variables

		phone2.brand = "Ericson 1018";  //assign value to object variables
		phone2.color = "Silver";
		phone2.price = 30.5;

		CellPhone phone3 = new CellPhone();  //when we create something like that, it name instance or object

		phone3.brand = "HTC Evo";
		phone3.color = "Black";
		phone3.price = 350.99;

		phone2.call();
		phone3.text();
		
		//calculate total price for all 3 phone
		
		double total= phone1.price+phone2.price+phone3.price;
		System.out.println("Total for all 3 phones : " + total);
		
		//can we updated object values
		phone1.price = 1200.0;   //updated more expensive bow
		phone2.price = phone3.price ;  //now phone 2 have same price with 3 
	    
		total= phone1.price+phone2.price+phone3.price;
		System.out.println("Total for all 3 phones : " + total);
		
	}

}
