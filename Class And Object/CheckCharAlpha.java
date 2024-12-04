/* Write program to create class name as CheckChar with two functions     void setChar(char ch): this function 
accept single character as input      boolean   checkChar(): this function can check character is alphabet or 
digit of special symbol if character is alphabet or digit return true if character is digit then return false.  
*/

import java.util.*;
class CheckChar
{
	char ch;
	void setChar(char ch)
	{
		this.ch=ch;
	}
	boolean checkChar()
	{
		if(ch>='0' && ch<='9')
		{
			return true;
		}
		else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class CheckCharAlpha
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a Character from keyboard");
		char ch=xyz.next().charAt(0);
		
		CheckChar C=new CheckChar();
		C.setChar(ch);
		boolean result=C.checkChar();
		if(result)
		{
			System.out.println("Character or Digit");
		}
		else
		{
			System.out.println("Special symbol");
		}
	}
}