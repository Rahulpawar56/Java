/*
WAP to create the abstract class name as StringOperation with method name as 
performOperation(String) and write its different logics in different child classes .
ConvertToUpper , MaxRepetativeChar , WordReverse
*/

import java.util.*;
abstract class StringOperation
{
	abstract void performOperation(String x);
}
class ConvertToUpper extends StringOperation
{	
	void performOperation(String s)
	{
		System.out.println();
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a' && a[i]<='z')
			{
				a[i]=(char)(a[i]-32);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%c",a[i]);
		}
	}

}
class MaxRepetativeChar extends StringOperation
{
 void performOperation(String s1)
	{
		System.out.println();
		char ch[]=s1.toCharArray();
		 for(int i=0;i<ch.length;i++)
		 {
			 int count=0;
			 for(int j=i+1;j<ch.length;j++)
			 {
				 if(ch[i]==ch[j])
				 {
					 count++;
					 ch[j]=0;
				 }
			 }
			 if(count!=0)
			 {
				 System.out.printf("%c\t",ch[i]);
			 }
		 }
	}
}
class WordReverse extends StringOperation
{
	void performOperation(String s2)
	{   
		System.out.println();
		for(int i=s2.length()-1;i>=0;i--)
		{
			System.out.printf("%s",s2.charAt(i));
		}
	}
	
}
public class StringOperation_Abstract_App
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=xyz.nextLine();
		
		ConvertToUpper c=new ConvertToUpper();
		c.performOperation(s);
		
		MaxRepetativeChar m=new MaxRepetativeChar();
		m.performOperation(s);
		
		WordReverse w=new WordReverse();
		w.performOperation(s);
		
	}
}
