//8) Write a program to check whether the entered string is a pallindrome or not.

package ass3;
import java.util.Scanner;
public class Question08{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String str="";
		int i;
		for(i=s.length()-1;i>=0;i--){
			str=str+s.charAt(i);
		   }
		if(s.equalsIgnoreCase(str)){
	         System.out.println(str+" is pallindrome.");
		}
			else{
				System.out.println(str+" is not pallindrome.");
               }
	}
}
/*OUTPUT
Enter the String
radar
radar is pallindrome.
*/