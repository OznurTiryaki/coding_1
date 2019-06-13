package customClass2;

public class HouseTest {

	public static void main(String[] args) {
		//bu methodu burada kullanabilmek icin once we need to create House object and assign data to variables

		House yourHouse= new House ();
		
		yourHouse.type= "Castle";
		yourHouse.addrss="100 Mass ave, washongton Dc 22001";
		yourHouse.bedrooms=250;
		yourHouse.year=2018;
		
		printHouseInfo(yourHouse);
		
		
      House yourHouse2= new House ();
		
		yourHouse2.type= "Town House";
		yourHouse2.addrss="500 st 123 Austin TX";
		yourHouse2.bedrooms=2;
		yourHouse2.year=2005;

		printHouseInfo(yourHouse2);
	}
	public static void printHouseInfo(House house){  //this method want to ready House class
		System.out.println("=================");
		System.out.println("Type: " + house.type);
		System.out.println("Address: " + house.addrss);
		System.out.println("Year: " + house.year);
		System.out.println("=================");
		
		
		House returnHouse=buildAHouse("studio", "600 match Colorado" , 1, 2019);
		System.out.println(returnHouse.addrss); //ne cagirdigini yazmazsan yazdirmaz
		                                        //hepsini comple yazdirmadigin icin tek tek dondureceksin
	}
	
	/*
	 * Methods buildAHouse
	 * paramaters  2 String 2 int
	 * retun type:House
	 * 
	 * In the method, using the values of the parameters build a new House object then return that
	 * 
	 * 
	 */
	
	public static House buildAHouse(String type, String address , int rooms, int year) {
		House myHouse = new House ();
		
		myHouse.type=type;
		myHouse.addrss=address;
		myHouse.bedrooms=rooms;
		myHouse.year=year;
		
		return myHouse;
	}
}
