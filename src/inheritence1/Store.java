package inheritence1;

 public class Store {
	
	 private String type;
	 private double rent;

	 
	 Store (String type){
		 this.type=type;
		 System.out.println("Store constructer with Type : " + type);
		 
	 }
	 
	 Store (double rent){
		 this.rent=rent;
		 System.out.println("Store constructer with Rent : " + rent);
		 
	 }
	 Store (String type, double rent){
		 this.type=type;
		 this.rent=rent;
		 System.out.println("Store constructer with Type : " + type + " and rent: " + rent); 
	 }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}
	 
	 
}
