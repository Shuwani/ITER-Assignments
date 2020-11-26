package package_2;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int cd,cm,cy,bd,bm,by,d,m,y;
		int month[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("Enter birth date,month,year");
		bd=sc.nextInt();
		bm=sc.nextInt();
		by=sc.nextInt();
		System.out.println("Enter current date,month ,year");
		cd=sc.nextInt();
		cm=sc.nextInt();
		cy=sc.nextInt();
		if(cd>bd) {
			cd=cd=month[bm-1];
			cm=cm-1;
		}
		if(bm>cm) {
			cy=cy-1;
			cm=cm+12;
		}
		d=cd-bd;
		m=cm-bm;
		y=cy-by;
		System.out.println("Age is "+y+" years "+m+" months "+d+" days ");

	}

}
