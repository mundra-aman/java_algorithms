package JavaFoundation;

public class foundation_block_scope {

	public static void main(String args[]) {
	    int x; // known to all code within main
	    x = 10;

	    if(x == 10) { // start new scope
	      int y = 20; // known only to this block

	      // x and y both known here.
	      System.out.println("x and y: " + x + " " + y);
	      x = y * 2;
	    }
	    // y = 100; // Error! y not known here
	    // so y should be declared first.

	    // x is still known here.
	    System.out.println("x is " + x);
	   // System.out.println("y is " + y); // y still remains a mystery
	    								   // here outside the loop
	    }
}