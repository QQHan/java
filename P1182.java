import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
        while(cin.hasNext()){
        	String n=Integer.toBinaryString(Integer.valueOf(cin.next(), 16));
        	cout.println(n);
        }
		cin.close();
		cout.close();
	}
}
