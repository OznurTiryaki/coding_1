package abstractions;

public class Oca {

	public static void main(String...weather) {
		
		System.out.println(weather[0]!=null
				&& weather[0].equals("sunny")
				&& !false ? "go outside" : "stay inside");
	}

}
