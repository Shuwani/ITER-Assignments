import java.time.LocalDate;
import java.time.Year;

public class Question09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Year year=Year.now();
		System.out.println(year);
		boolean y=year.isLeap();
		if(y)
			System.out.println(year.length());
		else
			System.out.println(year.length());
	}
}
