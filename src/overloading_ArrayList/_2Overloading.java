package overloading_ArrayList;

public class _2Overloading {

	public static void main(String[] args) {
		
		/*Method : playGame
		 * 
		 * 1.Name : playGame
		 * 
		 * params: int, string
		 * return :boolean
		 * 
		 * 2.Name:playGame
		 * Params;String, int
		 * return :boolean
		 */
      System.out.println(playGame(2, "yes"));//true
      System.out.println(playGame(4, "yes")); //false
      System.out.println(playGame("continue", 4)); //true
      System.out.println(playGame("continue", 6));  //false
	}
    public static boolean playGame(int a, String str) {
	if(a <3 && str.equals("yes")) {
		return true;
	}
	return false;
}
    public static boolean playGame( String str, int a) {
    	
    	if(a <5 && str.equals("continue")) {
    		return true;
    	}
    	return false;
    }
    
}
