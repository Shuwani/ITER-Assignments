//20) WAP to input a string from user and reverse each word of the string.

package ass3;
import java. util.*;
public class Question20{ 
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the string");
 String s=sc.nextLine();
 String a[]=s.split(" ");
 int l=a.length;
  for(int i=l-1;i>=0;i--){
    System. out.print(a[i]+" ");
  }
 }}
/*OUTPUT
Enter the string
My name is Shuwani
Shuwani is name My 
 */


