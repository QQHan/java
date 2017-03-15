import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static boolean judge(int n, int min, int max) {
		return Math.max(min, n) == Math.min(n, max);
	}

	public static void main(String[] args) {
        while(cin.hasNext()){
        	int n=cin.nextInt();
        	if(judge(n,90,100))
        		cout.println("A");
        	else if(judge(n,80,89))
        		cout.println("B");
        	else if(judge(n,70,79))
        		cout.println("C");
        	else if(judge(n,60,69))
        		cout.println("D");
        	else if(judge(n,0,59))
        		cout.println("E");
        	else
        		cout.println("Score is error!");
        }
        cin.close();
        cout.close();
	}
}
