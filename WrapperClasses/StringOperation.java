import java.util.*;
public class StringOperation
{
	public static void main(String x[])
	{	
		Scanner xyz=new Scanner(System.in);
		char ch;
		do{
			System.out.println("case 1:Reversing String");
			System.out.println("case 2:Inserting Characters");
			System.out.println("case 3:Appending String");
			System.out.println("case 4:Deleting Character from String");
			System.out.println("case 5:Replace a substring");
			System.out.println("case 6:Check Capacity ,Ensure Capacity from StringBuffer class");
			System.out.println("case 7:Demonstrate Chaining Methods by using StringBuffer");
			System.out.println("Enter a choice");
			int choice=xyz.nextInt();
			xyz.nextLine();
			switch(choice)
			{
				case 1:
				{
					//Reverse String
					System.out.println("Enter a String");
					String s=xyz.nextLine();
					StringBuffer sb=new StringBuffer(s);
					sb.reverse();
					System.out.println(sb);

					break;
				}
				case 2:
				{
					//Insert Character in String
					System.out.println("Enter a String");
					String s=xyz.nextLine();
					System.out.println("Enter character in string");
					String value=xyz.nextLine();
					System.out.println("Enter a index");
					int index=xyz.nextInt();
					StringBuffer sb=new StringBuffer(s);
					sb.insert(index , value );
					System.out.println(sb);
					break;
				}
				case 3:
				{
					//Append String
					System.out.println("Enter a First String");
					String s=xyz.nextLine();
					System.out.println("Enter a Second String");
					String s1=xyz.nextLine();
					StringBuffer sb=new StringBuffer();
					sb.append(s);
					sb.append(" ");
					sb.append(s1);
					System.out.println(sb);

					break;
				}
				case 4:
				{
					//Deleting Character from String
					System.out.println("Enter a String");
					String s=xyz.nextLine();
					System.out.println("Enter Deleting first index");
					int sindex=xyz.nextInt();
					System.out.println("Enter a deleting last index");
					int lindex=xyz.nextInt();
					StringBuffer sb=new StringBuffer(s);
					sb.delete(sindex,lindex);
					System.out.println(sb);
					break;
				}
				case 5:
				{
					//Replace a substring
					System.out.println("Enter a First String");
					String s=xyz.nextLine();
					System.out.println("Enter a Second String");
					String s1=xyz.nextLine();
					System.out.println("Enter replce first index");
					int sindex=xyz.nextInt();
					System.out.println("Enter a replace last index");
					int lindex=xyz.nextInt();
					StringBuffer sb=new StringBuffer(s);
					sb.replace(sindex,lindex,s1);
					System.out.println(sb);
					break;
				}
				case 6:
				{
					//Check Capacity ,Ensure Capacity from StringBuffer class
					StringBuffer sb=new StringBuffer("");
					System.out.println("Initial capacity ="+sb.capacity());
					sb.ensureCapacity(50);
					System.out.println("Ensure Capacity ="+sb.capacity());
					break;
				}
				case 7:
				{
					//Demostrate Chaining Methods by using StringBuffer
					//insert(),append(),replace(),delete()...
					System.out.println("Enter a String");
					String s=xyz.nextLine();
					System.out.println("Enter a Replce String");
					String r=xyz.nextLine();

					System.out.println("Enter a insert index");
					int index=xyz.nextInt();
					StringBuffer sb=new StringBuffer("Hello");
					sb.append(s);
					sb.insert(5,",");
					sb.replace(6,11,r);
					System.out.println(sb);

					break;
				}
				default:
				{
					System.out.println("Wrong Choice");
				}
			}
		 System.out.println("\n"+"Do You Continue Again");
		 ch=xyz.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}