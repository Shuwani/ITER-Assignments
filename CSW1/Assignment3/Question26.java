/*26) Write a java program which will take a string input and print out a number of vowels and  
  consonant on that string. For example if the input is java then your program should
  print 2 vowels and 2 consonant
*/
package ass3;
import java. util.*;
public class Question26{ 
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String s=sc.nextLine();
int count=0, count1=0;
 for(int i=0;i<s.length();i++){
  char ch=s.charAt(i);
  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
    ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
    count++;
  }
  else{
    count1++;
  }
  }
  System.out.println(count+":vowels");
  System.out.println(count1+":consonants");
 }}

/*OUTPUT
Enter the string
shuwani
3:vowels
4:consonants
*/
