/*********************************************************************
Description: program showing file read-write operations
Author: 	 Amandeep Singh
Website: 	 http://kodevelop.com/
Email:  	 aman.adsm@gmail.com
github: 	 https://github.com/aman-devy

**********************************************************************/

package JavaFoundation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class file_readwrite3 {
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("test.in"));
	  
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int count=st.countTokens();
	    System.out.println(count);
		
	    String str=st.nextToken();
	    System.out.println(str);
	                          
	    System.exit(0);   
	}

}
