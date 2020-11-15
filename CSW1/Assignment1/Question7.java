 /*7) Create a bank application to perform basic operation as withdraw and deposit
       using object oriented approaches.
*/
package pack1;
import java.util.*;

public class Question7 {

      public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      Bankaccount obj=new Bankaccount("Abc","12345");
      obj.showdata();
       
    }
   }
    

class Bankaccount
{
    String CustomerName;
    String CustomerID;
    int Balance;
    int PreviousTransaction;
    Bankaccount(String cname,String cid)
    {
        CustomerName=cname;
        CustomerID=cid;
    }
    
    void Deposit(int amt)
    {
        if(amt!=0)
        {
            Balance=  Balance+amt;
            PreviousTransaction=amt;
        }
    }
    void Withdrawal(int amt)
    {
        
        if(amt!=0)
        {
        Balance=Balance-amt;
        PreviousTransaction=-amt;
        }
        
    }
void getprevioustransaction()
{
        if(PreviousTransaction>0)
         System.out.println("Deposited Amount:"+PreviousTransaction);
        
         else if(PreviousTransaction<0)
         System.out.println("Withdrawn amounts:"+Math.abs(PreviousTransaction));
        
         else
         System.out.println("No Transaction occurred");
}      

     void showdata()
        {
   int option=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("WELCOME!!"+CustomerName);
   System.out.println("Your Id number is"+CustomerID) ;
   System.out.println("\n");
   System.out.println("1.Check Balance");
   System.out.println("2.Deposit");
   System.out.println("3.withdrawal");
   System.out.println("4.Previous Transaction");
   System.out.println("5.EXIT" );
   
do{
    System.out.println("***********************************************");
    System.out.println("Enter a option");
    System.out.println("***********************************************");
    option=sc.nextInt();
    System.out.println("\n");
    switch(option)
    {
        case 1:
            System.out.println("***********************************************");
            System.out.println("balance="+Balance);  
            System.out.println("***********************************************");
            System.out.println("\n");
            break;
  case 2:
            System.out.println("***********************************************");
            System.out.println("Enter the amount to be deposited");  
            System.out.println("***********************************************");
            int a=sc.nextInt();
            Deposit(a);
            System.out.println("\n");
            break;
    
  case 3:
            System.out.println("***********************************************");
            System.out.println("Enter the amount to be withdrawn");  
            System.out.println("***********************************************");
            int x=sc.nextInt();
            Withdrawal(x);
            System.out.println("\n");
            break;
    
  case 4:
            System.out.println("***********************************************");
            getprevioustransaction();
            System.out.println("***********************************************");
            System.out.println("\n");
            break;
  case 5:
       System.out.println("***********************************************");
       break;
  default:
    System.out.println("Invalid Option!!!Please enter again");
    break;
    }}while(option!=5);
        {
            System.out.println("thank you for using your services");
        }
        
        }}

/*OUTPUT
 WELCOME!!Abc
Your Id number is12345


1.Check Balance
2.Deposit
3.withdrawal
4.Previous Transaction
5.EXIT
***********************************************
Enter a option
***********************************************
2


***********************************************
Enter the amount to be deposited
***********************************************
200


***********************************************
Enter a option
***********************************************
1


***********************************************
balance=200
***********************************************


***********************************************
Enter a option
***********************************************
WELCOME!!abc
Your Id number is12345


1.Check Balance
2.Deposit
3.withdrawal
4.Previous Transaction
5.EXIT
***********************************************
Enter a option
***********************************************
2


***********************************************
Enter the amount to be deposited
***********************************************
200


***********************************************
Enter a option
***********************************************
1


***********************************************
balance=200
***********************************************


***********************************************
Enter a option
***********************************************
*/
