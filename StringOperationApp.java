interface StringOper
{
	void performOperation(String x);
}
class ToUpperCase implements StringOper
{
	public void performOperation(String x)
	{
		String s=x.toUpperCase();
		System.out.println(s);
	}
}

class MaxRepatativeChar implements StringOper 
{
	public void performOperation(String x)
	{
		int max=0;
		char ch=x.charAt(0);
		for(int i=0;i<x.length();i++)
		{  
			int count =0;
			for(int j=i;j<x.length();j++)
			{
				if(x.charAt(i)==x.charAt(j))
				{
					count++;
				}
				
			}
			if(count>max)
			{
					max=count;
					ch=x.charAt(i);
					
			}
		}
		System.out.print(ch+"\n");
	}
}

class ReveseWord implements StringOper
{
	public void performOperation(String x)
	{
		char ch[]=new char[x.length()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=x.charAt(i);
		}
		int end=ch.length-1;
		for(int i=0;i<ch.length/2;i++)
		{
			if(i<end)
			{
				char temp=ch[i];
				ch[i]=ch[end];
				ch[end]=temp;
				end--;
			}
		}
		for(char c:ch)
		{
			System.out.print(c);
		}
	}
} 


public class StringOperationApp
{
	public static void main(String x[])
	{
		StringOper op=new ToUpperCase();
		op.performOperation("krushna");
		
		op=new MaxRepatativeChar();
		op.performOperation("mmmnnnnop");
		op=new ReveseWord();
		op.performOperation("krushna");
	}
}