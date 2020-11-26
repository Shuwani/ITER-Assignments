package package_2;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="56.60";
		String s1=s.substring(0,s.indexOf("."));
		String s2=s.substring(s.indexOf(".")+1);
		double wp=Double.parseDouble(s1);
		double fp=Double.parseDouble(s2);
		System.out.println("Sum="+(fp+wp));

	}

}
