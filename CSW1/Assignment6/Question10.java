import java.time.LocalDate;
import java.time.Period;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate now=LocalDate.now();
		Period p=Period.ofDays(10);
		LocalDate before=now.minus(p);
		LocalDate then=now.plus(p);
		System.out.printf("Ten days from %s is %s%n",now,then);
		System.out.printf("Ten days before %s is %s%n",now,before);

	}

}
