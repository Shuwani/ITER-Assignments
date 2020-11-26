package package_1;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=args.length;
		if(num<2) {
			System.err.println("Program requires at least two arguments");
		}
		else {
			int sum=0;
			for(int i=0;i<num;i++) {
				sum=(int)(sum+Integer.valueOf(args[i]));
			}
			System.out.println(sum);
		}

	}

}
