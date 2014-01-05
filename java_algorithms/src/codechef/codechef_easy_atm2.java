package codechef;

import java.util.Scanner;
 
public class codechef_easy_atm2 {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        int x;
        double y;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextDouble();
        if (y - x - 0.5 > 0 && x % 5 == 0) 
        	System.out.printf("%.2f", y - x - 0.5);
        else 
        	System.out.printf("%.2f", y);
    }
}