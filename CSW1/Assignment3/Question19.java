//19)  WAP to check if a string contains only digits
package ass3;
import java. util.*;
public class Question19{ 
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the string");
 String s=sc.nextLine();
 boolean dig=digit(s);
 System. out.println(dig);
 }
 public static boolean digit(String s){
 for(int i=0;i<s.length();i++){
   char ch=s.charAt(i);
 if(!Character.isDigit(ch)){
    return false;
 }
 
 }
  return true;
 }
 }
   
/*OUTPUT
 Enter the string
shuwani123
false
 */

