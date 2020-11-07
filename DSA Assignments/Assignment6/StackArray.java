import java. util. Scanner;
public class StackArray{
 
 public static boolean isempty(int top){
    if(top==-1)
    return true;
    else
    return false;
  }
  public static boolean isfull(int top){
    if(top==MAX-1)
    return true;
    else
    return false;
  }
  public static int push(int s[],int top){
    if(isfull(top))
    System. out. println("underflow");
    else{
      Scanner sc=new Scanner(System.in);
      System. out. println("push");
      int w=sc.nextInt();
      top++;
      s[top]=w;
     
    }
    return top;
  }
  public static int pop(int s[],int top){
    if(isempty(top))
    System. out. println("underflow");
    else{
      int w=s[top];
      top--;
      System. out. println("deleted ele "+w);
     
    }
    return top;
  }

public static void display(int s[],int top){
  if(top==-1)
  System. out. println("underflow");
  else{
    System. out. println("elements are");
    for(int i=top;i>=0;i--){
     System. out. println("|_  "+s[i]+"  _|");
     }
  }
}

public static final int MAX=5;
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
int stack[]=new int[MAX];
int top=-1;
while(true)
{
System.out.println("***MENU***");
System.out.println("0: Exit");
System.out.println("1: Push");
System.out.println("2: Pop");
System.out.println("3: Display");
System.out.println("Enter your choice");
int choice=sc.nextInt();
switch(choice)
{
case 0:
System.exit(0);
case 1:
top=push(stack,top);
break;
case 2:
  top=pop(stack,top);
  break;
case 3:
  display(stack, top);
  break;
default:
System.out.println("Invalid choice");
}
}
}
}