package array;

public class Array13CopyCertainValur2VersionRegularLoop {

	public static void main(String[] args) {
		
		
//	  given a String array with following elements ["zero" , "one" , " two" , "tree" , "four"]
//      create another array few Values and copy words that have letter "e" in them
//      You need to know how many element contain "e" and create array accordingly
//      Values in few Values array need to be  ["zero", "one" , "three"]
//      
//    		 Examples :
//    			  
//    		 arr> ["aa", "be" , "lol", "lel", "oreo"]
//    	     few Values > {"be", "lel", "oreo"]
//    							  
//           arr > ["e" , "hey" , "bye " , "furey" , "spoon" ]
//    		 few Values > ["e", "hey", "bye" , "furey"]
    					  
	
		
		//count how many word have 'e' in the arr
		
		
//	String [] numbers = new String [5];
//	
//	numbers [0]= "zero";
//	numbers [1]= "one";
//	numbers [2]= "two";
//	numbers [3]= "tree";
//	numbers [4]= "four";
//	OR
	
		String [] arr = {"zero" , "one" , " two" , "tree" , "four"};
	
		int count=0;
		for (int x =0 ; x <arr. length ; x ++) {
			if (arr[x].contains("e")) {
			count++;	
			}
		}
		
		
	System.out.println(count);
	
	
//	//create array fewValues, with size of counter
	
	String [] fewValues = new String [count];   // store Strings which include "e", that why we say count
	
	//go over arr one more time and add the words with "e' into fewValues
	

	int j=0;
	for (int i=0; i <arr.length ;i++) {
	 if (arr[i].contains ("e"))	{
		fewValues[j]= arr[i]; //eger arry [i] icinde "e" barindiriyorsa few Values containerine ekle
		j++;
	 }
	}
	for (String val :fewValues) {   //arrayin icindeki stringleri cikarmak icin for each loop kullaniyoruz
		System.out.print(val + " ");
	}
	
	
	
	
	
	
	
	
	}

}
