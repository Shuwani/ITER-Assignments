/*13.	Write a Java program to find longest Palindromic Substring within a string Example: 
 * The given string is: thequickbrownfoxxofnworbquickthe
The longest palindrome substring in the given string is; brownfoxxofnworb The length of the palindromic substring is: 16
*/
 
package ass3;
import java.util.Scanner;
public class Question13 {
	public static boolean checkPalin(String word) {
		StringBuffer sb = new StringBuffer(word);
		if((sb.reverse()).toString().equalsIgnoreCase(word)) {
			return true;
		}
		return false;
 	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String.");
		String str = in.nextLine();
		int i,j, max=0;
		String nm="", word="";
		for(i=0; i<str.length(); i++) {
			for(j=str.length()-1; j>=i; j--) {
				word = str.substring(i,j);
				if(checkPalin(word)) {
					if(word.length()>max) {
						max=word.length();
						nm=word;
					}
				}
			}
		}
		System.out.println(nm);
		System.out.println(max);

	}

}
/*OUTPUT
Enter the String.
thequickbrownfoxxofnworbquickthe
brownfoxxofnworb
16
*/
