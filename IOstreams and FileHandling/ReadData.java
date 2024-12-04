//Read data from textFile
import java.io.*;
public class ReadData
{
	public static void main(String x[])throws Exception
	{
		FileReader fr=new FileReader("D:\\Java Notes\\FileHandling\\CreateFile1.txt");
		int data;
		while((data=fr.read())!=-1)
		{
			System.out.print((char)data);
			Thread.sleep(100);
		}
	}
}