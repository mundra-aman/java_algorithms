/*********************************************************************
 
 Description : demonstrating the usage of a constructor
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

class div {
	private int x,y;  // member variables
	
	div(int a, int b){		// constructor
		x=a;
		y=b;
		int z=1;
		
		if(y%x==0) System.out.println(z);
		else {z=0; System.out.println(z);}
				}
	
}



public class OOPS_div_main {
		@SuppressWarnings("unused")
		public static void main(String args[]) {
		div obj1 = new div(5,15);
		div obj2 = new div(5,17);
		
  }
}
