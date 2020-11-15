//6) WAP to get the first letter of each word in a string using regex in Java.

		package ass4 ;

		import java.util.Scanner;
		import java.util.regex.*;
		public class Question6 {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string");
				String input=sc.nextLine();
				Pattern p=Pattern.compile("\\b[A-Za-z]");
				Matcher m=p.matcher(input);
				while(m.find()){
					System.out.print(m.group()+"");
				}}
		}
/*OUTPUT
Enter the string
This is CSE Students
TiCS
*/
