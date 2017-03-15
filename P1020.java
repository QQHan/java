import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


public class Main {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
    	Vector<Integer> v=new Vector<Integer>();  	
    	for(int i=0;i<10;i++){
    		v.add(cin.nextInt());
    	}
		Collections.sort(v,Collections.reverseOrder());
		for(Integer key:v){
			cout.print(key+" ");
		}
		cin.close();
		cout.close();
    }
}
