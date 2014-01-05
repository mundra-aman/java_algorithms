package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Character;
import java.util.ArrayList;

public class codechef_easy_ONP1 {
	public static void main(String[] args) throws IOException{
		ArrayList<Character> operator=new ArrayList<Character>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		while(num-->0){					
			char ch[]=br.readLine().toCharArray();
			for(char c:ch){
				if(c=='(') 
					continue;
				else if(Character.isLetter(c))
					System.out.print(c);
				else if(c=='*'||c=='+'||c=='-'||c=='/'||c=='^'){
					operator.add(c);
				}
				else if(c==')'){
					if(operator.size()>=0){
						char cc=operator.get(operator.size()-1);
						System.out.print(cc);
						operator.remove(operator.size()-1);
					}
				}
			}
			System.out.println();
		}
	}	 
}