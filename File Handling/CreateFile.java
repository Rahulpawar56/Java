import java.io.*;
public class CreateFile
{
	public static void main(String x[])throws Exception
	{
		File f=new File("C:/GITHUB/Java/File Handling/createNewFile");
		boolean b=f.mkdir();
		if(b)
		{
			System.out.println("File Created Succesfully....");
		}
		else
		{
			System.out.println("File exist already there....");
		}
		
	}
}