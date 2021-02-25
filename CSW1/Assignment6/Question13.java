import java.time.LocalDate;
import java.time.Period;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate birthdate=LocalDate.of(2002, 02, 17);
		LocalDate now=LocalDate.now();
		Period diff=Period.between(birthdate,now);
		System.out.printf("My age is %d years,% d months and %d days old",
				diff.getYears(),diff.getMonths(),diff.getDays());
     }
}
