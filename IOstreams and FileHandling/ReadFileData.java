//Write a java program to read file contents and display on console
import java.io.*;
public class ReadFileData
{
	public static void main(String x[])throws Exception
	{
		FileReader fr=new FileReader("D:\\Java Notes\\FileHandling\\newFile.txt");
		int data;
		while((data=fr.read())!=-1)
		{
			System.out.print((char)data);
		}
		
	}
}