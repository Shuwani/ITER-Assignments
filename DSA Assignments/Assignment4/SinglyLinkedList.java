import java.util.*;
class Node
{
protected int regd_no;
protected float mark;
protected Node next;
}
public class SinglyLinkedList
{
public static void create(Node start)
{
Node p,q;
Scanner sc=new Scanner(System.in);
p=start;
System.out.println("Enter registration no. & mark of the student:");
p.regd_no=sc.nextInt();
p.mark=sc.nextFloat();
p.next=null;
System.out.println("Do You Want To Add Another Node(YES-1,NO-0)");
int option=sc.nextInt();
while(option!=0)
{
q=new Node();
System.out.println("Enter registration no. & mark of the student:");
q.regd_no=sc.nextInt();
q.mark=sc.nextFloat();
q.next=null;
p.next=q;
p=q;
System.out.println("Do You Want To Add Another Node(YES-1,NO-0)");
option=sc.nextInt();
}
}
 public static Node InsBeg(Node head ){
   Scanner sc=new Scanner(System.in);
  Node newnode=new Node();
  System.out.println("Enter registration no. & mark of the student:");
  newnode.regd_no=sc.nextInt();
  newnode.mark=sc.nextFloat();
  newnode.next=null;
      if(head==null){
      head=newnode;
   }
     
       newnode. next=head;
      head=newnode;
      return head;
    }
public static Node InsEnd(Node head){
Scanner sc=new Scanner(System.in);
  Node newnode= new Node();
  System.out.println("Enter registration no. & mark of the student:");
  newnode.regd_no=sc.nextInt();
  newnode.mark=sc.nextFloat();
  newnode.next=null;
  
  if(head==null){
    return head;
  }
  Node current =head;
  while(null!=current.next){
    current=current.next;
  }
  current.next=newnode;
  return head;
 }
 
 public static Node InsAny(Node head){
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Location");
  int position=sc.nextInt();
    if(position<1){
      System.out.println("invalid");
    return head;
    }
    
    if(position==1){
      Node temp=head;
      head=head.next;
      temp.next=null;
      return temp;
    }
    else{
    Node previous=head;
    int count=1;
    while(count<position-1){
      previous= previous. next;
      count++;
    }
    Node newNode=new Node();
   System.out.println("Enter registration no. & mark of the student:");
  newNode.regd_no=sc.nextInt();
  newNode.mark=sc.nextFloat();
  newNode.next=null;
    
    Node current=previous.next;
    newNode.next=current;
    previous.next=newNode;
    return head;
  }
  }
public static Node DelBeg(Node head){
    if(head==null){
      return head ;
    }
    Node temp=head;
    head=head.next;
    temp. next=null;
    return head;
  }
public static Node DelEnd(Node head){ 
Scanner sc=new Scanner (System.in);   
Node n=head;
Node o=new Node();
while(n.next!=null){    
o=n; 
n=n.next; 
} 
o.next=null;
return head;
}
  public static Node DelAny(Node head){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter position");
    int position=sc.nextInt();
    if(position<1){
      System.out.println("invalid");
    return head;
    }
    if(position==1){
      Node temp=head;
      head=head.next;
      temp.next=null;
      return temp;
    }
    else{
    Node previous=head;
    int count=1;
    while(count<position-1){
      previous= previous. next;
      count++;
    }
    Node current=previous.next;
    previous. next=current.next;
    current. next=null;
    return head;
    }
  }
  public static void search(Node head)
{
  if(head==null)
    {
    System.out.println("Memory Underflow");
      System.exit(0);
    }
  else
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the student's registration no whose mark to be updated");
    int key=sc.nextInt();
  Node curr=head;
    while(curr!=null)
    {
      if(curr.regd_no==key)
        {
        break;
        }
      curr=curr.next;
    }
    System.out.println("Enter the updated mark");
    curr.mark=sc.nextFloat();
    System.out.println("Node Found & Mark Updated");
    }

}
public static void sort(Node head){
  Scanner sc=new Scanner(System.in);
  Node i,j;

float temp;
for(i=head;i!=null;i=i.next)
{
for(j=i.next;j!=null;j=j.next)
{
if(i.mark>j.mark)
{
temp=i.mark;
i.mark=j.mark;
j.mark=temp;
}
}
}
System.out.println(head);
}
public static int count(Node head)
  {
    int count=0;
    Node p=head;
    while(p!=null)
    {
      count++;
      p=p.next;
    }    
    return count;
  }
public static Node reverse(Node head){
if(head==null){
 return head;
}
Node current=head;
Node previous=null;
Node next=null;
while (current!=null){
 next=current.next;
current. next=previous;
 previous=current;
current = next;
}
 return previous;
}
 public static void display(Node head)
{
while(head!=null)
{
  System.out.println(head.regd_no+"  "+head.mark);
  head=head.next;
}
}  
public static void main(String[] args) {
Node start=new Node();
  while(true){
System.out.println("****************MENU****************");
System.out.println("0:Exit");
System.out.println("1:Creation");
System.out.println("2:Display based on regd_no");
System.out.println("3:Insert a node at beginning");
System.out.println("4:Insert a node at end");  
System.out.println("5:Insert a node at any position");
System.out.println("6:Delete a node at beginning");
System.out.println("7:Delete a node at end");  
System.out.println("8:Delete a node at any position");
System.out.println("9:Search node");
System.out.println("10:Sort node");
System.out.println("11:Count node");
System.out.println("12:Reverse node");
System.out.println("************************************");
System.out.println("Enter the choice:");
Scanner sc=new Scanner(System.in);
int choice=sc.nextInt();
switch(choice)
{
case 0:
System.exit(0);
case 1:
create(start);
break;
case 2:
display(start);
break;
case 3:
start=InsBeg(start);
break;
case 4:
start=InsEnd(start);
break;
case 5:
start=InsAny(start);
 break;
case 6:
start=DelBeg(start); 
break;
case 7:
start=DelEnd(start);
break;
case 8:
start=DelAny(start);
break;
 case 9:
search(start);
 break;
 case 10:
 sort(start);
 break;
 case 11:
int a=count(start);
 System. out. println("no. of nodes="+a);
 break;
 case 12:
start=reverse(start);
break;
default:
System.out.println("Wrong choice");
}
}
}
}
