/*********************************************************************
 
 Description : This program includes a method inside the box class but 
 				with a return value
 				
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

class Box4{
double width;
double height;
double depth;

// compute and return volume
double volume() {			// method with a return value
 return width * height * depth;
} // preferred approach
}

class OOPS_BoxDemo4 {
public static void main(String args[]) {
 Box4 mybox1 = new Box4();
 Box4 mybox2 = new Box4();
 double vol;

 // assign values to mybox1's instance variables
 mybox1.width = 10;
 mybox1.height = 20;
 mybox1.depth = 15;

 /* assign different values to mybox2's
    instance variables */
 mybox2.width = 3;
 mybox2.height = 6;
 mybox2.depth = 9;

 // get volume of first box
 vol = mybox1.volume();
 System.out.println("first object \n Volume is " + vol);

 // get volume of second box
 vol = mybox2.volume();
 System.out.println("second object \n Volume is " + vol);
}
}