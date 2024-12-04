import java.io.*;
public class getFilesOnly
{
	public static void main(String x[])throws Exception
	{
		File f=new File("D:\\Java Notes");
		File list[]=f.listFiles();
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isFile())
			{
				System.out.println(list[i]);
			}
		}
	}
}