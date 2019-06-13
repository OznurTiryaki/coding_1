package encaplation_constructor;

public class CalcTest {

	public static void main(String[] args) {
		

		Calc c=new Calc ();
		
		c.plus(10);
		
		System.out.println(c.getResult()); 
	
		Calc c1=new Calc ();
		
		c1.plus(50).plus(20);
		
		System.out.println(c1.getResult());
	}

}
