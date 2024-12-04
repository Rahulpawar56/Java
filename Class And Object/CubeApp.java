/* Q1. Write a program to create class name as Cube with two methods  void setValue(int x): this function accept
 number as parameter int getCube(): this function can calculate cube of number and return it. 
 */
 
 import java.util.*;
 class Cube
 {
	int x;
	void setValue(int x)
	{
		this.x=x;
	}
	void getCube()
	{
		System.out.println("Cube is ="+(x*x*x));
	}
 }
 public class CubeApp
 {
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a value");
		int no=xyz.nextInt();
		
		Cube c=new Cube();
		c.setValue(no);
		c.getCube();
	}
 }