//Singleton class
import java.util.*;
class Singleton
{	private static Singleton s=null;
	private Singleton()
	{
		System.out.println("I am singleton class");
	}
	public static Singleton show()
	{
		if(s==null)
		{
		  s=new Singleton();
		}
		return s;
	}
	
}
public class SingletonApp
{
	public static void main(String x[])
	{
		Singleton s=Singleton.show();
	System.out.println("Hash code of object"+System.identityHashCode(s));


		
		Singleton s1=Singleton.show();
		System.out.println("Hash code of object "+System.identityHashCode(s1));


	}
}