// 17) WAP to remove all the occurrences of a given character from an input String. 

package ass3;
import java. util.*;
public class Question17{ 
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the string");
  String s=sc.nextLine();
  System.out.println("Enter the character which u want to remove from the string");
  char ch=sc.next().charAt(0);
  String a=s.replace(ch, ' ');
  for(int i=0;i<a.length();i++){
    if(a.charAt(i)==' '){
     continue;
    }
    System.out.print(a.charAt(i));
    }
    }}

/*OUTPUT
Enter the string
aeroplane
Enter the character which u want to remove from the string
e
aroplan
*/