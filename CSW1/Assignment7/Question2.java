package SecondAss;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;
public class Question2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("app");
		l1.add("xyz");
		l1.add("pqr");
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("app");
		l2.add("xyz");
		l2.add("pqr");
		boolean bool=l1.equals(l2);
		System.out.println(bool);
	}}