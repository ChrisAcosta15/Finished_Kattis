import java.util.*;

public class ReachableRoads {
	static int[] graph;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		//Each test case
		for (int z = 0; z < testCases; z++) {
			int cities = in.nextInt();
			int roads = in.nextInt();
			graph = new int[cities];
			// Initiating Union find
			for (int j = 0; j < cities; j++) {
				graph[j] = j;
			}
			//Get the input
			for (int i = 0; i < roads; i++) {
				int a = in.nextInt();
				int b = in.nextInt();
				union(a, b);
			}
			//Number of disjoin sets minus 1 = the total number of roads needed
			//# of disjoint sets is equal to the amount of representative elements.
			HashSet<Integer> uniqueParents = new HashSet<Integer>();
			for (int k = 0; k < cities; k++) {
				uniqueParents.add(find(k));

			}
			System.out.println(uniqueParents.size() - 1);
		}
	}

	static int find(int index) {
		if (graph[index] == index) {
			return index;
		}
		graph[index] = find(graph[index]);
		return graph[index];
	}

	static void union(int a, int b) {
		int aParent = find(a);
		int bParent = find(b);
		if (aParent > bParent) {
			graph[aParent] = bParent;
		}
		else {
			graph[bParent] = aParent;
		}
	}
}