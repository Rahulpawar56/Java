//Write a java program to append content to a file.
import java.io.*;
import java.util.*;
public class AppedContent
{
	public static void main(String x[])throws Exception
	{
		FileWriter fw=new FileWriter("D:\\Java Notes\\FileHandling\\appendText.txt",true);
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a Data");
		String data=xyz.nextLine();
		fw.write(data);
		fw.close();
	}
}