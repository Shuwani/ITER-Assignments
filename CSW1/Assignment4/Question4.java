package ass4;
import java.util.*;
import java.util.regex.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String pattern="\\d+";
		String input=sc.nextLine();
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(input);
		int max=0;
		while(m.find()){
			int num=Integer.parseInt(m.group());
			if(num>max)
				max=num;
		}
		System.out.println(max);
  }
}
/*OUTPUT
 There are 60 students in csed, 40 in cseb, and 55 in cse
60
*/
