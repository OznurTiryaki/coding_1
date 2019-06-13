package inheritence1;

public class Bin{
	
	String contents;
	String types;

	public Bin () {
		
		this("general");  //we call constructor ----->  public Class ( String types) {
		
	}
	public Bin ( String types) {
		contents="";
		this.types=types;
		
	}
	public void add (String thing) {
		if(contents.isEmpty()) {
			contents+= thing;
		}else {
		
		contents+= ","+ thing;
	}
	}
	public boolean remove (String thing) {
		String temp= contents.toLowerCase();   //ilk once her iki kelimenin eslesmesi icin herikisini lower yaptik
		thing=thing.toLowerCase().trim();      //bosluklar varsa kesmek icin emin olduk
		
		if(temp.contains(thing)) {             //bizim aradigimiz kelimeyi iceriyor mu
			if(temp.startsWith(thing)){        //eger bizim aradigimiz kelime ile basliyorsa sadece keimeyi baslukla degisitr
				                               //cunku onunde virgul yok
				
		temp=	temp.replace(thing, "");
		temp=temp.isEmpty() ? temp : temp.substring(1);   
	  
		}else {
			temp=	temp.replace(","+thing, ""); //eger ilk kelime degilse virgulle birlikte kaldir
		}
		contents=temp;
		return true;
	} else {
		return false;
	}
	}
	
	public void empty () {
		contents="";
	}
	
	public String toString() {   //to descirbe to object we do toString method
		return "Class [contents=" + contents + ", types=" + types + "]";
	}
	
	
}
