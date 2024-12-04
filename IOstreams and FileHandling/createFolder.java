import java.io.*;
public class createFolder
{
	public static void main(String x[])throws Exception
	{
		File f=new File("D:\\Java Notes\\FileHandlingPractice");
		boolean a=f.exists();
		if(a)
		{
			System.out.println("Folder Exists Already");
		}
		else{
			
			boolean b=f.mkdir();
			if(b)
			{
				System.out.println("Folder Created");
			}
			else
			{
				System.out.println("Some Problems here...");
			}
		}
	}
}