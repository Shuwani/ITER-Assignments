package SecondAss;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> ts=new TreeMap<String,String>();
		ts.put("xyz","abc");
		ts.put("abc","srr");
		ts.put("pqr","sss");
		System.out.println(ts);
		for(String str:ts.keySet()) {
		System.out.println(str);
		}
		System.out.println(ts.get(ts));
		//System.out.println(ts.keySet());
	}}

