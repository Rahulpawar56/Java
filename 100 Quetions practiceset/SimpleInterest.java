/*
Write a C program to input principle, time and rate (P, T, R) from user and find Simple Interest.
 How to calculate simple interest in C programming. Logic to find simple interest in C program.
*/
import java.util.*;
public class SimpleInterest
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a principal");
		int p=xyz.nextInt();
		System.out.println("Enter a rate of interest");
		int r=xyz.nextInt();
		System.out.println("Enter a Time");
		int t=xyz.nextInt();
		
		int total=p*r*t/100;
		System.out.println("Simple interest = "+total);
	}
}