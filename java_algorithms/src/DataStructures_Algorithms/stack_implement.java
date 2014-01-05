/*********************************************************************

 Description : A simple java program to implement a stack
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;

class stackOp{
	private int maxSize;
	private long stackArray[];
	private int top;

	public stackOp(int s){		//constructor
		maxSize = s;
		stackArray = new long[maxSize]; // create array
		top = -1;
	}

	public void push(long j){		//put item on top of stack
		stackArray[++top] = j;
	}

	public long pop(){
		return stackArray[top--]; // access item, decrement top
	}

	public void traverse(){
		if(top==-1) System.out.println("overflow...");
		else for(long i=0;i<=top;i++)
			System.out.print(stackArray[(int) i]+" ");
		System.out.print("\n");
	}

	public long peek(){
		return stackArray[top];
	}

	public long position(){
		return top;
	}

	public boolean underflow(){
		return (top == -1);
	}

	public boolean overflow(){
		return (top == maxSize-1);
	}
} // end class StackX




public class stack_implement {
	public static void main(String[] args){

		stackOp theStack = new stackOp(10); // make new stack

		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		theStack.traverse();
		System.out.println(theStack.peek());
		System.out.println(theStack.position());


		while( !theStack.underflow() )
		{
			long value = theStack.pop();
			System.out.print(" pop"+value);

		} // end while

		System.out.println("\nstack is empty now!");
		theStack.traverse();
		System.out.println("pushing new elements...");
		theStack.push(10);
		theStack.push(20);
		System.out.println(theStack.peek());
		System.out.println(theStack.position());
		theStack.traverse();


	} // end main()
	//until it’s empty,
	//delete item from stack
	//display it
} // end class StackApp