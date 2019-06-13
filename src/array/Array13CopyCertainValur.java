package array;

public class Array13CopyCertainValur {

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
	
		int counter =0;
		for (String str :arr) {        //with for each loop, we will check the each string inside array
			if (str.contains("e")){   //now we can use contain method because it turns string after loop
				counter ++;            //it show us how many String include "e" // not count "e" it count Strings
			}
		}
	System.out.println(counter);
	
	//create array fewValues, with size of counter
	
	String [] fewValues = new String [counter];   // store Strings which include "e", that why we say count
	
	//go over arr one more time and add the words with "e' into fewValues
	
	int i =0;
	
	for (String each :arr) {  //arr icinden Stringlere bakicaz
		
		if (each.contains("e")) {   //bunlardan hangileri "e" iceriyor
			fewValues[i]=each;      //yani soyle fewVAlues[0] dan balayarak check ediyor eger e li bulursa arrayin icine ekliyor
			i++;                    // i arttikca Bir diger stringe geciyoruz
		}
	}
	for (String val :fewValues) {   //arrayin icindeki stringleri cikarmak icin for each loop kullaniyoruz
		System.out.print(val + " ");
	}
	
	
	
	
	
	
	
	
	}

}
