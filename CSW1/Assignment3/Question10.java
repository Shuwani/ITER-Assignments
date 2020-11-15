/*10) Write a method that takes three string arguments a document, a target string and a replacement
   string. The mehod should replace every occurence of the string. The method should replace 
   every occurrence of the target string in the document with replacement string
*/

package ass3;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter document string");
    String d=sc.nextLine();
    System.out.println("Enter target string");
    String t=sc.nextLine();
    System.out.println("Enter replacement string");
    String r=sc.nextLine();
    String str=rep(d,t,r);
    System.out.println(str);
	}
	public static String rep(String d, String t, String r){
	String str=new String(d);
	String a=str.replace(t,r);
	return a;
  }
}
/*OUTPUT
Enter document string
To be or not to be,that is the question
Enter target string
be
Enter replacement string
see
To see or not to see,that is the question
*/