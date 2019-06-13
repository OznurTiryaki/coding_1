package staticAndInitilazeBlock;

public class ClassWithStaticBlock {

	
	static {
		
		System.out.println("This is static block.I runs once at the beginning"); 
	}
//	
	
	{
		
		System.out.println("This is instance block.I runs once at the beginning"); 
	}
	public ClassWithStaticBlock () {
		
		System.out.println("This is constructor.I runs everytime when object created"); 
	}
//	public static void staticMethod() {
//		System.out.println("This is static method");
//	}
}
