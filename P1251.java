import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Main {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNext()){
			Calendar calendar=Calendar.getInstance();//获取当前时间
			String[] time1=cin.next().split("\\/");
			int y=Integer.parseInt(time1[0]);
			int m=Integer.parseInt(time1[1]);
			int d=Integer.parseInt(time1[2]);
			calendar.set(y,m-1,d);
			int result=calendar.get(Calendar.DAY_OF_YEAR);
			cout.println(result);
		}
        cin.close();
        cout.close();
	}

}
