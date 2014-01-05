package codechef;

import java.util.Scanner;
 
public class codechef_easy_intest2 {
	public static void main(String args[]){
		int count = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i = 0; i < n; i++){
	        if(sc.nextInt()%k==0) count++;
		}
		System.out.println(count);	
	}
}