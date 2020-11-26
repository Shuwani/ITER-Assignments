package package_1;
import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
public class Question1{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount borrowed");
		double amt=sc.nextDouble();
		System.out.println("Enter interest rate");
		double r=sc.nextDouble();
		System.out.println("Enter no of payment"); 
		int num=sc.nextInt();
		double mir=r/1200.0;
		double payment=(mir*amt)/(1-Math.pow((1+mir),-num));
		try {
			FileWriter f=new FileWriter("C:\\Users\\Hp\\Desktop\\1941012818\\Assignment5\\src\\package_1\\Text");
			f.write(String.format("Principal %15.2f        Payment %.2f\n",amt,payment));
			f.write(String.format("Annual Interest %8.2f           Term %d\n",r,num));
			double i,p;
			f.write(String.format("PaymentBalance   Interest       Principal    Principal\n"));
		for(int k=1;k<=num;k++) {
			i=mir*amt;
			p=payment-i;
			amt=amt-p;
			f.write(String.format("%-20d%-13.2f%-13.2f%.2f\n", k,i,p,amt));
		}
		f.write(String.format("Final Payment%11.2f\n",payment));
		f.close();
	}
		catch(Exception e) {
			System.err.println(e);
		}
		System.out.println("Written Successfully");
	}
}