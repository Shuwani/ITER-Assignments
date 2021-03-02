package SecondAss;

import java.util.LinkedList;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("app");
		l1.add("xyz");
		l1.add("pqr");
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("app");
		l2.add("xyz");
		l2.add("pqr");
		l1.addAll(l2);
		System.out.println(l1);
		

	}

}
