package inheritence;

public class CarMax {

	public static void main(String[] args) {
		// create object of vehicle class
		//instantiation of vehicle class

		Vehicle vehicle=new Vehicle();
		vehicle.makeAndModel="Subaru Outback";
		vehicle.year=2018;
		vehicle.maxSpeed= 140;
		vehicle.drive();   //Driving
		vehicle.stop();    //Stopping
		//vehicle.hoursePower; and vehicle.doUber()yapamazsin 
				//cunku hoursePower is in sub class
				//not in vehicle class
		vehicle.mileage=12345; //it work because they is a relation 
		//mileage is in Electric car class
		
		//normally for class we didn't create anything but we inherit
		//from vehicle class 
		Car car= new Car(); 
		car.makeAndModel= "Toyota Prius";
		car.year=2015;
		car.maxSpeed=120;
		car.drive();   //Driving
		car.stop();    //Stopping
		car.hoursePower=150;  //it is under car class
		car.doUber();      //it is under car class
		car.mileage=345; //it work because they is a relation 
		//mileage is in Electric car class

		
		
		
		
		/*Vehicle--->super/base/parent class
		 
         public class Vehicle {
		  
		 * Car--->sub /child class
		 
		 public class Car extends Vehicle {
		 
		 * carMax--> main method is here
		 * there is no inheritance relation between CarMax and Vehicle or Car
		 * we are just creating objects there
		 * it is just a runner class
		 * 
		 */
		
		System.out.println("========Train==========");
		Train train=new Train ();
		train.makeAndModel="CyberTrain 11";
		train.year=2019;
		train.leaveStation();
		train.mileage=876;
		
		
		System.out.println("=========ELectric Car=============");
		ElectricCar tesla= new ElectricCar();
		tesla.makeAndModel="Tesla Model-S";
		tesla.year=2018;
		tesla.hoursePower=518;
		tesla.mileage=54321;
		
		tesla.doUber();
		tesla.charge();
		tesla.drive();
		tesla.stop();
		System.out.println("Has Battery? " +  ElectricCar.hasBAttery);   
		//ElectricCar.hasBAttery call with class name because it is static
		
		
		System.out.println("=========statix service calls===========");
		Vehicle.service();
		Car.service();
		Train.service();
		ElectricCar.service();   // static methods we will call with class name.
		//it inherit for all classes//thats why not we just call from vehicle class
	}

}
