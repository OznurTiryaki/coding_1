package encaplation_constructor;

public class EtsyRegistrationPage {

	public static void main(String[] args) {

		EtsyAccount murat = new EtsyAccount();

		murat.setEmail("Muratkarakustx");
		murat.setFistName("Murat");
		murat.setPassWord("Malat");

		System.out.println(murat.getEmail());
		System.out.println(murat.getFistName());
		System.out.println(murat.getPassWord());
		System.out.println(murat.getAllInfo());

		System.out.println("*********************************");

		EtsyAccount oznur = new EtsyAccount();

		oznur.setEmail("oznurkarakustx");
		oznur.setFistName("Oznur");
		oznur.setPassWord("Abc1234!");

		System.out.println(oznur.getEmail());
		System.out.println(oznur.getFistName());
		System.out.println(oznur.getPassWord());
		System.out.println(oznur.getAllInfo());

		System.out.println("*********************************");

		EtsyAccount muhiddinAbi = new EtsyAccount();

		// tek tek ayri name vs yazmadan direk method icinde yapabilirsin

		muhiddinAbi.setAllInfo("Muhiddin", "Muhiddinabi@gmail.com", "abc678"); // bir parametre degil 3 parametre aldigi
																				// icin boyle

		System.out.println(muhiddinAbi.getAllInfo());

		// if we just want to change email call setEmail method again

		muhiddinAbi.setEmail("berberMuhiddin@yahoo.com");

		System.out.println(muhiddinAbi.getAllInfo());

		// or I can use replace one

		muhiddinAbi.setEmail(muhiddinAbi.getEmail().replace("yahoo", "gmail"));

		System.out.println(muhiddinAbi.getAllInfo());

		System.out.println("*********************************");
		
		EtsyAccount mecnun = new EtsyAccount();
		
		mecnun.setAllInfo("Mecnun", "leylam@gmail.com", "hoop");
		
		String allInfo= mecnun.getAllInfo();   //bu sekilde bir stringe atayarak da methodu cagirabilirsin
		
		System.out.println(allInfo);
		
		

	}

}
