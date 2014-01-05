/*********************************************************************
 
 Description : Box allows one object to initialize another
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

class Boxcon {
double width;
double height;
double depth;

// construct clone of an object
Boxcon(Boxcon mybox1) { // pass object to constructor
 width = mybox1.width;
 height = mybox1.height;
 depth = mybox1.depth;
}

// constructor used when all dimensions specified
Boxcon(double w, double h, double d) {
 width = w;
 height = h;
 depth = d;
}

// constructor used when no dimensions specified
Boxcon() {
 width = -1;  // use -1 to indicate
 height = -1; // an uninitialized
 depth = -1;  // box
}

// constructor used when cube is created
Boxcon(double len) {
 width = height = depth = len;
}

// compute and return volume
double volume() {
 return width * height * depth;
}
}

class OOPS_OverloadCons2 {
public static void main(String args[]) {
 // create boxes using the various constructors
 Boxcon mybox1 = new Boxcon(10, 20, 15);
 Boxcon mybox2 = new Boxcon();
 Boxcon mycube = new Boxcon(7);
 Boxcon myclone = new Boxcon(mybox1);

 double vol;

 // get volume of first box
 vol = mybox1.volume();
 System.out.println("Volume of mybox1 is " + vol);

 // get volume of second box
 vol = mybox2.volume();
 System.out.println("Volume of mybox2 is " + vol);

 // get volume of cube
 vol = mycube.volume();
 System.out.println("Volume of cube is " + vol);

 // get volume of clone
 vol = myclone.volume();
 System.out.println("Volume of clone is " + vol);
}
}