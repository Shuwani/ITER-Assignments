/*1)  Write a java program to print hello world using eclipse IDE.
 * Explain the need of class. Explain why maim function is public and static. Explain what is need of return type and parameter to main function.
 */
package pack1;

public class Question1 {

	/*Need of class:It represents the set of properties or methods that are common to all objects of one type.
      It is basically a user defined blueprint or prototype from which objects are created. 
    */
	public static void main(String[] args) 
	/*Need of public:It is an Access modifier, which specifies from where and who can access the method.
	  JVM can invoke it from outside the class as it is not present in the current class.
	*/
	
	/*Need of static:The main() method is static so that JVM can invoke it without instantiating the class.
	  This also saves the unnecessary wastage of memory which would have been used by the object declared only for calling the main() method by the JVM.
	*/
	
	// Need of void:It is basically a keyword that specifies that a method doesn’t return anything.
	
	//Need of main: It is the identifier that the JVM looks for as the starting point of the java program.
	
	/*Need of String[] Args[] :it is command line arguments and is an array of type java.lang.String class. 
	  args is name of string array.and can be defined by user .
    */
	{
		System.out.println("Hello World");
	}

}
/*OUTPUT
 * Hello World
 */
