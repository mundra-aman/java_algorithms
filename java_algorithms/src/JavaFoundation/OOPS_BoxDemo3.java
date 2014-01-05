/*********************************************************************
 
 Description : This program includes a method inside the box class.
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

// class contains member variables and methods
	class box3 {
		double width;
		double height;
		double depth;
		
	  // display volume of a box
	  void volume() {
	    System.out.print("Volume is ");
	    System.out.println(width * height * depth);
	  }
	}
	  
	class OOPS_BoxDemo3 {
	  public static void main(String args[]) {
	    box3 mybox1 = new box3();
	    box3 mybox2 = new box3();

	    // assign values to mybox1's instance variables
	    mybox1.width = 10;
	    mybox1.height = 20;
	    mybox1.depth = 15;

	    /* assign different values to mybox2's
	       instance variables */
	    mybox2.width = 3;
	    mybox2.height = 6;
	    mybox2.depth = 9;

	    // display volume of first box
	    System.out.println("first object");
	    mybox1.volume();

	    // display volume of second box
	    System.out.println("first object");
	    mybox2.volume();
	  }
	}