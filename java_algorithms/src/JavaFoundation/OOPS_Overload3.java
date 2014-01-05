/*********************************************************************
 
 Description : Constructor overloading.
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

	class BoxOverload {
		  double width;
		  double height;
		  double depth;

		  // This is the constructor for Box.
		  BoxOverload(double w, double h, double d) {
		    width = w;
		    height = h;
		    depth = d;
		  }

		  // compute and return volume
		  double volume() {
		    return width * height * depth;
		  }
		}

	
	public class OOPS_Overload3 {
		public static void main(String args[]){
			BoxOverload obj=new BoxOverload(1,2,3);
			double vol=obj.volume();
			System.out.println("volume is: "+vol);
		}
	}
