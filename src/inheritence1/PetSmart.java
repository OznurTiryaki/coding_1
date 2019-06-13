package inheritence1;

public class PetSmart extends Store{
    //we need to add parent class' constructer
	//for that we need to add constructor to call constructor
	//it doesnt matter with arg and no arg
	
	public PetSmart () { //we add no arg for sub class, to call const
	super("PetStore");  //you can call least one//WE DONT HAVE TO CALL ALL
	
	
	}
	public PetSmart(double rent) {
		super("PetStore",rent);  
	//	this(); THIS IS NOT COMPILE , BOTH NEED TO BE FIRST STATEMENT
	}
}
