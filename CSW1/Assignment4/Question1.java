package ass4;
import java.util.*;
import java.util.regex.*;
public class Question1 {

	public static void main(String[] args) {
		
		String input="Do me a favor.I will do";
		Pattern p=Pattern.compile("[\\s]");
		Matcher m=p.matcher(input);
		StringBuffer sb=new StringBuffer();
		while(m.find()){
			System.out.println(m.replaceAll(""));
		}
}}
/*OUTPUT
 Domeafavor.Iwilldo
*/

