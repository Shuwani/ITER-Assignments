//3) WAP to create static function to check a number is prime or not.
 package pack1;
import java.util.Scanner;
public class Question3 {
	static boolean isPrime(int n) {
		int i,c=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
	if(c==2)
		return true;
	else
		return false;
	

}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		int num=sc.nextInt();
		boolean result=isPrime(num);
		if(result==true)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is a not prime number");
			
		}
   }
/*OUTPUT
   Enter the number to be checked:
    9
    9 is a not prime number
*/
