package encaplation_constructor;

public class CarRunner {

	public static void main(String[] args) {
		

		Car carmax= new Car();  //whenever we create object it goes otomatically
		//method it is same name with class name not include return type, void or static
		carmax.setType("Sedan");
		carmax.setMake("Toyota");
		carmax.setModel("Camry");
		carmax.setSpeed(220);
		
		System.out.println(carmax.getType());   //run etmek icin hep sysout icinde yaziliyor
		System.out.println(carmax.getMake());
		System.out.println(carmax.getModel());
		System.out.println(carmax.getSpeed());
		carmax.accellerate(30);
		 
		
		Car enterPrice= new Car();   //it is print again  Car method/ constructor
		System.out.println(enterPrice.getType());   //we didnt initialize the  type vs. 
		  //but it didnt print null because we did in costructor as unknown 
		System.out.println(enterPrice.getMake());
		System.out.println(enterPrice.getModel());
		
		Car carThree=new Car("Coupe", "Ford", "Mustang");
		
		System.out.println(carThree.getType());	
		System.out.println(carThree.getMake());		//we dont need to call any addditional method
		System.out.println(carThree.getModel());		
	}

}
