/*********************************************************************
Description: program showing file read-write operations
Author: 	 Amandeep Singh
Website: 	 http://kodevelop.com/
Email:  	 aman.adsm@gmail.com
github: 	 https://github.com/aman-devy

**********************************************************************/

package JavaFoundation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;



public class file_readwrite2{

  public static void main (String [] args) throws IOException {
    @SuppressWarnings("resource")
	BufferedReader br = new BufferedReader(new FileReader("test.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int count=st.countTokens();
    System.out.println(count);
	int array[]=new int[count];					     
    for(int i=0;i<count;i++){
    	array[i]=Integer.parseInt(st.nextToken());    
    }
    
    for(int i=0;i<count;i++){
    	System.out.println(array[i]);    
    }
    
    int i1 = Integer.parseInt(st.nextToken());    
    int i2 = Integer.parseInt(st.nextToken());    
   
 
    out.println(i1+i2);
    out.println(count);                           
    out.close();                                  
    System.exit(0);                          
  }
}