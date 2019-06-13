package inheritence;

public class ElectricCar extends Car {
	//Vehicle> car> electric car
	
	public static boolean hasBAttery=true;
	public int batteryLevelMiles;
	
	public void charge() {
		
		System.out.println("Charcing Electric Car");
		batteryLevelMiles=250;
	}
	
  /* this come from car class
   
    int hoursePower;
	
	public void doUber() {
		System.out.println("Ubering after Java class");
	
		and car class use vehicles variables
		//	All include from vehicle class
	
//	public String makeAndModel;
//	public int year;
//	public int maxSpeed;
//	
//	public void drive() {
//		System.out.println("Driving");
//	}
//	
//		public void stop() {
//			System.out.println("Stopping");
//		}
*/
}
