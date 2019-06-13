package var_args;

public class Var_Args1 {

	public static void main(String[] args) {
	
		/*
		 * method : shopping list
		 * Args: String var-args
		 * return type: void
		 * it will print shopping list item in same line, seperated by space
		 *shoppingList ("kivi", "apples", "bananas"}
		 * 
		 */

		shoppingList("kivi", "apples", "bananas");

		shoppingList("papaya", "peach", "pears","pumpkin", "watermelon","cantelope");
		
		shoppingList(); //hicbirsey yazdirmaz cunku bos
		
	}
 public static void shoppingList(String ...vegies) {
	 String list="";
	 for(String each : vegies) {
		 list += each+ " ";
	 }
	 System.out.println(list);
 }
}
