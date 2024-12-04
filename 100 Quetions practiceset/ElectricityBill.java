/*
Write a C program to input electricity unit charge and calculate the total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.
How to calculate electricity bill using if else in C programming. Program to find electricity
 bill using if else in C. Logic to find net electricity bill in C program.

*/
import java.util.*;
public class ElectricityBill
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a Unit ");
		int unit=xyz.nextInt();
		double total=0;
		if(unit<=50)
		{
			total=unit*0.50;
		}
		else if(unit>50 && unit <=150)
		{
			total=(50*0.50)+(unit-50)*0.75;
		}
		else if(unit >150 && unit<=250)
		{
			total =50*0.50+100*0.75+(unit-150)*1.20;
		}
		else 
		{
			total=50*0.50+100*0.75+100*1.20+(unit-250)*1.50;
		}
		System.out.println("Total light bill ="+total);
	}
}