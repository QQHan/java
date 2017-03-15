import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
  
	public static void main(String[] args) {
       // double d = 0,sum=0;
        int a=cin.nextInt();
        int n=cin.nextInt();
        //for(int i=0;i<n;i++){
        //	d+=a*Math.pow(10,i);
        //	 sum+= d;
        //}
        //cout.println(sum);
        //cin.close();
        //cout.close();
        int result=0;
		StringBuffer buffer=new StringBuffer();
		for(int i=0;i<n;i++){
			result+=Integer.valueOf(buffer.append(a).toString());	
		}
		cout.println(result);
		cin.close();
		cout.close();
	}
 
}
