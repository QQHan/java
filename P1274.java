
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	
	public static  String reverse(String s){
		int len=s.length();
		String reverse=" ";
		for(int i=0;i<len;i++){
			reverse=s.charAt(i)+reverse;//��ǰ����ĸ+֮ǰ���ַ���
		}
		return reverse;
	}
	public static void main(String[] args) {
		String s=cin.next();
		//cout.println(new StringBuffer(cin.next()).reverse().toString());
		//ʹ��reverse()��������(new StringBuffer())�������
		cout.print(reverse(s));
        cin.close();
        cout.close();
	}

}

 
