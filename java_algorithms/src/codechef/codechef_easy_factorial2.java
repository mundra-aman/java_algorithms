package codechef;

import java.util.*;
class codechef_easy_factorial2
{

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String []args)
	{
		int t,c=0,i;
		long n,j,pow=5,copy;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			c=0;
			n=sc.nextInt();
			pow=5;
			while(pow<=n)
			{
				c+=(int)Math.ceil(n/pow);  
				pow*=5;
			}
			System.out.println(c);
		}
	}
} 