package encaplation_constructor;

public class Product {
  
	private String name;
	
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
		return "Name is " + name;
	}
}	
	

