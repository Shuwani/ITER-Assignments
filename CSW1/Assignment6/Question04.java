import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int yy=sc.nextInt();
		int mm=sc.nextInt();
		int dd=sc.nextInt();
		LocalDate localDate=LocalDate.of(yy,mm,dd);
		System.out.println(localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek().name());
		System.out.println(localDate.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek().name());
		


	}

}
