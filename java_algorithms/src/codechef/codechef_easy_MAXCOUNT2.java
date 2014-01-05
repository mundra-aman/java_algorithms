package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codechef_easy_MAXCOUNT2 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int testcases=Integer.parseInt(br.readLine());
		while(testcases-->0){
			int size=Integer.parseInt(br.readLine());
			String str[]=br.readLine().split(" ");
			int max=0;
			int array[]=new int[10001];
			for(int i=0;i<size;i++){
				int num=Integer.parseInt(str[i]);
				array[num]++;
				if(array[max]<array[num])
					max=num;
				else if(array[max]==array[num]&&max>num)
					max=num;
			}			
			System.out.println(max+" "+array[max]);
		}	// end of while
	}
}