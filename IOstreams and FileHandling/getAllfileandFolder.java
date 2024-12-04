import java.io.*;
public class getAllFileandFolder
{
	public static void main(String x[])throws Exception
	{
		File f=new File("D:\\JAVA Notes");
		File list[]=f.listFiles();
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i]);
		}
	}
}