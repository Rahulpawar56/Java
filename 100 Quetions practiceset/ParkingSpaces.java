/*
A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or 
full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to 
find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).
*/
import java.util.*;
public class ParkingSpaces
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size i and j");
		int n1=xyz.nextInt();
		int n2=xyz.nextInt();
		int a[][]=new int[n1][n2];
		System.out.println("Enter a element in parking");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		int count1=0;
		int p=0;
		for(int i=0;i<a.length;i++)
		{   int count =0;
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==1)
				{
					count++;
				}
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
			if(count>count1)
			{
				count1=count;
				p=i;
			}
		}
		System.out.println(p+"--> "+"Row  Number of maximum vehicle "+count1);
	}
}