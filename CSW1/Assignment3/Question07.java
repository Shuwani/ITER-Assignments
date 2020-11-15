/*7. Write a program to enter a name as string and print the name in shorter manner.
     Ex: Ram Chandra Dash will become R.C.Dash
*/
package ass3;
import java.util.*;
public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=sc.nextLine();
		String a[]=str.split(" ");
		int l=a.length;
		System.out.println("Name in sorted form is:");
		for(int i=0;i<l-1;i++){
			System.out.print(a[i].charAt(0)+".");
		}
		System.out.print(a[l-1]);
	}

}
/*
Enter the name
Ram Chandra Dash
Name in sorted form is:
R.C.Dash
*/
