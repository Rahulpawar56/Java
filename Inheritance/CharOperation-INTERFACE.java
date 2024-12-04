/*
 Write program to create interface name as CharOperator with method  
void setCharArr(char []): this function is used for accept array as parameter 
char [] getArrResult(): this is abstract function and return character array as result. 
You have to create two implementer class name as ConvertToUpper and ChangeAlterNateChar you
 have to implement the CharOperator interface in ConvertToUpper class and override both methods 
 and convert lower case character to upper case and you have to implement the CharOperator in 
 ChangeAlterNateChar and override both methods and convert even position character as Upper and odd position 
 characters in lower. 

*/
interface CharOperator
{
	void setCharArr(char a[])
	{
		char ch[]=a;
	}
	char [] getArrResult();
}
class ConvertToUpper implements CharOperator
{
	char ch[];
	public void setCharArr(char a[])
	{
		ch=a;
	}
	public char[] getArrResult()
	{
		char a[]=new char[ch.length];
		a=ch;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a'&& a[i]<='z')
			{
				a[i]=(char)(a[i]-32);
			}
		}
		return a;
	}
}
class ChangeAlterNateChar implements CharOperator
{
	public char[] getArrResult()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				ch[i]=ah[i];
			}
			else
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		return ch;
	}
}
public class CharOperation
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size of character array");
		int size=xyz.nextInt();
		char a[]=new char[size];
		System.out.println("Enter a character  Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.next().charAt(0);
		}
		
		ConvertToUpper c=new ConvertToUpper();
		c.setCharArr(a);
		char ch[]=c.getArrResult();
		System.out.println();
		System.out.println("Convert intp upper case:");
		for(int i=0;i<ch.length;i++)
		{
			System.out.printf("%c\t",ch[i]);
		}
		
		ChangeAlterNateChar cn=new ChangeAlterNateChar();
		cn.setCharArr(a);
		char b[]=cn.getArrResult();
		System.out.println();
		System.out.println("Change Alternati Character");
		for(int i=0;i<b.length;i++)
		{
			System.out.printf("%c\t",b[i]);
		}
	}
}