import java.util.*;

public class MixedFractions{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			if (y == 0) {
				break;
			}
			int fullNumber = x / y;
			int mixedNumber = x % y;
			System.out.println(fullNumber + " " + mixedNumber + " / " + y);
		}
	}
}