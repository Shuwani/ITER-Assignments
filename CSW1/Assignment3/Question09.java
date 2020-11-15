/*9.	Write a method that takes a delimited string to store a name and address, from which you can print 
 *  a mailing label.
 */ 
package ass3;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Question09 {
	public static void abc(String str,String del) {
		StringTokenizer ob=new StringTokenizer(str,del);
		while(ob.hasMoreTokens()){
			System.out.println(ob.nextToken());
		}
	}
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		System.out.println("Enter the delimeter you have entered in the string");
		String str2=sc.next();
		abc(str1,str2);
	}
}
/*OUTPUT
Enter the string
Sam Penn:14 Bridge St.:Hoboken,NJ 01881
Enter the delimeter you have entered in the string
:
Sam Penn
14 Bridge St.
Hoboken,NJ 01881
*/