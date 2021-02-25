import java.time.YearMonth;
import java.util.*;
public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		YearMonth ym=YearMonth.of(2020,month);
		int l=ym.lengthOfMonth();
		System.out.println(l);
		
		
		

	}

}
