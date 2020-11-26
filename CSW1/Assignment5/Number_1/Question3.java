package package_2;
import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader f=new FileReader("C:\\Users\\Hp\\Desktop\\1941012818\\Assignment5\\src\\package_2\\Stock");
		BufferedReader br=new BufferedReader(f);
		Pattern p = Pattern.compile("\\d+");
		 String line;
		 double sum=0.0;
	        while((line= br.readLine())!=null){
	        	Matcher m=p.matcher(line);
	        	int c=0;
	        	int i=0;
	        	double d=0;
			       while(m.find()) {
			    	   if(++c==2) {
			    		  d=Double.parseDouble(m.group());
			    	   }
			    	   if(++i==3) {
			    		   double d1=Double.parseDouble(m.group());
			    		   double d2=d*d1;
			    		   sum+=d2;
			           }}}
				 System.out.println(sum);
}}