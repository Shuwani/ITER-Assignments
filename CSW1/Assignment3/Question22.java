//22) WAP to swap two string variables without using third or temp variable.

package ass3;
import java. util.*;
public class Question22{ 
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b=sc.nextLine();

 System.out.println("Before swap: " + a + " " + b);  
a = a + b;  
 b = a.substring(0, a.length() - b.length());  
 a = a.substring(b.length());  
  System.out.println("After : " + a + " " + b);  
  }  
}  
/*OUTPUT
20
10
Before swap: 20 10
After : 10 20
*/