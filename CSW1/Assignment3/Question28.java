/*28) Write a function to search for the existence of a string (target) in another string (source). 
 * the function takes two strings as the input and returns the index where the second string is 
 * found.if the target string cannot be found,then return -1.if you are a java developer ,then you 
 * can relate its behaviour to indexOf() method from java.lang.String class.this question is also 
 * asked as code and algorithm to check if a given short string is a substring of the main string.Can you get a linear solution (O(N))if possible?
 */
package ass3;
import java. util.*;
public class Question28{ 
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter two strings");
 String s=sc.nextLine();
 String str=sc.nextLine();
 int result=res(s, str);
 System. out. println(result);
}
  
  public static int res(String s, String str){
    boolean a=s.contains(str);   
 if(a){
    int b=s.indexOf(str);
    return b;
 }
 else{
   return -1;
   }
 }
 }
/*OUTPUT
Enter two strings
geeksforgeeks
for
5
*/