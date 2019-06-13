package statickeyword;

public class DinnerRunner {

	public static void main(String[] args) {
		

		Dinner Dad= new Dinner();
		Dinner Mom= new Dinner();
		Dinner Kid= new Dinner();
		
		System.out.println("Pizza slices: " + Dad.pizzaSlices); //8
		
		Dad.takeASlice(2);
		Kid.takeASlice(3);
		Mom.takeASlice();
		
		//takeASlice (int num) method decrease a slice by num so for that reason, 
		//at Dad decrease 2, at kid decrease 3, at kid decrease 1 
		// we set firstly slide number at. after decrease it happens 2
		//decrease all from 8 because it is static and shared just one pizza
		//if we remove the static from there first we cannot access because it is a private
		//but lets said we did setters and getters , so they don't shared the pizza. Every time start from 8
		//everybody ha e their own pizza
		//after that first one give us still 8 because we didn't decrease yet
		//mom's pizza decrease from 8 and it gave us 7
		
		System.out.println("Pizza slices: " + Mom.pizzaSlices); //2
		System.out.println("Pizza slices: " + Kid.pizzaSlices);
		
		//whenever it is static, it is shared by everyone !!!
	}

}
   