package array;

public class Array5CreateKitchenItem {

	public static void main(String[] args) {
//Using with for each loop and use switch for each item
		
		String [] kitchenItem =  new String [] { "fork" , "Pan","Spoon", "plates" , "cups"};
		
		for (String item : kitchenItem ) {
			switch (item.toLowerCase()) {
			case "fork":
				System.out.println("fork help to eat food");
				break;
			case "pan":
				System.out.println("pan uses for cooking"); //yukarda upper ama biz onu lowercase e cevirdik
				break;
			case  "spoon":
				System.out.println("fork help to eat soup");
				break;
			case  "plates":
				System.out.println("we use to put food in it");	
				break;
			case  "cups":
				System.out.println("we use to to drink something");	
				break;
			}
		
		}
	}

}
