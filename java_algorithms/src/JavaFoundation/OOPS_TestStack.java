/*********************************************************************
 
 Description : Constructing a stack using OOP concepts
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

class Stack {
	  int stck[] = new int[10];
	  int top;
	  
	  // Initialize top-of-stack
	  Stack() {
		  top = -1;
	  }
	  
	  void push(int item) {
	    if(top==9) 
	      System.out.println("Stack is full.");
	    else 
	      stck[++top] = item;
	  }

	  // Pop an item from the stack
	  int pop() {
	    if(top < 0) {
	      System.out.println("Stack underflow.");
	      return 0;
	    }
	    else 
	      return stck[top--];
	  }
	}


class OOPS_TestStack {
	  public static void main(String args[]) {
	    Stack mystack1 = new Stack();
	    Stack mystack2 = new Stack();

	    // push some numbers onto the stack
	    for(int i=0; i<10; i++) mystack1.push(i);
	    for(int i=10; i<20; i++) mystack2.push(i);

	    // pop those numbers off the stack
	    System.out.println("Stack in mystack1:");
	    for(int i=0; i<10; i++) 
	       System.out.println(mystack1.pop());

	    System.out.println("Stack in mystack2:");
	    for(int i=0; i<10; i++) 
	       System.out.println(mystack2.pop());
	  }
	}