package interfaces;

public class Ruby extends ProgrammingLanguage implements ScriptingLanguage, OOPLanguage{

	@Override
	public void code() {
		System.out.println("Coding Ruby using Ruby Mines");
		
	}

	@Override
	public void coplide() {
		System.out.println("Tranlating Ruby code to binary");
	}

	@Override
	public void execute() {
		System.out.println("Executing  Ruby Programming ");
		
	}

	@Override
	public void design() {
		System.out.println("Design implements OOP");
		
	}

	@Override
	public void buildApplication() {
		System.out.println("Building an Application using Ruby");
		
	}

}
