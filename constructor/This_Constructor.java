//This constrictor

class Constructor
{
	Constructor()
	{
		this(5);
		System.out.println("I am First Constructor");
	}
	Constructor(int a)
	{
		this(5.5f);
		System.out.println("I am Int Constructor");
	}
	Constructor(float b)
	{
		System.out.println("I am Float Constructor");
	}
}
public class This_Constructor
{
	public static void main(String x[])
	{
		Constructor C=new Constructor();
	}
}