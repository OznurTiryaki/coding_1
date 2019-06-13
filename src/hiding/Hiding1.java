package hiding;

public class Hiding1 {


		public String var1;
	}

	 class B extends Hiding1 {
     
		 public String var1;   // even though we inherit from super class ,
		 
		  //we can use same variable from sub class
          //and it can hide the inherited one
}
	 