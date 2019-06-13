package overloading_ArrayList;

public class _4OverloadingAboutCasting {

	public static void main(String[] args) {

		
		//java kolay olani seciyor 
		 
		System.out.println(add(100, 400));   //ikisi de int oldgu icin ilk olana gider //500
		
		System.out.println(add(12.43, 100.2, 65));   //one double ve 3 param oldugu icin ikinciye goder  //177.63
		
		System.out.println(add(12.4, 100));   //biri int olsa bile biri double oldugu =ve 2 param oldugu icin sonuncu methoda gider  //112.4
	}

	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	public static double add(double d1, double d2, double d3) {
		return d1 + d2 + d3;
	}

	public static double add(double d1, double d2) {
		return d1 + d2;
	}
}
