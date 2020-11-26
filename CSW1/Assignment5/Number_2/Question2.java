package package_1;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
public class Question2 {
	public static double difValue(double n,double x) {
		return (Math.pow(x, n-1)*n);
	}
	public static double funValue(double c,double n,double x) {
		return (Math.pow(x, n)-c);
	}
	public static double calculate(double n,double c) {
		int f=1;
		double x1=c/2;
		double x2=0.0;
		while(f<=100) {
			x2=x1-funValue(c,n,x1)/difValue(n,x1);
			x1=x2;
			f++;
	}
	return x1;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		double c=sc.nextDouble();
		System.out.println("Enter value of n");
		double n=sc.nextDouble();
		NumberFormat nf=new DecimalFormat("#.000000");
		System.out.println(n+"th root of "+c+"is "+nf.format(calculate(n,c)));

	}

}
