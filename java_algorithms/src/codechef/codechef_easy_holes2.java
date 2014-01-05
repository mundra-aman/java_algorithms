package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codechef_easy_holes2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testcases=Integer.parseInt(br.readLine());
		for(int h=0;h<testcases;h++){
			int iholes=0;
			String str=br.readLine();
			char r[]=str.toCharArray();
			int l=str.length();
			for(int i=0;i<l;i++){
				if(r[i]=='A'||r[i]=='D'||r[i]=='O'||r[i]=='P'||r[i]=='Q'||r[i]=='R')
					iholes++;
				else if(r[i]=='B')
					iholes=iholes+2;
				}
			System.out.println(iholes);
		}
	}
}
