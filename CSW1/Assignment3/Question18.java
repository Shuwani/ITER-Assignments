// 18) Write a java code to find the longest substring without repeating characters in the given string.

package ass3;
import java.util.Scanner;
public class Question18 {
 public static boolean check(String n) {
	 int f=0;
	 String n1="";
	 n1 = n.substring(0,1);
	 for(int i=1; i<n.length(); i++) {
		 for(int j=0; j<n1.length(); j++) {
			 if (n.charAt(i) == n1.charAt(j))
				 f++;
		 }
		 if(f!=0) {
			 return false;
		 } else {
			 n1 = n1 + n.charAt(i);
		 }
	 }
	 return true;
 }
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String.");
		String str = in.nextLine();
		int max=0; String nm="";
		for(int i=0; i<str.length(); i++) {
			for(int j=str.length()-1; j>i; j--) {
				String n = str.substring(i,j);
				if(check(n)){
					if(n.length()>max) {
						max=n.length();
						nm=n;
					}
				}
			}
		}
		System.out.println(nm);
		System.out.println(max);
	}

}
/*OUTPUT
Enter String.
aeroplane
eroplan
7
*/
