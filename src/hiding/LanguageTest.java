package hiding;

public class LanguageTest {

	public static void main(String[] args) {
		
		ProgrammingLanguage pl= new ProgrammingLanguage ();
		
//		pl.printName();     //we created method from ProgrammingLanguage class
//		                    //but it inherit method from super class.
//		                    //when it goes inside a method, it goes closer name (inside Language class)
//		                    //and it prints ---Language: General Language

		pl.printProgrammingName(); // Programming Language: Programming Language
		pl.printName();   //bu methodu biz ProgrammingLanguage sinifindan cagiramiza ragemn
		                  //kendi icinde olmayinca parent class a cagirmaya gitti.
		                  //bu methosun icinde cagirdigimiz staticMethod ();   sub classta da var fakat 
		                  //biz bunu Language class ta cagirdigimiz icin 
                          //Language - static method olarak print etti
	}

}
