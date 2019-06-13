package inheritence1;

public class RecycleBin extends Bin {

//	String contents;
//	String types;
	//also inherid methods too
	
	public RecycleBin() {
		super("recycle bin");   //calls parent class constructor
		

		//super can be used only within constructor to call parent class constructor.
}
	public RecycleBin (String  typeOfRecycleBin) {
		super(typeOfRecycleBin);    //we call again constructor from other class
	}
}
