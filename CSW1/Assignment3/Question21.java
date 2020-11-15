//21) WAP to capitalize first alphabet of each word in a string

package ass3;
import java.util.*;

public class Question21{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string");
String s = sc.nextLine();
StringTokenizer st = new StringTokenizer(s);
while(st.hasMoreTokens()){
String t=st.nextToken();
char ch=t.toUpperCase().charAt(0);
String h=t.substring(1)+" ";
System.out.print(ch+h);
System.out.print(t.toUpperCase().charAt(0)+t.substring(1)+" ");
}}}

