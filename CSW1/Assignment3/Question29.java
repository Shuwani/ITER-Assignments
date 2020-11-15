/*29.	Write a function to implement an algorithm which will accept a string of characters and should 
 * find the highest occurrence of the character and display it. For example if input 
 * is "aaaaaaaaaaaaaaaaabbbbcddddeeeeee" it should return "a .
 */
package ass3;
import java .util.*;
public class Question29{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.next();
int i,c=0,max=0,j;
char ch,l=' ';
for(j=0;j<str.length();j++)

{
c=0;
  char chr=str.charAt(j);
for(i=0;i<str.length();i++)
{
	ch=str.charAt(i);
	if(ch==chr)
		c++;
	
}
if(c>max)
{
l=chr;
max=c;
}}
System.out.println(l);

	}
}
/*OUTPUT
Enter the string
aaaaaaaaaaaaabbbbcdddddeeeeeeeee
a
*/