package encaplation_constructor;

public class ProductRunner {

public static void main(String[] args) {
		
		Product p1= new Product ();
		Product p2= new Product ("Sony Play Station");
		
		System.out.println(p1.toString());
		System.out.println(p2);
		
		
		Electronics el=new Electronics ("Dyson vacumm V8", 450.50);
		
		System.out.println(el.toString());   //we didn't create to String method at sub class, but it inherit from super class
		
	}
	}

