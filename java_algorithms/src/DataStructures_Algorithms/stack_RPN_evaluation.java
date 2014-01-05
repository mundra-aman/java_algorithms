/*********************************************************************

 Description : stack used to evaluate an expression written in RPN
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class stackoper{
	private int maxSize;
	private char stackArray[];
	private int top;

	public stackoper(int max){		//constructor

		maxSize = max;
		stackArray = new char[maxSize];
		top = -1;
	}

	public void push(char j){ // put item on top of stack
		stackArray[++top] = j;
	}

	public char pop(){			//take item from top of stack
		return stackArray[top--];
	}

	public char peek(){		//peek at top of stack
		return stackArray[top];
	}

	public boolean underflow(){		 // true if stack is empty
		return (top == -1);
	}

} // end class StackOP



class Evaluate{
	private String input;		//input string
	private String output;		//output string

	public Evaluate(String in){		//constructor
		input = in; 
	}

	public String eval(){		//evaluate the string
		int stackSize = input.length();		//get max stack size
		stackoper StackObj = new stackoper(stackSize); // make stack
		
		for(int j=0; j<input.length(); j++){
			int ch = input.charAt(j);		//get a char from input
			if(ch=='+' || ch=='/' || ch=='-' || ch=='*'){
				int ch1=input.charAt(j-1);
				int ch2=input.charAt(j-2);
				int ch3=ch1+ch+ch2;
				StackObj.push((char)ch3);
				break;
			}
				
				else	StackObj.push((char) ch);		//push it
		}

		output = "";

		while( !StackObj.underflow() ){
			char ch4 = (char) StackObj.pop();		//pop a char,
			output = output + ch4;		//append to output
		}
		return output;
	} // end doRev()

} // end class Reverser


public class stack_RPN_evaluation {
	public static void main(String[] args) throws IOException{
		String input, output;
		while(true){
			System.out.print("Enter the expression: ");
			System.out.flush();
			input = getString();		//read a string from kbd
			if( input.equals("") )		//quit if [Enter]
				break;

			
			Evaluate evalObj = new Evaluate(input);
			output = evalObj.eval();
			System.out.println("result of expression " + output);
		} // end while
	} // end main()

	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	
}
}