// Utility class 

class Utility
{
	private Utility()
	{
	}
	static void show()
	{
		System.out.println("I am a show method:");
	}
	static void Display()
	{
		System.out.println("I am Display Method:");
	}
}
public class UtilityClass
{
	public static void main(String x[])
	{
		Utility.show();
		Utility.Display();
	}
}