//Integer to Binary
import java.util.*;
import java.lang.*;
public class InegerToBinary
{
	public static void main(String x[])
	{
		Scanner  xyz=new Scanner(System.in);      
		System.out.println("Enter a number ");
		int no=xyz.nextInt();
		int sum=0;
		int count=0;
		while(no!=0)    //23
		{
			int rem=no%2;  // 10%2=0 
			no=no/2;         // 10/2=5
			int p=(int)Math.pow(10,count);
			sum=sum+rem*p;
			count++;
			
		}
		System.out.println("Bianry Number ="+sum);
	}
}