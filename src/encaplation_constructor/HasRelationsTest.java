package encaplation_constructor;

public class HasRelationsTest {

	public static void main(String[] args) {

	Engine carEngine= new Engine ();    //we are creating a car then we
	
	carEngine.cylinders=4;
	carEngine.horsepower=234;
	
	Auto camry=new Auto ();  //inside a auto class we have a instance variable engine,
	//it is a type of class,to use engine variable it just create engine object, 
	
	
	camry.model= "Toyota Camry";
	
	camry.engine=carEngine; // can engine include two variable
	
	System.out.println(camry.model);    //Toyota Camry
	System.out.println(camry.engine.cylinders);  //4
	System.out.println(camry.engine.horsepower);   //234
	
	
	Auto car2= new Auto  (); 
	
	car2.model="BMW";
	car2.engine=new Engine ();  //costructor cagirdik
	car2.engine.cylinders=6;
	car2.engine.horsepower=500;
	
	Auto car3= new Auto ();
	car3.engine= new Engine(8,687);  //for car3 we call engine but two call engine we need give 
	//assign engine(cylinders and horsepower).here we do in once shot with constructor
	//but in first example, we did one by one.
	car3.model="Audi";
	
	
	System.out.println(car3.model + " has "+ car3.engine.cylinders + " cylinders");
	
	System.out.println(car3.model + " has "+ car3.engine.horsepower + " horsepowers");
	
	}

}
   