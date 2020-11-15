// 16) WAP to read two string as user input and check if first contains the second
package ass3;
import java.util.Scanner;
public class Question16{ 
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter string1");
 String s=sc.nextLine();
 System.out.println("Enter string2");
 String str=sc.nextLine();
 boolean a=s.contains(str);
 System. out. println(a);
       }}
/*OUTPUT
Enter string1
geeksforgeeks
Enter string2
for
true
*/
