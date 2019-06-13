package statickeyword;

public class Tv {

	private int channel;
	private int volumeLevel;
	private boolean on;
	private String brand;
	
	
	public Tv() {
		brand="undefined";
		System.out.println("Creating constructor with no arguments");
	}
	
	public Tv(String brand) {
		this.brand=brand;
		System.out.println("Creating constructor with 1 arguments");	
	}

	//The current channel (1 to 120) of this Tv
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		
		if(on && channel>0 && channel< 121) {
			this.channel = channel;
		}else {
			System.out.println("ERROR: Tv is either ooff or invalid channel");
		}
	}
	
	//The current volume level (1 to 7) of this Tv
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		if(on && volumeLevel>=1 && volumeLevel< 7) {
			this.volumeLevel = volumeLevel;  // I need to set volume
			}else {
			System.out.println("ERROR: Tv is either ooff or invalid volume");
		}

	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//Indicates whether this TV is on/off 
	public boolean isOn() { //instead off get it put otomatically is because is boolean
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	
	//Turns on this TV
	public void turnOn() {
	if(isOn()) {   //ewe called isOn method here. eger true ise tv aciktir
		System.out.println("Tv is already on");
	}else {
		on=true;// yani eger true degil se acik degildir, true yaparak turn on yapiyorsun
		//this.on=true;
	}
	}
	
	//Turns off this TV
	public void turnOff() {
		if(isOn()) {    //eger false ise kapalidir 
			on=false;
			
		}else {
			System.out.println("Tv is already off");
		}	
	}
	
	//Increase the channel number by 1
	public void channelUp() {
		if(isOn()&& channel<120 ) {   //channel or call channel method getChannel()
		channel++;	
		}
	}
	
	//Decrease the channel number by 1
	public void channelDown() {
	
		if(isOn()&& channel>1) {   //channel or call channel method getChannel()
			channel--;	
			}
		}
	
	//Increase the volume level number by 1
	public void volumeUp() {
		
		if(isOn()&& volumeLevel <7) {  
			channel++;	
			}
		}
	//Decrease the volume level by 1	
    public void volumeDown() {
		
		if(isOn()&& volumeLevel >1) {  
			channel--;	
			}
		}
 	}
	
	/*The current channel (1 to 120) of this Tv
	 * The current volume level (1 to 7) of this Tv
	 *Indicates whether this TV is on/off 
	 * Constructs a default Tv object
	 * Turns on this Tv
	 * Turns off this TV
	 * Set a new channel for this Tv
	 * Set a new volume for this Tv
	 * Increase the channel number by 1
	 * Decrease the channel number by 1
	 * Increase the volume level number by 1
	 * decrease the volume level by 1
	 * 
	 */
	
	
	
	
	
	
	
	

