//Question 3
import java.util.*;
public class BankWithdraw
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a withdraw money");
		int m=xyz.nextInt();
		double a=120;
		if((m%5==0)&& m<a)
		{
			double total=a-m-0.50;
			System.out.println("Withdraw Succesful Remaining balance ="+total);
		}
		else if((m%5!=0) && m<a)
		{
			System.out.println("Incorret amount Not multiple of 5");
		}
		else
		{
			System.out.println("Insufficient balance="+a);
		}
	}
}