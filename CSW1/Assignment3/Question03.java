//3) WAP to enter a String and count how many vowels are present in it..=

package ass3;
import java.util.*;
public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String str=sc.nextLine();

int c=0,i;
for(i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
	if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		c++;
}
		System.out.println("No of vowels in "+str+":"+c);

}
}
/*OUTPUT
Enter a string
AEROPLANE
No of vowels in AEROPLANE:5
*/