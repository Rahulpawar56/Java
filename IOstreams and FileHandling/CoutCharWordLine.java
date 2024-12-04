//Write a java program to count characters,words and lines in a text files
import java.io.*;
public class CoutCharWordLine
{
	public static void main(String x[])throws Exception
	{
		FileReader fr=new FileReader("D:\\Java Notes\\FileHandling\\NewText.txt");
		int data;
		int data1;
		int count=0;
		int count1=0;
		
		while((data=fr.read())!=-1)
		{	
			data=(char)data;
			if(data==' ')
			{
				continue;
			}
			else
			{
				count++;
			}
		}
		System.out.println("Total character = "+count);
		fr.close();
	}
}