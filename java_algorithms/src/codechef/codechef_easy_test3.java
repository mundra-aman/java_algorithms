package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codechef_easy_test3 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		while((num = Integer.parseInt(br.readLine())) != 42)
		{
			System.out.println(num);
		}
	}

}