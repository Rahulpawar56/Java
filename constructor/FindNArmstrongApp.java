/*
WAP to create class name as FindNArmstrong with constructor and function
FindNArmstrong(int limit): you have to accept integer as parameter 
void showAllNumbersBetweenLimt(): find the all Armstrong numbers between limit 

Expected output is 
Input Limit: 11
Output: 1   2   3   4   5   6   7  8   9
Input Limt: 200
Output: 1   2   3   4   5   6   7  8   9   153


*/

import java.util.*;
class FindNArmstrong
{
	int no;
	FindNArmstrong(int no)
	{
		this.no=no;
	}
	
	void showAllNumbersBetweenLimt()
	{
		
		 int i=1;
		 while(i<=no)
		 {  int count=0;
			int temp=i;
			int sum=0;
			while(temp!=0)    
			{
				temp=temp/10;
				count++;
			}
			temp=i;
			while(temp!=0)
			{
				int p=1;
				int rem=temp%10;
				 temp=temp/10;
				 for(int j=1;j<=count;j++)
				 {
					p=p*rem;
				 }
				sum=sum+p;		
			}
			if(sum==i)
			{
				System.out.printf("%d\t",sum);
			}
			i++;
		 }
		 
	}
}
public class FindNArmstrongApp
{
	public static void main(String x[])
	{
		Scanner  xyz=new Scanner(System.in);
		System.out.println("Enter a limit:");
		int no=xyz.nextInt();
		
		FindNArmstrong F=new FindNArmstrong(no);
		F.showAllNumbersBetweenLimt();
	}
}