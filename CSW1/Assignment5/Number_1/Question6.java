package package_2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat nf=new DecimalFormat("##,##.##");
		double d=546717.86568;
		System.out.println(nf.format(d));

	}

}
