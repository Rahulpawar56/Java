//Write a java program to copy content from one file to another file.
import java.io.*;
public class CopyOneToAnother
{
	public static void main(String x[])throws Exception
	{
		FileReader fr=new FileReader("D:\\Java Notes\\FileHandling\\OddNo.txt");
		FileWriter fw=new FileWriter("D:\\Java Notes\\FileHandling\\PrimeNo.txt",true);
		int data;
		while((data=fr.read())!=-1)
		{
			fw.write((char)data);
		}
		fw.close();
		fr.close();
	}
}