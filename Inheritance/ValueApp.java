/*
Write Program to create abstract class name as Value with one abstract and 
one non abstract method  void setValue(int ,int): this is non abstract method with two parameter 
 abstract int getResult(): this is abstract method  and you have two child class name as Power and 
 you have to override getResult() method in Power class and calculate power of two values and return 
 it as well as SearchDigit and you have to override getResult() consider first parameter of setValue() is
 number and second parameter is digit and you have to search digit in number and return it and if digit
 not found return -1 
*/
import java.util.*;
abstract class Value
{
	int base,index;
	void setValue(int a,int b)
	{
		base=a;
		index=b;
	}
	abstract int getResult();
}
class Power extends Value
{
	int getResult()
	{
		int pow=1;
		for(int i=1;i<=index;i++)
		{
			pow=pow*base;
		}
		return pow;
	}
}
class SearchDigit extends Value
{
	int getResult()
	{
		int no=base;
		int digit=index;
		int p=0;
		while(no!=0)
		{
			int rem=no%10;
			no=no/10;
			if(rem==digit)
			{
				return rem;
			}
		}
		return -1;
	}
}
public class ValueApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a base and index");
		int base=xyz.nextInt();
		int index=xyz.nextInt();
		
		System.out.println("Enter a number and search digit ");
		int no=xyz.nextInt();
		int digit=xyz.nextInt();
		
		Power P=new Power();
		P.setValue(base,index);
		int result=P.getResult();
		System.out.println("Power is ="+result);
		
		SearchDigit S=new SearchDigit();
		S.setValue(no,digit);
		result=S.getResult();
		if(result==-1)
		{
			System.out.println("Digit Not Found" );
		}
		else
		{
			System.out.println(" Found Digit="+result);
		}
	}
}
