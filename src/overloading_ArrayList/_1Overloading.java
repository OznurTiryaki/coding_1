package overloading_ArrayList;

public class _1Overloading {

	public static void main(String[] args) {
	
		
		
		System.out.println(add( 3,5));
		System.out.println(add( 13.5 , 53.1 , 9.8));
		
	}
public static int add( int a, int b) {
	return a+b;
}
public static double add( double d, double e, double f) {
	return d+e+f;
}
}
