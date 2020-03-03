import java.util.*;

public class IslandHopping {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//All the inputs
		int testCases = scan.nextInt();
		for (int q = 0; q < testCases; q++) {
			int islandCount = scan.nextInt();
			Island[] islands = new Island[islandCount];
			//get the islands
			for (int i = 0; i < islandCount; i++) {
				double x = scan.nextDouble();
				double y = scan.nextDouble();
				islands[i] = new Island(x,y);
			}
			//making the neighbors for the islands
			
			//Do Prims
			double[] distances = new double[islandCount];
			for (int f = 1; f < islandCount; f++) {
				distances[f] = Integer.MAX_VALUE;
			}
			HashSet<Integer> visitedSet = new HashSet<Integer>();
			int currentIndex = 0;
			int count = 1;
			double total = 0;
			while (count < islandCount) {
				visitedSet.add(currentIndex);
				Island currentIsland = islands[currentIndex];
				for (int d = 0; d < islandCount; d++) {
					if (d == currentIndex) {
						continue;
					}
					Island otherIslands = islands[d];
					double newDistance = getDistance(currentIsland, otherIslands);
					if (newDistance < distances[d]) {
						distances[d] = newDistance;
					}
				}
				int nextIsland = 0;
				double bestDistance = Integer.MAX_VALUE;
				for (int l = 0; l < islandCount; l++) {
					if (visitedSet.contains(l)) {
						continue;
					}
					//finding the next island
					if (distances[l] < bestDistance) {
						bestDistance = distances[l];
						nextIsland = l;
					}
				}
				//updates the current
				count++;
				total += Math.sqrt(bestDistance);
				currentIndex = nextIsland;
				
			}
			System.out.println(total);
		}
	}
		public static double getDistance(Island a, Island b) {
			double dist = (a.x-b.x) * (a.x-b.x) + (a.y-b.y) * (a.y-b.y);
			return dist;
		}
		public static class Island {
			double x;
			double y;
			boolean visited;
			ArrayList<Island> neighbors;

			public Island(double a, double b) {
				this.x = a;
				this.y = b;
				visited = false;
			} 

			public int compareTo(Island other) {
				return 0;
			}
		}
	}