//Armstrong 
import java.util.*;
import java.lang.*;
public class ArmstrongRec
{	public static int sum=0;
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
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
		else
		{
			System.out.println("Not Armstrong number");
		}
	}
	public static int show(int n,int count)
	{
		if(n!=0)
		{
			int rem=n%10;
			n=n/10;
			int p=(int)Math.pow(rem,count);
			sum=sum+p;
			show(n,count);
		}
		return sum;
	}
}