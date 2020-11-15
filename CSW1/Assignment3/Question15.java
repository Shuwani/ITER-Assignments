//15) Write a java program to remove the title from a name(Ms.,Mr.)

package ass3;
import java. util.*;
public class Question15{ 
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the string");
  String s=sc.nextLine();
  String a[]=s.split(" ");
  
  for(int i=0;i<a.length-1;i++){
    if(a[0].equals("Mr.")|| a[0].equals("Ms.")){
      System.out.print(a[i+1]+" ");
     }
     }
  }}
/*OUTPUT
Enter the string
Ms. Saina Nehwal
Saina Nehwal 
*/