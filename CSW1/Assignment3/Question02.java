//2) Soundex Name Comparisons.
 
package ass3;
import java.util.*;
public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
str=str.toUpperCase();
char ch[]=str.toCharArray();
int i,j;
String s="";
for(i=1;i<ch.length;i++)
{   
	
	if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='H'||ch[i]=='W'||ch[i]=='Y')
	   ch[i]='0';
	else if(ch[i]=='B'||ch[i]=='F'||ch[i]=='P'||ch[i]=='V')
     ch[i]='1';
	else if (ch[i]=='C'||ch[i]=='G'||ch[i]=='J'||ch[i]=='K'||ch[i]=='Q'||ch[i]=='S'||ch[i]=='X'||ch[i]=='Z')
     ch[i]='2';
	else if (ch[i]=='D'||ch[i]=='T')
		ch[i]='3';
	else if  (ch[i]=='L')
		ch[i]='4';
	else if(ch[i]=='M'||ch[i]=='N')
		ch[i]='5';
	else if (ch[i]=='R')
		ch[i]='6';
	
}

String str2="";
for(i=0;i<ch.length-1;i++)
{
	if(ch[i]!=ch[i+1])
	{
		str2=str2+ch[i];
		
	}}
	str2=str2+ch[i];
	


String str3=str2.replace("0", "");


str3=str3+"0000";
for(int k=0;k<str3.length();k++)
{
	if(k!=4)
		System.out.print(str3.charAt(k));
	else 
		break;
	}}}

/*OUTPUT
  Enter the string:
  HERMANN
  H655
*/