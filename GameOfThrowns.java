import java.util.*;

public class GameOfThrowns {
	
	public static void main(String[] args) {
		int children;
		int throwCount;
		int position;
		Scanner scan = new Scanner(System.in);

		children = scan.nextInt();
		throwCount = scan.nextInt();
		scan.nextLine();
		Stack<Integer> past = new Stack<Integer>();
		position = 0;

		for (int i = 0; i < throwCount; i++) {
			String instruction = scan.next();
			if (instruction.equals("undo")) {
				int undos = scan.nextInt();
				for (int j = 0; j < undos; j++ ) {
					int last = past.pop() * -1;
					position += last;
					while(position < 0) {
						position += children;
					}
					position = position % children;
				}
			} else {
				int next = Integer.parseInt(instruction);
				position += next;
				past.push(next);
				while(position < 0) {
					position += children;
				}
				position = position % children;
			}
		}
		System.out.println(position);
	}
}