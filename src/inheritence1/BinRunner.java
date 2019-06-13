package inheritence1;

public class BinRunner {

	public static void main(String[] args) {
		
		Bin yourbin= new Bin();
		System.out.println(yourbin.toString());
		
		yourbin.add("book");
		yourbin.add("notepas");
		yourbin.add("ipad");

		System.out.println(yourbin.toString());
		
		yourbin.remove("book");
		
		System.out.println(yourbin.toString());
		
		RecycleBin rBin = new RecycleBin (); 
		//extend yaptigimiz icin Bin icinde olanlar burada da var
		
		rBin.add("Bottle");   //inherid method from BIn class
		
		System.out.println(rBin.toString());  //toString methodu yazmak zorunda degiliz
		
	}

}
