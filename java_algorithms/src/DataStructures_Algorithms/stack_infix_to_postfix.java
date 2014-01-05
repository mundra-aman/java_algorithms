/*********************************************************************

 Description : converting an infix expression to postfix using stacks
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;

import java.io.*;
import java.lang.Character;

public class stack_infix_to_postfix {
	public static void main(String args[]) throws IOException{
		int i,top;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases-->0){
			top = -1;
			String Input = br.readLine();
			String stack[] = new String[Input.length()];
			for(i=0;i<Input.length();i++){
				if(Input.charAt(i)=='(')
					continue;
				else if(Character.isLetter(Input.charAt(i)))
					System.out.print(Input.charAt(i));
				else if((Input.charAt(i)=='+')||(Input.charAt(i)=='-')||(Input.charAt(i)=='*')||(Input.charAt(i)=='/')||(Input.charAt(i)=='^')){
					top++;
					stack[top] = Character.toString(Input.charAt(i));					
				}
				else if(Input.charAt(i)==')'){
					if(top!=-1){
						System.out.print(stack[top]);
						top--;
					}
				}
			}
			System.out.println();
		}
	}
}