import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	static class Pipe implements Comparable<Pipe> {
		int length;
		int diameter;
		int number;

		public int compareTo(Pipe that) {
			if (this.length != that.length)
				return this.length - that.length;
			if (this.diameter != that.diameter)
				return that.diameter - this.diameter;
			return this.number - that.number;
		}
	}

	public static void main(String[] args) {
		int n = cin.nextInt();
		while (n-- > 0) {
			Pipe[] pipes = new Pipe[cin.nextInt()];
			for (int i = 0; i < pipes.length; i++) {
				pipes[i] = new Pipe();
				pipes[i].length = cin.nextInt();
				pipes[i].diameter = cin.nextInt();
				pipes[i].number = cin.nextInt();
			}
			Arrays.sort(pipes);
			cout.println(pipes[pipes.length - 1].number);
		}

		cin.close();
		cout.close();
	}
}
