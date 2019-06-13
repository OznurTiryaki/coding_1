package array;

public class Array1 {

	public static void main(String[] args) {
		// declare array with 3 different ways
		
		int nums [] = new int [4];
		nums [0]= 3;
		nums [1]= 2;
		nums [2]= 5;
		nums [3]= 6;
		
		
		int nums1 [] = { 3,2,5,6 };
		int nums2 [] = new int [] {3,2,5,6}; 
		
		
		//char grades in 3 ways
		
		char grades []= new char [5];
		grades [0] = 'A';
		grades [1] = 'B';
		grades [2] = 'C';
		grades [3] = 'D';
		grades [4] = 'E';
		
		char grades1 []= new char [] { 'A' ,'B', 'C', 'D', 'E'};
		char grades2 [] = { 'A' ,'B', 'C', 'D', 'E'};
		
		//String [] cities = new String [3] ; bu iki sekilde de yazabilirsin
		String[] cities;
		cities = new String [3];
		cities [0] = "Washington";
		cities [1] = "Los Aangeles";
		cities [2] = "New York";
		
//		String[] cities; 
//		cities = {"Washington", "Los Aangeles","New York"}  bu sekilde yazamazsin curly braces kullaniyorsan eger ayni satirda olacak
		
	}
}
