//14) WAP to find first non-repeating character in a string

package ass3;
import java. util.*;

public class Question14{ 
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the string");
 String s=sc.nextLine();
 int i,j;
 System.out.println("First non-repeating character in string is:");
 for(i=0;i<s.length();i++){
   char ch=s.charAt(i);
  if(ch==' ')
    continue;
  int count=0;
   for(j=0; j<s.length();j++){
     char ch1=s.charAt(j);
     if(ch==ch1)
       count++;
      
     }
      s=s.replace(ch,' ');
      if(count==1){
         System. out. println(ch);
         break;
       }
       }}}

  /*OUTPUT
Enter the string
gibblegabbler
First non-repeating character in string is:
i
*/
   