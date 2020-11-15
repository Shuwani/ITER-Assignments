/*11.	Design and write a Java program that searches for single- digit numbers in a text and changes
        them to their corresponding words. For ex- ample, the string "4 score and 7 years ago" would be 
        converted into 'four score and seven years ago 
 */
package ass3;
import java.util.*;
public class Question11 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String n=sc.nextLine();
    print(n);
   }
	public static void print(String n){
		int len=n.length();
		String str="";
		for(int i=0;i<len;i++){
			char ch=n.charAt(i);
	    switch(ch){
	    case '0':
	    	System.out.print(str+"Zero");
	    	break;
	    case '1':
	    	System.out.print(str+"One");
	    	break;
	    case '2':
	    	System.out.print(str+"Two");
	    	break;
	    case '3':
	    	System.out.print(str+"Three");
	    	break;
	    case '4':
	    	System.out.print(str+"Four");
	    	break;
	    case '5':
	    	System.out.print(str+"Five");
	    	break;
	    case '6':
	    	System.out.print(str+"Six");
	    	break;
	    case '7':
	    	System.out.print(str+"Seven");
	    	break;
	    case '8':
	    	System.out.print(str+"Eight");
	    	break;
	    case '9':
	    	System.out.print(str+"Nine");
	    	break;
	    default:
	    	System.out.print(str+ch);
	    	break;
	    }}}
}
/*Enter the string
4 score and 7 years ago
Four score and Seven years ago
*/
 