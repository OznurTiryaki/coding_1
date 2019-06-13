package overriding;

public class CampusStudent extends Student{

	
//	public void attentAClass() {
//		System.out.println("Student attend a class somehow");
//	}
	///without changing any parameter, it says i have my own situation[
	//same method  customize with 
	
	//When an inherited method is re-created in Sub class with same method name, same parameters
	//same return type this process is called method overriding.
	
	/*
	 * When we do overriding?
	 * Whenever a method is inherit and sub class is not happy about its implementation,
	 *  then sub class, we can override the
	 * method to customize it
	 * 
	 * 
	 */
	public void attentAClass() {
		System.out.println("Campus student attend a class in the classroom");
	}

}
