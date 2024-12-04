import java.util.*;
public class ExceptionHandling
{     static  int a[];
	public static void main(String x[])
	{
		char ch;
		do
		{
		Scanner xyz=new Scanner(System.in);
		System.out.println("case 1: ArrayIndexoutofbonds");
		System.out.println("case 2: ArithmeticException");
		System.out.println("case 3:	StringIndexoutofbonds ");
		System.out.println("case 4: NullPointerExecption");
		System.out.println("case 5: NumberFormatException");
		System.out.println("case 6: InputMismatchException");
		System.out.println("case 7: ClassNotFoundException");
		System.out.println("Enter a yor choice");
		int choice=xyz.nextInt();
		switch(choice)
		{
			case 1:
			{
				//IndexOutOfBonds
				int a[]=new int[2];
				try
				{
					a[0]=10;
					a[1]=20;
					a[2]=20;
					System.out.printf("%d\t",a[2]);
					
				}
				catch(ArrayIndexOutOfBoundsException arr)
				{
					System.out.println("index is greater than size");
					System.out.println("error is"+arr);
				}
				int sum=0;
				for(int i=0;i<a.length;i++)
				{
					sum+=a[i];
				}
				System.out.println("Sum of given element is = "+sum);
				
				break;
			}
			case 2:
			{
				//ArithmticException
				System.out.println("Enter a two numbers");
				int a=xyz.nextInt();
				int b=xyz.nextInt();
				int c;
				try
				{
					c=a/b;
					System.out.println("Division is ="+c);
				}
				catch(ArithmeticException ar)
				{
					System.out.println("If any number divided by zero then ans is infifnity");
					System.out.println("Error is "+ar);
				}
				System.out.println("Addition of two number is="+(a+b));
				break;
			}
			case 3:
			{
				//StringIndexOutOfBoundsException
				System.out.println("Enter a string");
				String s=xyz.nextLine();

				
				try
				{
					System.out.println(s.charAt(6));
				}
				catch(StringIndexOutOfBoundsException str)
				{
					System.out.println("Index not present in this string");
					System.out.println("Error is"+str);
				}
				for(int i=s.length()-1;i>=0;i--)
				{
					System.out.printf("%s",s.charAt(i));
				}	
				break;
			}
			case 4:
			{
				//NullPointerException
				
				try
				{
					a[0]=10;
					System.out.printf("%d\t",a[0]);
				}
				catch(NullPointerException ex)
				{
					System.out.println("Error is"+ex);
				}
				break;
			}
			case 5:
			{
				//NumberFormatException
				
				try
				{
					String s="1234 ";
					int a=Integer.parseInt(s);
					System.out.println(a);
				}
				catch(NumberFormatException ex)
				{
					System.out.println("Error is"+ex);
				}
				break;
			}
			case 6:
			{
				//InputMismatchException
				System.out.println("Enter a value of a and b");
				int a=xyz.nextInt();
				int b=xyz.nextInt();
				try
				{
					int c=a+b;
					System.out.println(c);
				}
				catch(InputMismatchException ex)
				{
					System.out.println("Error is"+ ex);
				}
				break;
			}
			case 7:
			{
				//ClassNotFoundException
				try{
					Class.forName("");
					
				} 
				catch(ClassNotFoundException ex)
				{
					System.out.println("Error is"+ex.getMessage());
					
				}
				break;
			}
			default:
			{
				System.out.println("Wrong choice");
			}
		}
		System.out.println("Do you continue again");
		ch=xyz.next().charAt(0);
		System.out.println("================================================================");
		}while(ch=='y' || ch=='Y');
	}
}