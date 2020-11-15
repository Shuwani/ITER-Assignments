/* 27)You are given 3 strings first, second and third . Third string is said to be a shuffle
 * of first and second if it can be formed by interleaving the characters of first and second 
 * String in a way that maintains the left to right ordering of the characters from each string.
 * For example, given first-"abc" and second "def", third -"dabecf" is a valid shuffle since it 
 * preserves the character ordering of the two strings. So given these 3 strings write a function 
 * that detects whether the third String is a valid shuffle of first and second String.
 */
package ass3;
import java.util.*;
public class Question27 {
	public static boolean shuffel(String str,String str1,String str2) {
		int i=0,j=0,k=0;
		  if (str.length()+str1.length()!=str2.length())
		   return false;
		  while (k<str2.length()) {
		   if (i< str.length()&&str.charAt(i)==str2.charAt(k))
		    i++;
		   else if (j < str1.length() && str1.charAt(j) == str2.charAt(k))
		    j++;
		   else 
		    return false;
		   k++;
		  }
		  if (!(i == str.length() && j == str1.length() && k == str2.length()))
		   return false;
		  return true;
		 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(shuffel(str,str1,str2));
	}
}
/*OUTPUT
abc
def
dabecf
true
*/
