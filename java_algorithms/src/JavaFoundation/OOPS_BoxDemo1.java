/*********************************************************************
 
 Description : A simple java OOPS program
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;


class Box1 {
double width;    // member are not initialized in a class directly
double height;		// no method in the class
double depth;
}

// use a method or constructor to initialize or access a variable

class OOPS_BoxDemo1 {
  public static void main(String args[]) {
    Box1 mybox = new Box1();
    double vol;

    // assign values to mybox's instance variables
    mybox.width = 10; //use dot operator to access class member variables or methods
    mybox.height = 20;
    mybox.depth = 15;

    // compute volume of box
    vol = mybox.width * mybox.height * mybox.depth;

    System.out.println("Volume is " + vol);
  }
}