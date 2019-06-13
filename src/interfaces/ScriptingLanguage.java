package interfaces;

public interface ScriptingLanguage {

	
	public static final boolean flexible=true;
	
	public abstract void code ();
	public abstract void coplide ();
	public abstract void execute ();
	
	public static void help() {
		//print some documentation
	}
	public default void interpret () {
		//come code
	}
}
