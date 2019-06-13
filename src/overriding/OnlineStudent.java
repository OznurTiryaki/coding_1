package overriding;

public class OnlineStudent extends Student{

//	public void attentAClass() {
//		System.out.println("Student attend a class somehow");
//	}
	@Override
	public void attentAClass() {
		System.out.println("Online student attend a class using goTo Webinar");
	}

}
