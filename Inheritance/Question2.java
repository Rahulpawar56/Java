// Questions 2
import java.util.*;
public class Question2
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("ENter a initial Volume");
		int iv=xyz.nextInt();
		System.out.println("Enter a Final Volume");
		int fv=xyz.nextInt();
		
		int count=0;
		int count1=0;
		if(iv<fv)
		{
			for(int i=iv;i<fv;i++)
			{
				count++;
			}
			System.out.println("Volume="+count);
		}
		else
		{
			for(int i=iv;i>fv;i--)
			{
				count1++;
			}
			System.out.println("Volume="+count1);
		}
	}
}