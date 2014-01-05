/*********************************************************************

 Description : A simple java program to implement a stack
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stack_simple_example {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter stack size");
		int size=Integer.parseInt(br.readLine());   // maximum elements stack can hold
													// kind of stack buffer
		int top=-1;   // stack is null
		int stack[]=new int[size];  // declare array implementation of stack
		
		// push operation
		System.out.println("enter no.of insertions to perform in the stack: ");
		int k=Integer.parseInt(br.readLine());
		while(k-->0){  // loop to push elements 5 times in the stack
			if(top<=size){   // stack overflow check
			System.out.println("enter stack element: ");
			top++;				// increment position of top before push operation
			stack[top]=Integer.parseInt(br.readLine());   // push
			  }    
		
			else
			{
				System.out.println("stack overflow occured");
				break;  }
		}
			
		// traverse and display a stack
		System.out.println("stack traversal: ");
		while(top!=-1){ 	// stack underflow condition
			System.out.print(stack[top]+" ");   // note that elements will be displayed in reverse order
			top--;
		}										// FIFO order of elements 	

		top=4;  // reclaim the top position of the stack
		
		// pop an element from the stack
		System.out.println("\npop an element");
		if(top==-1)
			System.out.println("array underflow");
		else {
			int delitem=stack[top];
			top--;
			System.out.println("item popped: "+delitem);
			}
		
		// peek an element and display the top position
		System.out.println("peeking: "+stack[top]);
		
		System.out.println("\n"+top);  // show top of stack
		
		// traverse and display a stack
		System.out.println("stack traversal: ");
		while(top!=-1){ 	// stack underflow condition
			System.out.print(stack[top]+" ");   // note that elements will be displayed in reverse order
			top--;
		}										// FIFO order of elements 	
		
		System.out.println("\n"+top);
		
			
	}

}
