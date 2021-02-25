import java.time.Year;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Year year=Year.now();
		System.out.println(year);
		if(year.isLeap()) {
		System.out.println(false);
		System.out.println(year.length());
		}
		else {
			System.out.println(true);
			System.out.println(year.length());
		}
	}

}
