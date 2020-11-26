package package_1;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(double c=0;c<=100;c++) {
			NumberFormat nf=NumberFormat.getInstance();
			nf.setMinimumFractionDigits(2);
			//NumberFormat nf=new DecimalFormat("0.00");
			double d=(c*9.0/5.0)+32;
			System.out.println(c+"="+nf.format(d));
		}

	}

}
