//create text file and read  a data
import java.io.*;
import java.util.*;
public class CreateTextFile
{
	public static void main(String x[])throws Exception
	{
		FileWriter fw=new FileWriter("D:\\Java Notes\\FileHandling\\CreateFile1.txt",true);
		BufferedWriter bw =new BufferedWriter(fw);
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a data in file");
		String data=xyz.nextLine();
		
		bw.write(data);
		bw.newLine();
		bw.close();
		System.out.println("Create file successfully...");
		fw.close();
		
		
	}
}