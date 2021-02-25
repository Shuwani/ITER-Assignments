import java.time.LocalDate;
import java.util.*;
import java.time.temporal.TemporalAdjusters;

public class Question06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year,month,date");
		int year=sc.nextInt();
		int month=sc.nextInt();
		int date=sc.nextInt();
		LocalDate bd=LocalDate.of(year, month, date);
		System.out.println(bd.getDayOfWeek());
	}

}
