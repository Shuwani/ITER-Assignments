//Write a program to demonstrate the working of splitting a text by a given
//pattern. The given input is \CSE1ECE2EEE3CIVIL".The output of the
//program is look like below:
//CSE
//ECE
//EEE
//CIVIL
//Use the split () and case controlling 
//ags to solve this.
package ass4;
import java.util.*;
import java.util.regex.*;
public class Question5 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d+",Pattern.CASE_INSENSITIVE);
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 Matcher m = p.matcher(str);
		 if(m.find()) {
			 String[] arr=str.split("[0-9]");
		 for(String str1:arr) {
			 System.out.println(str1);
		 }
		 }
	}
}
/*OUTPUT
  CSE1ECE2EEE3CIVIL
  CSE
  ECE
  EEE
  CIVIL
 */

