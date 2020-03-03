import java.util.*;

public class BlackFriday{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int largest = 0;
		int ans = 0;

		HashMap<Integer, Integer> unique = new HashMap<>();
		HashSet<Integer> visited = new HashSet<>();

		int total = scan.nextInt();
		for(int i = 0; i < total; i++){
			int current = scan.nextInt();
			if(!visited.contains(current)){
				unique.put(current, i);
			}
			else {
				unique.remove(current);
			}
			visited.add(current);
		}

		for (int key : unique.keySet()) {
			if(key > largest) {
				largest = key;
				ans = unique.get(key);
			}
		}
		if(largest == 0) {
			System.out.println("none");
		}
		else {
			System.out.println(ans + 1);
		}
	}
}