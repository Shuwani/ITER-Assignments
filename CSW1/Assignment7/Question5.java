package SecondAss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("app");
		l1.add("xyz");
		l1.add("pqr");
		List<String> list=new ArrayList<String>(l1);
		for(String s:list) {
			System.out.println(s);
		}
		

	}

}
