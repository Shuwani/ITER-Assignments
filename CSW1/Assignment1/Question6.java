//Demonstrate the use of public and private class using separate packages.
 
package pack1;
import pack2.*;
public class Question6 {

	public static void main(String[] args) {
		Question6b a=new Question6b();
		//Class is not accessible because its define private
		//To make restrictive access to variables and methods
		a.show();
	}

}
/*OUTPUT
Hello World
*/