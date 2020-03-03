import java.util.*;

public class QALY {
	
	public static void main(String[] args) {

		double qaly = 0;
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		double x;
		double y;

		for(int i = 0; i < t; i++) {
			x = in.nextDouble();
			y = in.nextDouble();
			qaly += x * y;
		}

		System.out.println(qaly);
	}
}