package statickeyword;

public class TVRunnerClass {

	public static void main(String[] args) {
		

		Tv myTv= new Tv();    ///whenever we creating object, it are instantiation it.
		Tv yourTv= new Tv("Sharp");
		Tv cakeTv= new Tv("HP");
		
		System.out.println(myTv.isOn());
		System.out.println(yourTv.isOn());
		System.out.println(cakeTv.isOn());
		
		myTv.turnOn();  //soyle kodla kafanda void bir sey donmuyor ve sysoutsuz yaziliyor cunku sadece set ediyor
		yourTv.turnOn();   // we just call method, we didnt print because it is not return anything
		cakeTv.turnOn();
		
		System.out.println(myTv.isOn());    //simdi hepsi true oldu  //birsey donler print ediliyor.
		System.out.println(yourTv.isOn());
		System.out.println(cakeTv.isOn());
		
	}
	

}
