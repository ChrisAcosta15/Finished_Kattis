import java.util.*;

public class ColdputerScience {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		int count = 0;

		for(int i = 0; i < num; i++) {
			int temp = scan.nextInt();

			if(temp < 0) {
				count++;
			}
		}




		System.out.println(count);
	}
}