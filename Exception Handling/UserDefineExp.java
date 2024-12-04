//User define Exception
import java.util.*;
class MyExp extends NullPointerException
{
	String getSms()
	{
		return "I am a MyException class";
	}
}
class CheckExp
{
	void get(int no)
	{
		if(no%2==0)
		{
			MyExp m=new MyExp();
			throw m;
		}
		else
		{
			System.out.println("This is odd number");
		}
	}
}

public class UserDefineExp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		try
		{
		System.out.println("Enter a number");
		int no=xyz.nextInt();
			CheckExp c=new CheckExp();
			c.get(no);
		}
		catch(MyExp m)
		{
			System.out.println("Exception :"+m.getSms());
		}
		System.out.println("Logic 1");
		System.out.println("Logic 2");
		System.out.println("Logic 3");
	}
}