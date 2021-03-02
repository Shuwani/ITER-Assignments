package SecondAss;

import java.util.TreeMap;

public class Question13 {

	public static void main(String[] args) {
		TreeMap<String,String> ts=new TreeMap<String,String>();
		ts.put("xyz","abc");
		ts.put("abc","srr");
		ts.put("pqr","sss");
		System.out.println(ts);
		if(ts.containsValue("abc")) {
			System.out.println("Present");
		}
		else {
			System.out.println("Absent");
		}
	}
}
