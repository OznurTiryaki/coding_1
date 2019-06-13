package methods;

public class Method1 {

	public static void main(String[] args) {  //bunu yine de mutlaka koyman lazim
		
		sayHello();
		sayBye();
	}
	
	
	// it need to be outside your method main

	public static void sayBye() {  // budiger methoddan once yazildiysa da yukarda once digerini  
		                           //print ettigimiz icin onu verir
	
	  System.out.println("Bye! Have a great day!");
	}
	public static void sayHello() {
		System.out.println("hello"); //bunu yazdirmaz yukarda yazdirdigimizi yazdiriyor,
		                              // buradaki bizim methodumuz	sayHello(); bunu yazmayinca yazdirmaz
		System.out.println("baby");
	}

	
}
