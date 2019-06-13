package inheritence;

import inheritence1.Student;

public class OtherPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student student= new Student();  //ytazabilmek icim imposrt yaparic zunku different classtayiz
		
		
		student.name= "Mike";  //it is public, we can access
		//student.ssn=22334; private just we can call in Student class
		
		//student.age=44;  //not visible because it is different package and not sub class
		//protected only visible in package and in sub class
		
		//student.campus   //not visible because it is default and we only saw in same package.
		
		
	/*	All public , protected members are always inherited
		
		Default members are inherited only if in same package
		
		Private members are not inherited
		
		
		*/
	}

}
