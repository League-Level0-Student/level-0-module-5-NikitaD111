
public class Fibonacci {
	public static void main(String[] args) {
		int f = 0;
		int s = 1;
		for (int i = 0; i < 12; i++) {
			int c = f + s;
			if (i % 2 == 0) {
				f = c;
			} else {
				s = c;
			}
			System.out.println(c);
		}
	}
}
