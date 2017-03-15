import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n=cin.nextInt();
		if(n%2==0){
			cout.print("yes");
		}
		else{
			cout.print("no");
		}
        cin.close();
        cout.close();
	}

}
