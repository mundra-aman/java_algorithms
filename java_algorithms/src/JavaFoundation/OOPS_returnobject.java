//Returning an object.

package JavaFoundation;

class test2 {
int a;

test2(int i) {
 a = i;
}

test2 incrByTen() {
 test2 temp = new test2(a+10);
 return temp;
}
}


public class OOPS_returnobject {
public static void main(String args[]) {
 test2 ob1 = new test2(2);
 test2 ob2;

 ob2 = ob1.incrByTen();
 System.out.println("ob1.a: " + ob1.a);
 System.out.println("ob2.a: " + ob2.a);

 ob2 = ob2.incrByTen();
 System.out.println("ob2.a after second increase: "
                     + ob2.a);
}
}