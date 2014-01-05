package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
 
 
public class codechef_easy_factorial3 {
   	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
   		
   		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j, N, N_n, ch = 0;
   //     boolean done = false;
        int size = Integer.parseInt(br.readLine());
        
        @SuppressWarnings("rawtypes")
		List ArrayOut = new ArrayList();
        
        for (i = 1;i<=size;i++) {
            N = Integer.parseInt(br.readLine());
            for(j=1;j<=N;j++) {
                N_n = j;
                while (N_n >= 5) {
                    if (N_n % 5 == 0) {
                        N_n = N_n / 5;
                        ch++;
                    }
                    else break;
                }
            }
            
            ArrayOut.add(ch);
            ch = 0;
        }
        for(i=0;i<size;i++) System.out.println(ArrayOut.get(i));
    }
}