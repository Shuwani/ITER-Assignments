//11) Write a java program to print null device of your system.
    package pack2;
	import java.io.File;
	public class Question11{
		static String UNIX_NULL_DEV="/dev/null";
		static String WINDOWS_NULL_DEV="NULL";
		static String FAKE_NULL_DEV="jnk";
		public static String getNullDev()
		{
			if (new File(UNIX_NULL_DEV).exists())
				return UNIX_NULL_DEV;
			String sys=System.getProperty("os.name");
			if(sys==null)
				return  FAKE_NULL_DEV;
			if(sys.startsWith("Windows"))
				return  WINDOWS_NULL_DEV;
			return FAKE_NULL_DEV;
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String devNull=getNullDev();
			System.out.println(devNull);

}
}
	/*OUTPUT
	  NULL
	  */
