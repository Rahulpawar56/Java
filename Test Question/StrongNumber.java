//Strong number
import java.util.*;
public class StrongNumber
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);    //scanner class
		System.out.println("Enter a number");   //Enter a number
		int no=xyz.nextInt();                  //store number
		
		int i=1;
		while(i<no)                         //condition
		{
			 int temp=i;
			 int sum=0;
			 while(temp!=0)               //condition
			 {
				int rem=temp%10;         //find reminder
				temp=temp/10;
				int cal=1;
				for(int j=1;j<=rem;j++)       //initialization ,condition ,incre/decre
				{
					cal=cal*j;                //calculate factorial
				}
				sum=sum+cal;                 //calculate sum
			 }
			 if(sum==i)                    //condition for the check sum and number are equal or not
			 {
				System.out.printf("%d\n",i);   //print
			 }
			 i++;                      //increment 
		}
	}
}