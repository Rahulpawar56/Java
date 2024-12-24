public class NumberClassMethod
{
	public static void main(String x[])
	{	/*
		Float a=5.5f;
		Double b=100.0;
		Integer c=10002;
		*/
		//Conversion into int
		/*int d=a.intValue();    // FLoat to int
		int e=b.intValue();    // Long to int
		int f=c.intValue();    // Double to int
		System.out.println("D ="+d+"\tE ="+e+"\tF ="+f);
		*/
	
        //Conversion into double
		/*long d=a.longValue();    // FLoat to double
		long e=b.longValue();    // Long to double
		long f=c.longValue();    // int to double
		System.out.println("D ="+d+"\tE ="+e+"\tF ="+f);
		*/
		
	// 2) valueOf() : this method convert primitive type data value in referential value
	
	/*	int a=100;
		Integer p=Integer.valueOf(a);
		Float q=Float.valueOf(a);
		Double r=Double.valueOf(a);
		String s=String.valueOf(a);
		
		System.out.println("P ="+p+"\n"+"Q ="+q+"\n"+"R ="+r+"\n"+"S="+s);
		*/
		
	// 3) parseXXX() : this method used for convert string value into primitive type of data
	
		String s="1234";
		int a=Integer.parseInt(s);
		long l=Long.parseLong(s);
		double d =Double.parseDouble(s);
		System.out.println("Integer ="+a+"\n"+"Long ="+l+"\n"+"Double ="+d);
		
	}
}