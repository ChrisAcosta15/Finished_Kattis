import java.util.*;

public class HappyPrime {
	static final int MAX = 10001;
	static boolean[] sieve = new boolean[MAX];

	public static void main(String[] args){
		makeSieve();
		Scanner in = new Scanner(System.in);

		int numberOfThings = in.nextInt();
		for (int i = 0; i < numberOfThings; i++){
			in.nextInt();
			int num = in.nextInt();

			//check if the gucci is prime
			if (sieve[num] && isHappy(num, new HashSet<Integer>())) {
				System.out.println((i + 1) + " " + num + " YES");
			}
			else {
				System.out.println((i + 1) + " " + num + " NO");
			}

			//check if the prime is happy unlike me

		}

	}
	//what is a happy how does one feel happy i cant even belive in the concept of happy
	public static boolean isHappy(int num, HashSet<Integer> seen) {
		int total = 0;


		while(num != 0) {
			int digit = num % 10;
			total += digit * digit;
			num /= 10;
		}

		if (total == 1) {
			return true;
		}

		if (seen.contains(total)) {
			return false;
		}
		seen.add(total);
		return isHappy(total, seen);
	}

	public static void makeSieve() {
		Arrays.fill(sieve, true);

		sieve[0] = false;
		sieve[1] = false;

		for (int i = 2; i < MAX; i++) {
			if (!sieve[i]) {
				continue;
			}
			// Coding
			for (int j = i*i; j<MAX; j += i) {
				sieve[j] = false;
			}
		}
	}


}