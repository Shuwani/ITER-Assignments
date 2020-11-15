//2) WAP to demonstrate the use of class, public, private, static key word of java.

package pack1;
//public class Test{
//	void show() {
//		System.out.println("Hello World Using Access Specifier Public");
//	}
//}

//private class Test{
//	void show() {
//		System.out.println("Hello World Using Access Specifier Public");
//	}
//}
public class Question2 {
	static void show() {
		System.out.println("Static method is used");
	}
	public static void main(String[] args) {
//		for Public
//		Test T=new Test();
//		T.show();
//		Print the output
		
//		for Private
//		Test T=new Test();
//		T.show();
//		Shows error illegal  constructor not visible
		
		show();
//		As method is static so no need to create object to invoke the method
	}

}
/*
   Static method is used
*/