// 24) WAP to generate random string of a given size.
package ass3;
import java.util.*; 
public class Question24 { 
  public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of string");
        int n=sc.nextInt();
        int lowerLimit = 97; 
        int upperLimit = 122; 
        StringBuilder r = new StringBuilder(n); 
 for (int i = 0; i < n; i++) { 
  int next= lowerLimit+
    (int)(Math.random()*(upperLimit - lowerLimit + 1)); 
    
    r.append((char)next); 
  } 
  
    System.out.println(r.toString()); 
    }
  }
/*OUTPUT
Enter the size of string
5
qfujk
*/
  