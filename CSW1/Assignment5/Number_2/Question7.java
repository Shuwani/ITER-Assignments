package package_1;
import java.util.*;
public class Question7 {
	public static int reverse(int n) {
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public static boolean palindrome(int n) {
		if(n==reverse(n))
			return true;
		else
			return false;
	}
	public static int check(int n) {
		int r=reverse(n);
		System.out.println("Number is:"+n);
		System.out.println("Reverse is:"+r);
		if(palindrome(n)) {
			return n;
		}
		else {
			System.out.println("Sum is:"+(n+r));
			return check(n+r);
		}
		
	}
     public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(check(n)+":is Palindromic Number");

	}

}
