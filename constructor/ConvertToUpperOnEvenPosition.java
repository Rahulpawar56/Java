/*
WAP to Create class ConvertToUpperOnEvenPosition with one constructor and method
ConvertToUpperOnEvenPosition(char[]): we have to pass character array as parameter 
void convert(): this method can convert even position character in upper case 
char [] getConvertedArray(): this method can return array after conversion.

*/
import java.util.*;
class CharArray
{
	char a[];
	CharArray(char a[])
	{
		this.a=a;
	}
	char [] getArray()
	{
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				a[i]=(char) (a[i]-32);
			}
		}
		return a;
	}
	
}
public class ConvertToUpperOnEvenPosition
{
	public static void main(String x[])
	{
		char a[]=new char[6];
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a character array:");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=xyz.next().charAt(0);
		 }
		CharArray C=new CharArray(a);
		char res[]=C.getArray();
		for(int i=0;i<res.length;i++)
		{
		   System.out.printf("%c\t",res[i]);
		}
	}
}