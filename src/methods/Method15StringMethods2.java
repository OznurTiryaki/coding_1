package methods;

public class Method15StringMethods2 {

	public static void main(String[] args) {
		
		/* countTimes
	    param 2 strings
		return  type int
		count number of occurences of first string within second string
		and return that count
		
		ex: count time ("java", "a" )-->2
		
		
  */
		System.out.println(countTimes ("java" , "a"));
		//System.out.println(countTimesV2 ("java" , "a"));
	   System.out.println(countTimesV3("java" , "a"));
		
	}
	public static int countTimes (String word, String searchingchar) {
		int count=0;
		
		for (int i = 0; i < word.length(); i++) {
			
			String c = word.substring(i,i+1); //kareklerleri tek basina basmak icin +1 ile yamamiz lazim zaten sonran bir oncekini basiyor
			
			if (c.equalsIgnoreCase(searchingchar)) {
				count++;
				
			}
			
		}
		return count;
		
	}

//	//SECOND WAY---LOOKS GOOD
//	BU YONTEMDE EKSIK VAR
//	public static int countTimesV2 (String word, String searchingchar) {
//	
//		String [] arr = word.split(searchingchar);
//	
//	return arr.length-1; //neden -1 e donuyor cunku  String str= "abcabc" dersek str.split ("b") ---> ["a", "ca","c"] oluyor bolundugunde
//	                                                                                              //yani kac element var 3 kac b oluyor 2
//                                                                                                  //bu yuzden -1	ama harf sonda veya basta ise sikinti olur 
//	                                                                                              //bu yuzden condition koymaliyiz
//	}
	
	//THIRD WAY---LOOKS GOOD
	
	public static int countTimesV3 (String str1, String str2) {
	
	int len1 = str1.length (); // ext;java 4 character
	str1 = str1.replace(str2,"");  //str2lerin yerine bos ile degistirirsek onlar cikmis olur kaldi jv
	int len2= str1.length ();     //str1 kac karekter kaldi 2---> j v
	return len1-len2;              //str1 in ilk halinden ikinci halini cikardiginda kalan sati bizim aradigimiz toplam karakteri verir.
	
	}
	
}
