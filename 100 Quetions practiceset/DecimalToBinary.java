//Decimal To Binary
import java.util.*;
import java.lang.*;              // 10%2 = 1010      0
public class DecimalToBinary
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=xyz.nextInt();
		int sum=0;
		int count=0;
		while(no!=0)
		{
			int rem=no%2;
			no=no/2;
			int p=(int)Math.pow(10,count);
			sum=sum+rem*p;
			count++;
		}
		System.out.println("Binary number ="+sum);
	}
}