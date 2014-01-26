/*********************************************************************

 Description : Objects may be passed to methods
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package JavaFoundation;

class Test4 {
int a, b;

Test4(int i, int j) {
 a = i;
 b = j;
}

// return true if o is equal to the invoking object
boolean equals(Test4 o) {
 if(o.a == a && o.b == b) return true;
 else return false;
}
}

class OOPS_PassOb {
public static void main(String args[]) {
 Test4 ob1 = new Test4(100, 22);
 Test4 ob2 = new Test4(100, 22);
 Test4 ob3 = new Test4(-1, -1);

 System.out.println("ob1 == ob2: " + ob1.equals(ob2));

 System.out.println("ob1 == ob3: " + ob1.equals(ob3));
}
}