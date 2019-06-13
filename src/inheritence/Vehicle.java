package inheritence;

public class Vehicle {

	public String makeAndModel;
	public int year;
	public int maxSpeed;
	public int mileage;
	 
	public void drive() {
		System.out.println("Driving");
	}
	
		public void stop() {
			System.out.println("Stopping");
			
		}
		public static void service() {
			System.out.println("Servicing the Vehicle");
		}
	}
