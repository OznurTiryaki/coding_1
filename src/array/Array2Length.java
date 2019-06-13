package array;

public class Array2Length {

	public static void main(String[] args) {
		//declare array names that store 5 names
		
		String [] names = new String [5];
		names [0]="Serik";
		names [1]="Halil";
		names [2]="Z";
		names [3]="Erkam";
		names [4]="Zarina";
		
		System.out.println(names.length) ; //yani kac tane name var onu verecek // parantezsiz olan arrayin uzunlugunu veriyor
		
		//String name and assign halil to it by reading from array
		
		String name = names[1];
		
		System.out.println(name.length()); // we put parantesis. it is method/ for method we always put paranthesis
		
		
	}

}
