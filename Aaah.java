import java.util.*;

public class Aaah {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String one = scan.nextLine();
		String two = scan.nextLine();
		if (one.compareTo(two) <= 0) {
			System.out.println("go");
		}
		else {
			System.out.println("no");
		}
	}
}