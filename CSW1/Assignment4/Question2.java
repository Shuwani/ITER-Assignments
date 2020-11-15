// Write a Java program to read all mobile numbers present in given File and
// validate it on below criteria:
// -The first digit should contain number between 7 to 9.
// -The rest 9 digit can contain any number between 0 to 9.
// -The mobile number can have 11 digits also by including 0 at the starting.
// -The mobile number can be of 12 digits also by including 91 at the start-
// ing The number which satisfies the above criteria is a valid mobile Number.
package ass4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.*;
public class Question2{
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Hp\\Documents\\csw\\Assignment4\\src\\ass4\\PhoneNumber");
		BufferedReader br=new BufferedReader(fr);
		 Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		 Scanner sc=new Scanner(System.in);
		 String line=null;
	        while((line= br.readLine())!=null){
	        	Matcher m=p.matcher(line);
	        	m.reset(line);
			       if(m.matches()) {
			            System.out.println("Valid number:"+m.group());
			           }
			 else {
				 System.out.println("InValid number");
				 }
	        	}
	       }}
/*OUTPUT
Valid number:9334801590
InValid number
Valid number:09199884455
*/

