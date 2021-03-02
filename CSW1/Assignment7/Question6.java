package SecondAss;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Character> hs=new HashSet<Character>();
		hs.add('a');
		hs.add('e');
		hs.add('i');
		hs.add('o');
		hs.add('u');
		TreeSet<Character> ts=new TreeSet<Character>(hs);
		for(Character ss:ts) {
			System.out.println(ss);
		}
	}

}
