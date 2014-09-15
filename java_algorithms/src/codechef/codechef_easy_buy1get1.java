package codechef;

import java.io.*;

public class codechef_easy_buy1get1 {
	private static BufferedReader in;

	public static void main(String[] args) throws Exception {
		in = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		int n = Integer.parseInt(in.readLine().trim());
		for(int i = 0; i < n; i++) {
			StringBuilder s = new StringBuilder(in.readLine().trim());
			int count = 0;
			while(s.length() > 0) {
				char c = s.charAt(0);
				int index = 0;
				int charCount = 0;
				while((index = s.indexOf(String.valueOf(c))) != -1) {
					s.deleteCharAt(index);
					charCount++;
				}
				count += Math.ceil(charCount / 2.0f);
			}
			System.out.println(count);
		}
	}



}


