/*
An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager 
wants to make the production of both types of vehicle according to the given data below:
•	1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
•	2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.

*/
import java.util.*;
public class Automobile_Company_Manufacture
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Total number of Vehicle");
		int V=xyz.nextInt();
		System.out.println("Enter a Total wheels of vehicle");
		int W=xyz.nextInt();
		
		int tw=0;                  
		int fw=0;
		int res=W/2;  
		fw=res-V;   
		tw=V-fw;
		System.out.println("Four willer ="+fw+"\t"+"Two wheeler ="+tw);
	}
}