//1) A Simple Text Formatter
package ass3;
import java.util.*;
import java.io.*;
import java.text.*;
class Align extends Format {
 private int c;
 public Align(int c) {
     this.c = c;
 }
 private List<String> input(String str) {
     List<String> l = new ArrayList<String>();
     if (str.equals(null))
         return l;
     for (int i = 0; i<str.length();i+=c) {
         int li=Math.min(i+c,str.length());
         l.add(str.substring(i, li)); 
     }
     return l;
 }
 public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition ignore){
     List<String> l_str = input(obj.toString());
     ListIterator<String> it = l_str.listIterator();
     while (it.hasNext()) {
         String str = it.next(); 
         toAppendTo.append(str);
         toAppendTo.append("\n");
     }
     return toAppendTo;
 }
 public Object parseObject(String source, ParsePosition pos) {
     return source;
 }
}
public class Question01 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(new FileReader("C:\\Users\\Hp\\Documents\\csw\\Assignment3\\src\\ass3\\Text"));
		String str="";
		while(sc.hasNextLine()) {
			str+=sc.nextLine()+" ";
		}
		Align a=new Align(50);
		 try {
		      FileWriter fw = new FileWriter("C:\\Users\\Hp\\Documents\\csw\\Assignment3\\src\\ass3\\Text");
		      fw.write(a.format(str));
		      fw.close();
		      System.out.println("Successfully Aligned");
		    } catch (IOException e) {
		      System.out.println(e);
		 }
	}
}
/*OUTPUT
 Successfully Aligned
 Lorem ipsum dolor sit amet,consectetur adipiscing 
elit, sed do eiusmod tempor incididunt ut labore e
t dolore magna aliqua. Ut enim ad minim veniam, q 
vis nostrud exerciation ullamco laboris nisi vt a 
liquip ex ea commodo consequat. Duis aute irure do
 lor in reprehenderit it voluptate velit esse cill
u m dolore ev fugiat nulla pariatur, Excepteur sin
t accaecat cupidatat non proident, sunt in culpa q
ui officia deserunt mollit anim id est laborum 
*/
