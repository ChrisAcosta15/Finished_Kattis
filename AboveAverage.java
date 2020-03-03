import java.util.*;
import java.text.DecimalFormat;

public class AboveAverage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		DecimalFormat df = new DecimalFormat("#00.000%");
		int dataSets = scan.nextInt();
		for (int i = 1; i <= dataSets; i++) {
			int students = scan.nextInt();
			double doubleStudents = students;
			double average = 0;
			double[] grades = new double[students];
			for (int j = 0; j < students; j++) {
				grades[j] = scan.nextInt();
				average += grades[j];
			}
			average = average / doubleStudents;
			int fakeAboveAverage = 0;
			for (int k = 0; k < students; k++) {
				if(grades[k] > average) {
					fakeAboveAverage++;
				}
			}
			System.out.printf("%.3f%s \n",(double)fakeAboveAverage/doubleStudents*100,"%");
		}
		
	}
}