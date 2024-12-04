//Write a java programs compare two files
import java.io.*;
import java.util.*;
public class CompareTwoFiles
{
	public static void main(String x[])throws Exception
	{
		FileReader fr=new FileReader("D:\\Java Notes\\FileHandling\\OddNo.txt");
		FileReader fr1=new FileReader("D:\\Java Notes\\FileHandling\\EvenNo.txt");
		int data ,data1;
		int flag=0;
		while((data=fr.read())!=-1 && (data1=fr1.read())!=-1)
		{
			char ch=(char)data;
			char ch1=(char)data1;
			if(ch!=ch1)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("File Data Same...");
		}
		else
		{
			System.out.println("File Data Not Same...");
		}
	}
}