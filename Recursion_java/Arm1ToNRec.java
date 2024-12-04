//1 to n Armstrong number 
import java.util.*;
import java.lang.*;
public class Arm1ToNRec
{	public static int i=1;
	public static int j=1;
	public static int sum=0;
	public static int count=0;
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=xyz.nextInt();
		
		show(no);
	}
	
	public static int count(int no)
	{  
		if(no!=0)
		{
			no=no/10;
			count++;
			count(no);
		}
		return count;
	}
	
	public static int power(int no)
	{
		if(no!=0)
		{
			int rem=no%10;
			no=no/10;
			int p=(int)Math.pow(rem,count);
			sum=sum+p;
			power(no);
		}
		return sum;
	}
	public static void show(int n)
	{
		if(i<=n)
		{
			count=count(i);
			sum=power(i);
			if(sum==i)
			{
				System.out.println(i);
				i++;
				count=0;
				sum=0;
				show(n);
			}
			else
			{
				i++;
				count=0;
				sum=0;
				show(n);
			}
		}
	}
}