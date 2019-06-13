package staticAndInitilazeBlock;

public class StaticBLockRunner {

	public static void main(String[] args) {
		

//		ClassWithStaticBlock.staticMethod();   //it is call method and just one time
//		//print static
//		ClassWithStaticBlock.staticMethod();

		
		ClassWithStaticBlock one= new ClassWithStaticBlock ();
		ClassWithStaticBlock two= new ClassWithStaticBlock ();
		ClassWithStaticBlock three= new ClassWithStaticBlock ();
		
		//if we dont write the static method it just write a static block when we create a object
		//if we call static method, we don't have to create a object to print static 
		
		
		// if we have a instance block and and first call static method , it not print our instance block,
		//because instance block just came when we create object
	}
	
	/*if we add static and initialize block, when we call static method, it print firstly our 
	/static block. When we create object also it call initialize block 
	
	This is static block.I runs once at the beginning
	This is static method
	This is static method
	This is instance block.I runs once at the beginning
	This is constructor.I runs every time when object created
	This is instance block.I runs once at the beginning
	This is constructor.I runs every time when object created
	This is instance block.I runs once at the beginning
	This is constructor.I runs every time when object created
	
	*/

/*	When we delete our static method it print like code flow.
	
	This is static block.I runs once at the beginning  //first block print first
	This is instance block.I runs once at the beginning
	This is constructor.I runs every time when object created
	This is instance block.I runs once at the beginning
	This is constructor.I runs every time when object created
	This is instance block.I runs once at the beginning
	This is constructor.I runs every time when object created

*/

}
