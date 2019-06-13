package staticAndInitilazeBlock;

public class Blocks {

	
	static int num =100;
	
	static String str;
	
	static {
		System.out.println("Static block");
		num= num+1000;
		str="Hello";
		
	}
	
	{
		System.out.println("initializer block");
		num=num+500;
		str=str+"world";
	}
	
	public Blocks () {
		
		System.out.println("constructor");
		num= num*2;
		str= str+"!!!";
		
	}
}
