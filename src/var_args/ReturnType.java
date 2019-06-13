package var_args;

public class ReturnType {

	public static void main(String[] args) {
//		Given a string, return a new string where "not " has been added to the front.
//				However, if the string already begins with "not", return the string unchanged.
//						Note: use .equals() to compare 2 strings.
//
//
//				notString("candy") → "not candy"
//				notString("x") → "not x"
//				notString("not bad") → "not bad"
		
		
		System.out.println(notString("candy"));
		System.out.println(notString("not bad"));
		
	}
	public static String notString (String str) {
		if( str.contains("not")){
		    return str;
		  }else {
		    return "not "+str;
		  }
		
		}	
	
}
