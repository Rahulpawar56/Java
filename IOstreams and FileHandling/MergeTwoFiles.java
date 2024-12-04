//Write a java program merge two files in third files
import java.io.*;
public class MergeTwoFiles
{
	public static void main(String x[])throws Exception	
	{
		FileReader fr=new FileReader("D:\\Java Notes\\FileHandling\\PrimeNo.txt");
		FileReader fr1=new FileReader("D:\\Java Notes\\FileHandling\\EvenNo.txt");
		FileWriter fw=new FileWriter("D:\\Java Notes\\FileHandling\\newFile.txt");
		
		int data,data1;
		while((data=fr.read())!=-1)
		{
			fw.write((char) data);
		}
		while((data1=fr1.read())!=-1)
		{
			fw.write((char) data1);
		}
		fr.close();
		fr1.close();
		fw.close();
	}
}