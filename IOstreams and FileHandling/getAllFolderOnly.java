import java.io.*;
public class getAllFolderOnly
{
	public static void main(String x[])
	{
		File f=new File("D:\\JAVA Notes");
		File list[]=f.listFiles();
		
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isDirectory())
			{
				System.out.println(list[i]);
			}
		}
	}
}