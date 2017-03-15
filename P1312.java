import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int m = 1;
			while (m < N) {
				if (m % 7 == 0 || m % 10 == 7) {
                    cout.println(m);
				}
				m++;
			}
		}
        cin.close();
        cout.close();
	}

}
