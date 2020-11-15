
//12)Write a method that converts its String parameters so that the letters are written in block five characters long.

package ass3;
import java.util.*; 
public class Question12{ 
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the string");
  String s=sc.nextLine();
  s=s.replace(" ","");
  for(int i=0;i<s.length();i++){
    if(i%5==0&& i!=0){
      System.out.print(" ");
    }
    System.out.print(s.charAt(i));
  }
    
  }
  }
  /*OUTPUT
Enter the string
This is how we would ordinarily write a sentence.
Thisi showw ewoul dordi naril ywrit easen tence .
*/
