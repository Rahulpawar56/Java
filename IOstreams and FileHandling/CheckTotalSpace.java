import java.io.*;
public class CheckTotalSpace
{
	public static void main(String x[])throws Exception
	{
		File f[]=File.listRoots();
		for(int i=0;i<f.length;i++)
		{
			long totalSpace=f[i].getTotalSpace();
			long FreeSpace=f[i].getFreeSpace();
			System.out.println( "Total Drive ="+f[i]+"\tTotal Space="+ (totalSpace/1073741824)+" GB"+
			"\tFreeSpace="+ (FreeSpace/1073741824)+" GB"+"\tUsable Space="+((totalSpace-FreeSpace)/1073741824)+"GB");
		}
	}
}