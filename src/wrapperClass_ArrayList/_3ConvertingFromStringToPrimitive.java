package wrapperClass_ArrayList;

import java.util.ArrayList;

public class _3ConvertingFromStringToPrimitive {

	public static void main(String[] args) {

		String count = "432";

		int iCount = Integer.parseInt(count);

		
		if(iCount >0) {
			System.out.println("Count is positive");
		}else {
			System.out.println("Count is negative");
		}
		
//		String str= "Price is 45.77";
//		
//		Double price= Double.parseDouble(str);
//		System.out.println(price);   //this give error because not include just number, it also include letter and space
//how we can fix it
		
		String str= "Price is 45.77";
		
	    String [] sp=str.split(" ");
		double price= Double.parseDouble(sp[2]);
		System.out.println(price); 
		
		String etsyResult = ("\"wooden Spoon\" (13,950 Results)");  

		String [] sp1 =etsyResult.split(" ");
		
	    String strSpoonCount= sp1[2].replace("(","").replace(",","");
		
	    int woodenSpoons= Integer.parseInt(strSpoonCount);
	    
	    if(woodenSpoons>0) {
	    	System.out.println("PASS.Search results are displayed");
	    }else {
	    	System.out.println("FAIL.Search results are NOT displayed");
	    }
	    System.out.println("************************************");
	    
	    String [] sNums= {"243" , "345" , "23" ,"12"};
	    	
	    ArrayList<Integer> listNums= new ArrayList <> ();	
	    
	    for(String num: sNums) {
	    	listNums.add(Integer.valueOf(num));  //take String and convert to Integer
	    	
	    }
	    
	    System.out.println(listNums);
	}

}
