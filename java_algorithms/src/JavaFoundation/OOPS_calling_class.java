/*********************************************************************
 
 Description : A simple java OOPS program
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

public class OOPS_calling_class {
	public static void main(String args []){
	  subclass1 obj1=new subclass1();
	  obj1.show1();
	  
	  subclass2 obj2=new subclass2();
	  obj2.show2();
	    
	}
}


class subclass1{
	public void show1(){
		System.out.println("method1 of subclass1");
	}
}

class subclass2{
	public void show2(){
		System.out.println("method2 of subclass2");
	}
}