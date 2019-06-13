package inheritence1;

public class StoreTest {

	public static void main(String[] args) {
	
		Store store1= new Store("Grocery");   //Store constructer with Type : Grocery
		Store store2= new Store(10000.0);    //Store constructer with Type : Grocery
		       
        Store store3= new Store("Computer Store", 5123.78);
      //Store constructer with Type : Computer Store and rent: 5123.78
        
        System.out.println("============PetSmart====================");
        
        PetSmart p1= new PetSmart ();  
        
        /*step1:go to the petSmart's no arg constructor 
        step2: it call  super("PetStore");  from super class
        step3; go and find one parameter constructor from super class
        step4: it incude --->
	 Store (String type){
		 this.type=type;
		 System.out.println("Store constructer with Type : " + type);
		 
	 }
		 step5:it takes PetStore name and print.
		 
		 
		 
         */
        System.out.println("======PetSmart With rent object Creation===================="); 
        
        PetSmart p2= new PetSmart (1234.6);  
        
        /*step1:go to the petSmart's 1 arg constructor 
        step2: it call  super("PetStore",rent);    from super class
        step3; go and find two parameter constructor from super class
        step4: it incude --->Store (String type, double rent){
		                      this.type=type;
		                      this.rent=rent;
		 System.out.println("Store constructer with Type : " + type + " and rent: " + rent); 
		 
		 step5:it takes PetStore name and and print.
		   */
	}

}
