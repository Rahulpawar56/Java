import java.util.*;
public class OccurencAndRemoveElement
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=xyz.nextLine();
		 
		 int count1=1;
		 char s=0;
		 for(int i=0;i<str.length();i++)
		 {	int count=1;
			 for(int j=i+1;j<str.length();j++)
			 {
				 if(str.charAt(i) == str.charAt(j))
				 {
					 count++;
				 }
			 }
			 if(count>count1)
			 {
				 count1=count;
				 s=str.charAt(i);
			 }
		 }
		 char arr[]=str.toCharArray();
		 int i=0;
		 while(i<arr.length)
		 {
			 if(arr[i]==s)
			 {
				 arr[i]=0;
				 break;
			 }
			 i++;
		 }
		 int j=arr.length-1;
		 while(j>=0)
		 {
			 if(arr[j]==s)
			 {
				 arr[j]=0;
				 break;
			 }
			 j--;
		 }
		 for(int k=0;k<arr.length;k++)
		 {
			 System.out.printf("%s",arr[k]);
		 }
	}
}