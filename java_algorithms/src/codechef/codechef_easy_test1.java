/*
 * Your program is to use the brute-force approach in order to find the Answer
 *  to Life, the Universe, and Everything. 
 *  More precisely... rewrite small numbers from input to output. 
 *  Stop processing input after reading in the number 42. 
 *  All numbers at input are integers of one or two digits.
Example


Input:
1
2
88
42
99

Output:
1
2
88
 * 
 */

// using for loop,while loop

package codechef;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class codechef_easy_test1 {

	public static void main(String[] args) throws IOException	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		for (; ;)
		{ 
			num = Integer.parseInt(br.readLine());
			if (num==42) break;     
			System.out.println(num);
		}
	}
}