//6) Write a program to enter N number of strings arrange them in ascending order.

package ass3;
import java.util.Scanner;
public class Question06 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	System.out.println("Enter the strings");
	String str[]=new String [n];
	for(int k=0;k<n;k++) {
	str[k]=sc.next();}
	int i,j;
	String 	temp;
	for(i=0;i<str.length;i++){
		for(j=0;j<str.length-1;j++){
			if(str[j].compareTo(str[j+1])>0){
				temp=str[j];
				str[j]=str[j+1];
				str[j+1]=temp;
			}
		}}
	System.out.println("Strings in sorted order is:");
	for(int l=0;l<n;l++)
		System.out.println(str[l]);}
	}
/*OUTPUT
Enter the number
5
Enter the strings
Shuwani
Aeroplane
Lamp
Chalk
Duster
Strings in sorted order is:
Aeroplane
Chalk
Duster
Lamp
Shuwani
*/