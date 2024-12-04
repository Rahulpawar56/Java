//  Write a program in C to find the Floor and Ceil of the number 0 to 10 from a sroted array.
import java.util.*;
public class FloorCeil
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int i=0;
		int n=10;
		int floor=0;
		int ceil=0;
		while(i<=n)
		{
			if(i<1)
			{
				floor =-1;
				ceil=i;
				System.out.println("Floor ="+floor +"\t"+"Ceil = "+ceil);
			}
			else if(i==n)
			{
				floor=i-1;
				ceil=-1;
				System.out.println("Floor ="+floor +"\t"+"Ceil = "+ceil);
			}
			else if(i==1)
			{
				floor=1;
				ceil=1;
				System.out.println("Floor ="+floor +"\t"+"Ceil = "+ceil);
			}
			else{
			floor=i-1;
			ceil=i+1;
			System.out.println("Floor ="+floor +"\t"+"Ceil = "+ceil);
			}
			i++;
		}
	}
}