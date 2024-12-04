//Wap Rev Word in string   Ex: Rahul Pawar    Output:   luhaR rawaP

import java.util.*;
class RevString
{
	String s;
	void setRevString(String s)
	{
		this.s=s;
	}
	void showRevString()
	{	
		for(int i=0;i<s.length();i++)
		{
			int j=i;
			while(j<s.length() && s.charAt(j)!=' ')
			{  j++;
			}
			for(int k=j-1;k>=i;k--)
			{
				System.out.printf("%c",s.charAt(k));
			}
			i=j;
			System.out.printf("\t");
		}
	}
}
public class RevWord_StringApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a String minimum two words");
		String s=xyz.nextLine();
		RevString S=new RevString();
		S.setRevString(s);
		S.showRevString();
	}
}