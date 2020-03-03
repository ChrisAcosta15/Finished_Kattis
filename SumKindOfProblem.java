import java.util.*;

public class SumKindOfProblem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int dataSets = scan.nextInt();
		for (int i = 1; i <= dataSets; i++) {
			int dataSetNumber = scan.nextInt();
			int importantInteger = scan.nextInt();
			//Add all numbers before
			int sumOne = 0;
			//add N amount of odd integers
			int sumTwo = 0;
			//add N amount of even integers
			int sumThree = 0;
			int oddInteger = 1;
			int evenInteger = 2;

			for (int j = importantInteger; j > 0; j--) {
				sumOne += j;
			}
			for (int k = 1; k <= importantInteger * 2; k++) {
				if (k % 2 == 1) {
					sumTwo += oddInteger;
					oddInteger += 2;
				}
				else {
					sumThree += evenInteger;
					evenInteger += 2;
				}
			}
			System.out.println(dataSetNumber + " " + sumOne + " " + sumTwo + " " + sumThree);
		}
	}
}