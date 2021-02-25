import java.time.Duration;
import java.time.LocalTime;
import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String b_time=sc.next();
		String a_time=sc.next();
		LocalTime i=LocalTime.parse(b_time);
		LocalTime i1=LocalTime.parse(a_time);
		long dhours=Duration.between(i, i1).toHours();
		long dmin=Duration.between(i, i1).toMinutes();
		long dmill=Duration.between(i, i1).toMillis();
		long dsec=Duration.between(i, i1).toSeconds();
		long dnanos=Duration.between(i, i1).toNanos();
		System.out.println(dhours+" "+dmin+" "+dmill+" "+dsec+" "+dnanos);
	}

}
