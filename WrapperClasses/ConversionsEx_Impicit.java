//Conversions 
public class ConversionsEx_Impicit
{
	public static void main(String x[])
	{
		long a;
		int b=100;  //Implicit Conversion
		a=b;
		System.out.println("Implicit Conversion Value of A="+a);  
		long y=100;
		int z=(int)y;  //Explicit Conversion
		System.out.println(" Explicit Conversion Value of b ="+z);
		
		//Auto Boxing
		int q=200;
		Integer c=q;    
		System.out.println("Auto Boxing ..C ="+c);
		
		
		
		//Auto unboxing
		Integer d=100;
		int p=d;
		System.out.println("Auto Unboxing ...P ="+p);
		
		
	}
}