// Write a program to create Demonstrate code for multiple inheritance using interface. 
import java.util.*;
interface Square
{
	void showSquare(int no);
}
interface Cube
{
	void showCube(int no);
}
class Value implements Square ,Cube
{
	public void showSquare(int no)
	{
		System.out.println("Square of Number ="+(no*no));
	}

		public void showCube(int no)
		{
			System.out.println("Cube of Number is="+(no*no*no));
		}
}
public class Multiple_Interface
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=xyz.nextInt();
		
		Value v=new Value();
		v.showSquare(no);
		v.showCube(no);
		
	}
}