package staticAndInitilazeBlock;

public class BlockRunner {

	public static void main(String[] args) {

		System.out.println(Blocks.num);   // 1100
		System.out.println(Blocks.str);   // Hello
		
		//henuz bir object create etmedigimiz icin sadece
		//static block 'u cagirdi
		//it call satic nlock firstly and just one time

		System.out.println(Blocks.num);   //1100
		System.out.println(Blocks.str);   // Hello
	//	each time when we call the class name, it print static block
    //  when we create object it call instance block
		
		Blocks b1= new Blocks ();  //it print init block when we call object
		Blocks b2= new Blocks ();
		
		System.out.println(b1.num);     //7400
		System.out.println(b2.str);     //Helloworld!!!world!!!
		System.out.println(b2.num);
		
		
		System.out.println(b2.num);
		System.out.println(b2.str);
		
	}

}
