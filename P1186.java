import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		 
		int n=cin.nextInt();
        while(n-->0){
        	StringBuffer s=new StringBuffer();
        	String m=cin.next();
        	//char[] a=m.toCharArray();//×Ö·û´®‰ä³É×Ö·ûÊý×é
        	for(int i=0;i<m.length();i++){
        		if(Character.isLowerCase(m.charAt(i))){
        			s.append(Character.toUpperCase(m.charAt(i)));
        		}
        		else{
        			s.append(Character.toLowerCase(m.charAt(i)));
        		}
        	}
        	cout.println(s);
        }
		cin.close();
		cout.close();
	}
	 
}
