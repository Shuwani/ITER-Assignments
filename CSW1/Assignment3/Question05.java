/*5.Write a program to enter a string and print the string in a format which says that 1st letter of    
 * each word present in the string must be printed in capital letters
 */

package ass3;
import java.util.*;
public class Question05 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	StringTokenizer st=new StringTokenizer(str);
	while(st.hasMoreTokens()){
		String s=st.nextToken();
		char ch=s.toUpperCase().charAt(0);
		String h=s.substring(1)+" ";
		System.out.print(ch+h);
	}
	}
}
/*
Enter the string
my name is shuwani
My Name Is Shuwani 
*/