//Write a java program to create file and write contents , save and close file.

import java.io.*;
import java.util.*;
public class createNextFile
{
	public static void main(String x[])throws Exception
	{
		
		FileWriter fw=new FileWriter("D:\\Java Notes\\FileHandling\\newFile.txt",true);
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a Data ");
		String data=xyz.nextLine();
		fw.write(data);
		System.out.println("Data created Succesfully...");
		fw.close();
	}
}