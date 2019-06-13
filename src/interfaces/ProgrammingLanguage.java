package interfaces;

public abstract class ProgrammingLanguage {
	
    //this class is not interfaces so too add it to RUby class we need to extends keyword
	//public class Ruby extends ProgrammingLanguage implements ScriptingLanguage, OOPLanguage{
	
	public abstract void buildApplication ();
	
	public void deploy () {
		
		System.out.println("Deploying Program to a server");
	}

}
