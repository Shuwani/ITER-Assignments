import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate.with(TemporalAdjusters.lastDayOfMonth()));


	}

}
