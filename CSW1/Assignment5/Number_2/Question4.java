package package_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=args.length;
		if(num<2) {
			System.err.println("Program requires at least two arguments");
		}
		else {
			double sum=0.0;
			for(int i=0;i<num;i++) {
				sum=(double)(sum+Double.valueOf(args[i]));
			}
			NumberFormat nf=new DecimalFormat("0.00");
			System.out.println(nf.format(sum));
		}}}