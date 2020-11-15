//23) WAP to move all uppercase characters to the end of string.
package ass3;
import java. util.*;
public class Question23{ 
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String s=sc.nextLine();
String up="";
String low="";
for(int i=0;i<s.length();i++){
  char ch=s.charAt(i);
  if(ch>='A' && ch<='Z'){
    up=up+ch;
  }
  else{
    low=low+ch;
  }
}
System.out.println(low+up);
}}
/*OUTPUT
Enter a string
MyNameIsKhan
yameshanMNIK
*/