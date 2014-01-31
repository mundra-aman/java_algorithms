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



public class file_readwrite1 {

  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    @SuppressWarnings("resource")
	BufferedReader br = new BufferedReader(new FileReader("test.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
    // Use StringTokenizer vs. readLine/split -- bit faster
    StringTokenizer st = new StringTokenizer(br.readLine());
						  // Get line, break into tokens

    int i1 = Integer.parseInt(st.nextToken());    // first integer
    int i2 = Integer.parseInt(st.nextToken());    // second integer

    out.println(i1+i2);                           // output result
    out.close();                                  // close the output file
    System.exit(0);                               // don't omit this!
  }
}