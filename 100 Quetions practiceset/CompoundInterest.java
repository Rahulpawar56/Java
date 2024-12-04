// p*(pow((1+I/100),T));
/*
Write a C program to input principle (amount), time and rate (P, T, R) and find Compound Interest.
 How to calculate compound interest in C programming. Logic to calculate compound interest in C 
*/
import java.util.*;
import java.lang.*;
public class CompoundInterest
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a principal");
		int p=xyz.nextInt();
		System.out.println("Enter a rate f interest");
		int r=xyz.nextInt();
		System.out.println("Enter a time");
		int t=xyz.nextInt();
		
		int CI=p*(int)(Math.pow((1+r/100),t));
		System.out.println("Compound Interest ="+CI);
	}
}