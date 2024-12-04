//Write a java program to read numbers from a file  and write even,odd and Prime numbers to seperate file
import java.io.*;
public class ReadNumberFromFile
{
	public static void main(String x[])throws Exception
	{
		FileReader fr=new FileReader("D:\\Java Notes\\FileHandling\\newFile.txt");
		FileWriter fw=new FileWriter("D:\\Java Notes\\FileHandling\\EvenNO.txt",true);
		FileWriter fw1=new FileWriter("D:\\Java Notes\\FileHandling\\OddNo.txt",true);
		FileWriter fw2=new FileWriter("D:\\Java Notes\\FileHandling\\PrimeNo.txt",true);
		int data;
		
		while((data=fr.read())!=-1)
		{ 
			if(data>='0' && data<='9')
			{   int n=data-48;
				int count=0;
				int i=1;
				while(i<=n)
				{
					if(n%i==0)
					{
						count++;
					}
					i++;
				}
				if(count==2)
				{
					fw2.write(data);
				}
				
				if(n%2==0)
				{
					fw.write(data);
				}
				if(n%2!=0)
				{
					fw1.write(data);
				}
			}
		}
		
		fw.flush();
		fw.close();
		fw1.flush();
		fw1.close();
		fw2.flush();
		fw2.close();
	}
}