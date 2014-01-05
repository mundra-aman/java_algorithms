/*********************************************************************
 
 Description : This program declares two Box objects.
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

class Box2 {
double width; // member variables
double height;
double depth;
}
// no method is defined in the class


class OOPS_BoxDemo2 {
public static void main(String args[]) {
 Box2 mybox1 = new Box2();  // object1
 Box2 mybox2 = new Box2();	// object2
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

 // compute volume of first box
 vol = mybox1.width * mybox1.height * mybox1.depth;
 System.out.println("first object \n Volume is " + vol);

 // compute volume of second box
 vol = mybox2.width * mybox2.height * mybox2.depth;
 System.out.println("second object \n Volume is " + vol);
}
}