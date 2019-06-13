package statickeyword;

public class Dinner {

	
	public static int pizzaSlices =8; //static, it means they shared one pizza
	
	public void takeASlice () {
		
		pizzaSlices--;
	}
  public void takeASlice (int num) {
		
		pizzaSlices-=num;
		
  }
}
