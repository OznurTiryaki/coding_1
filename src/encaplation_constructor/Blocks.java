package encaplation_constructor;

public class Blocks {
/////////////////////
// bu static variable olmasaydi asagidakiler compile edemezdi
//!!!!static sadece static KABUL EDER!!!!!!
	static int num = 100; // custom default
	static String str;
////////////////////
//STATIC BLOCK first comer
	static {
		num = num + 1000; // runs with class
		str = "Hello";

	}

	/*
	 * ==>>> static variableles and blocks IMPORTANT EXECUTE ONCE IN THE BEGINNING
	 * BEFORE ANYTHING ELSE static variable need to declared first then we can use
	 * it in static BLOCK
	 */
//static int num = 100; // THIS DECLARATION IS NOT OK
//static String str; 
/////////////////	
//INIT. BLOCK
	{
		num += 500; // bu sadace object olursa apply olur
		str = str + "wolrd";
	}

///////////////////////	
//CONSTRUCTOR
	public Blocks() { // bu sadace object olursa apply olur
		num = num * 2;
		str = str + "!!!";
	}

}
