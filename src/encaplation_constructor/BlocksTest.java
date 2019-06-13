package encaplation_constructor;

public class BlocksTest {

	public static void main(String[] args) {
		
		   System.out.println(Blocks.num);//1100== 100+1000 default+static BLOCK
		   System.out.println(Blocks.str);	//Hello
		   
				
		   System.out.println(Blocks.num);//1100 DEGIZMEZ UPDATE OLMAZ CUNKU STATIC BIRKERE RUN EDER
		   System.out.println(Blocks.str);	//Hello AYNISI CUNKU SATIC BIR KERE RUN EDER
		   	
			//Suanakadar object create etmedik init. block ve cinstructor run etmez
		   
		   
		   Blocks b1  = new Blocks();//3200==> burda static block+init block + constructur
		   
		   System.out.println(b1.num);//3200
		   //System.out.println(Blocks.str);//Hellowolrd!!!
		   Blocks b2  = new Blocks();//7400 ==> static ekleme burda,rcunku runs ONLY at the beginning onu ekleme burda sadece init blick ve constructor degerleri
		   
		  // System.out.println(b1.num);// BUDA CALISIR AMA STATICLER CLASS NAME LE CAGIRILIR GENELDE
		   //System.out.println(b1.str)
		   System.out.println(Blocks.num);//7400 ==>>>>because it is shared,REMEBER STATIC VATRIABLES ARE SHARED, ONCE OBJECT ASSIGN DOES NOT CHANGE TILL NEXT OBJECT CREATION 
		   System.out.println(Blocks.str); //Hellowolrd!!!wolrd!!!
		   
		   System.out.println("===========");
		   
		   System.out.println(Blocks.num);//7400
		   System.out.println(Blocks.str);//Hellowolrd!!!wolrd!!!
		   
		   
				

	}

}
