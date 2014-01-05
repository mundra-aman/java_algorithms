/*
 * The chef has a recipe he wishes to use for his guests,
but the recipe will make far more food than he can serve to the guests.
The chef therefore would like to make a reduced version of the recipe which has the same ratios of ingredients, but makes less food.
The chef, however, does not like fractions.
The original recipe contains only whole numbers of ingredients,
and the chef wants the reduced recipe to only contain whole numbers of ingredients as well.
Help the chef determine how much of each ingredient to use in order to make as little food as possible.
Input
Input will begin with an integer T, the number of test cases.
Each test case consists of a single line.
The line begins with a positive integer N, the number of ingredients.
N integers follow, each indicating the quantity of a particular ingredient that is used.
Output
For each test case, output exactly N space-separated integers on a line,
giving the quantity of each ingredient that the chef should use in order to make as little food as possible.
Sample Input
3
2 4 4
3 2 3 4
4 3 15 9 6
Sample Output
1 1
2 3 4
1 5 3 2
Constraints
T≤100
2≤N≤50
All ingredient quantities are between 1 and 1000, inclusive.
 */

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codechef_easy_RECIPE {

	public static int GCD(int a,int b){
		return b==0 ? a : GCD(b,a%b);
	}

	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testcases=Integer.parseInt(br.readLine());
		while(testcases-->0){
			String str[]=br.readLine().split(" ");
			int n=Integer.parseInt(str[0]);
			int array[]=new int[n];  // ingredients
			for(int i=0;i<n;i++) array[i]=Integer.parseInt(str[i+1]);

			int x=array[0];
			for(int i=1;i<n;i++)	x=GCD(x,array[i]);
		
			for(int i=0;i<n-1;i++)
				System.out.print(array[i]/x+" ");
				System.out.println(array[n-1]/x);

		}
	}

}
