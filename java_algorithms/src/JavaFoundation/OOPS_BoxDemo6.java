/*********************************************************************
 
 Description : Box uses a constructor to initialize the dimensions 
 			   of a box.
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

	class  Box6 {
	  double width;
	  double height;
	  double depth;

	  // This is the constructor for Box.
	  Box6() {
	    System.out.println("Constructing Box");
	    width = 10;
	    height = 10;
	    depth = 10;
	  }	// note that all variables will be assigned same value

	  // compute and return volume
	  double volume() {
	    return width * height * depth;
	  }
	}
	  
	class OOPS_BoxDemo6 {
	  public static void main(String args[]) {
	    // declare, allocate, and initialize Box objects
	    Box6 mybox1 = new Box6();
	   

	    double vol;

	    // get volume of first box
	    vol = mybox1.volume();
	    System.out.println("Volume is " + vol+"\n");
	    
	    Box6 mybox2 = new Box6();
	    // get volume of second box
	    vol = mybox2.volume();
	    System.out.println("Volume is " + vol);
	  }	
}