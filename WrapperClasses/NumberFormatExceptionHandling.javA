public class NumberFormatExceptionHandling
{
	public static void main(String x[])
	{
		String s="12345d";
		try
		{
			int a=Integer.parseInt(s);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}
}