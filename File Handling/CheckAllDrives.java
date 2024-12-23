import java.io.*;
public class CheckAllDrives
{
	public static void main(String x[])throws Exception
	{
		File f[]=File.listRoots();
		for(int i=0;i<f.length;i++)
		{
			long freeSpace=f[i].getFreeSpace();
			long totalSpace=f[i].getTotalSpace();
			System.out.println(f[i]+"\t"+"Total SPace:"+(totalSpace/1073741824)+"GB"+"\t"+"Free Space :" +(freeSpace/1073741824)+"GB"+"\t"+"Use SPace :"+((totalSpace-freeSpace)/1073741824)+"GB");
		}
	}
}