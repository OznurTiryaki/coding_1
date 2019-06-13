package staticAndInitilazeBlock;

public class DefaultValues {
       
	String i;
	
	public static void main(String[] args) {
		
		DefaultValues v1= new DefaultValues ();
		
		System.out.println(v1.i);
		
	//	System.out.println(v1.i.toUpperCase());  //it gave us null point exception error 

		v1.i="Oznur";    //now it is not null, so it will do
		
		System.out.println(v1.i.toUpperCase()); 
	}

	

}
