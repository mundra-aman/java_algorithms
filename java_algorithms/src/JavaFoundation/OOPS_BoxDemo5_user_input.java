package JavaFoundation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Box5userinput{
	 double width;
	 double height;
	 double depth; 
	 
	 double volume() {
		    return width * height * depth;
		  }
	 
	 void setDim(double w, double h, double d) throws NumberFormatException, IOException {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
		 w=Integer.parseInt(br.readLine());		width = w;
		 h=Integer.parseInt(br.readLine());	    height = h;
		 d=Integer.parseInt(br.readLine());	    depth = d;
		  }
	}

public class OOPS_BoxDemo5_user_input {
	public static void main(String args) throws NumberFormatException, IOException {
		  Box5userinput mybox1 = new Box5userinput();
		  Box5userinput mybox2 = new Box5userinput();
		    double vol;
		    
		    // initialize each box
		    mybox1.setDim(10, 20, 30);
     	    mybox2.setDim(1, 2, 3);    

		    // get volume of first box
		    vol = mybox1.volume();
		    System.out.println("Volume is " + vol);

		    // get volume of second box
		    vol = mybox2.volume();
		    System.out.println("Volume is " + vol);
		
	}
}