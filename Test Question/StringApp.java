import java.util.*;
public class StringApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);      //scanner class 
		char ch[]=new char[6];                   //character array
		System.out.println("Enter a String");
		for(int i=0;i<ch.length;i++)           //Initializatin , condition,incre/decre
		{
			ch[i]=xyz.next().charAt(0);
		}
		System.out.println("Enter a search value");   //enter a search keyvalue
		char val=xyz.next().charAt(0);                //Store value
		
		for(int i=0;i<ch.length;i++)	//Initializatin , condition,incre/decre
		{
			if(ch[i]==val)
			{
				System.out.printf("%c %c",ch[i-1],ch[i+1]);   //print
			}
		}
		 
	}
}