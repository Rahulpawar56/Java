/*
 Write program to create class name as Factorial with two functions    void setValue(int x): this function 
accept  number as parameter    int getFactorial(): this function can calculate factorial of number and return it. 
*/
import java.util.*;
class Factorial
{
	int x;
	void setValue(int x)
	{
		this.x=x;
	}
	void getFactorial()
	{	int s=1;
		for(int i=1;i<=x;i++)
		{
			s=s*i;
		}
		System.out.println("Factorial is="+s);
	}
}
public class FactorialApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a Number");
		int no=xyz.nextInt();
		
		Factorial F=new Factorial();
		F.setValue(no);
		F.getFactorial();
	}
}