package encaplation_constructor;

public class Car {

	/*
	 * Encapsulated Instance variables:
	 * 
	 * String type String make; String model; int speed;
	 * add getter and setter method
	 * 
	 * method : void accelateres(int mph)
	 * increses, current speed value by mph value
	 * prints make type is accelerating
	 */

	private String type;
	private String make;
	private String model;
	private int speed;

	
	
	public Car () {
		System.out.println("This is constructor");
		
		type="unknown";
		make="unknown";
		model="unknown";
		
	}
	public Car (String type,String make,String model) {
		System.out.println("3 args constructor");// her halukarda bunu yazdirir 
		//yeni method olusturdugunda
		
		this.type= type;
		this.make=make;
		this.model=model;
		
	
	}
	public void setType(String type) {
		this.type = type;

	}

	public String getType() {
		return type;

	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}
	public void accellerate(int mhp) {
		speed= speed + mhp;
		System.out.println(make + " " +type+ " is accelerating "+ speed);
	}
}
