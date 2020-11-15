//4) WAP to read and display all the environment variable.
package pack2;
import java.util.Map;
public class Question4 {
	public static void main(String[] args) {
		Map <String,String>env=System.getenv();
		for(Map.Entry<String, String>entry:env.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}

