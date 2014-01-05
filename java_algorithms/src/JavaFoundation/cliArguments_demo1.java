package JavaFoundation;

public class cliArguments_demo1 {
	// Display all command line arguments.
	  public static void main(String args[]) {
	    for(int i=0; i<args.length; i++)
	      System.out.println("args[" + i + "]: " +
	                          args[i]);
	  }
	}
