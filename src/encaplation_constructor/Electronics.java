package encaplation_constructor;

 public class Electronics extends Product{

	 private double price ;
	 
	 public Electronics (String name,double price) {
	      super (name);
	      this.price=price;
	 }
	 
	 public Electronics () {
		 
			setName ("Unknown Electronics");   //it is method and turn the name==> burada methoda 
			//super("Unknown Electronics"); //it will also work===>burada constructor'a gider.
	 }
	 
	@Override 
	public String toString() { 
		//return "Name: " + getName() + " | Price: " + price;
		
		
		//name come from super class and it is private so we have to say, getName
		//price is private but we don't need to create get set in same class
		//we override the String but if we need old version too from Super class
		
		return super.toString() + " | Price " + price; 
	}
}

	 
	/* private String name;
		
		public Product () {
		this("unknown");
			
			}
		
		public Product (String name) {
			this.name=name;
		}	
		
		public String getName () {
			return name;
		}
		
		public void setName (String name) {
	       this.name=name;

		
		}	
		
		public String toString (){ //override to object
			return "Name is " + name;    */