/*25) WAP to print all permutation of a given string. 
      For eg the given input is 123 then your program should print all six permutation.
*/
package ass3;
import java.util.Scanner;
public class Question25 {
	public static void permute(String str, int l, int r) {
		if (l==r) {
			System.out.println(str);
		}else {
			for(int i =0; i<=r; i++) {
				str = swap(str, l, i);
				permute(str, l+1, r); 
                str = swap(str,l,i); 
			}
		}
	}
	
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next(); 
        int n = str.length(); 
       permute(str, 0, n-1);

	}}
/*OUTPUT
123
213
123
132
123
213
231
231
321
312
*/
