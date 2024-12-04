/*
Write a C program to find all roots of a quadratic equation using if else. How to find all roots of a
 quadratic equation using if else in C programming. Logic to find roots of quadratic equation in C programming.
*/
import java.util.*;
public class QuadraticEquation
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a value of a ,b and c");
		double a=xyz.nextDouble();
		double b=xyz.nextDouble();
		double c=xyz.nextDouble();
		double d=(b*b)-(4*a*c);
		
		double root1=0,root2=0;
		if(d>0)
		{
			root1=(-b-Math.sqrt(d))/2*a;
			root2=(-b+Math.sqrt(d))/2*a;
			System.out.println("Root1 ="+root1"\t"+"Root 2="+root2);
		}
		else
		{
			root1=(-b/2*a);
			System.out.println("Root 1="+root1);
		}
		
	}
}