import java.io.*;
public class createNewFile
{
	public static void main(String x[])throws IOException
	{
		File f=new File("D:\\JAVA Notes\\FileHandling\\CreateFile1.doc");
		boolean a=f.exists();
		if(a)
		{
			System.out.println("File Exists already");
		}
		else{	
			boolean b=f.createNewFile();
			if(b)
			{
				System.out.println("File Created Sucessfully");
			}
			else
			{
				System.out.println("Some Problem here..");
			}
		}
	}
}