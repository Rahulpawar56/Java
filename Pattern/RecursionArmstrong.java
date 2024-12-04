//using recursion find armstrong number
import java.util.*;
import java.lang.*;
static int sum=0;
public class RecursionArmstrong
{   
	public static void main(String x[])
	{   
		Scanner xyz=new Scanner(System.in);
		int show(int ,int );
		System.out.println("Enter a number");
		int no=xyz.nextInt();
		int temp=no;
		int count=0;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		int res=show(no,count);
			if(res==no)
			{
				System.out.println("Armstrong number");
			}
			else{
				System.out.println("Not Armstrong number");
			}
			
	}
}
 static int show(int no,int x)
{
	if(no!=0)
	{
		int rem=no%10;
		no=no/10;
		int p=(int)Math.pow(rem,count);
		sum=sum+p;
		show(no,x);
	}
	else
	{
		return sum;
	}
	
}