//4) Write a program to enter a string and count the frequency each character present in it.

package ass3;
import java.util.*;
public class Question04 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	str=str.toLowerCase();
	int c=0,i;
	char chr,ch;
	for(chr='a';chr<='z';chr++)
	{
		c=0;
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch==chr)
				c++;
		}
		if(c>0)
			System.out.println("the frequency of " +chr+ ":" +c);
	}
}}