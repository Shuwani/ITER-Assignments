package package_1;
import java.util.*;
public class Question5 {
	public static int reverse(int n) {
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int r=reverse(n);
		System.out.println("Reverse of "+n+" is "+r);
		if(n==r) 
			System.out.println(n+" is Palindrome");
		else
			System.out.println(n+" is not Palindrome");

	}

}
