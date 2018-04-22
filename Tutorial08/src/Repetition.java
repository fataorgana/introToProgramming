import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Repetition {

	private static Scanner console = new Scanner(System.in);
	public static void main(String[] args) throws FileNotFoundException {
		
		//task01
		int k = 9;
		int i = -6;
		
		while (i <= k) {
		 i = i + 2;
		 k = k - 1;
		 System.out.printf("i + k = %d\n", i + k);
		}
		
		//task02
		System.out.print("\nEnter number of students: ");
		
		int students = console.nextInt();
		
		PrintWriter write = new PrintWriter("marks.txt");
		FileReader file = new FileReader("marks.txt");
		Scanner read = new Scanner(file);
		
		int mark;
		int counter = 0;
		
		do {
			System.out.print("Enter mark: ");
			mark = console.nextInt();
			
			if (mark >= 0 && mark <= 100) {
				write.println(mark);
				counter++;	
			}
		} while (counter < students || mark <= 0 || mark >= 100);
		
		write.close();
		
		System.out.println("\nGrades");
		
		while (read.hasNext()) {
			int stud = read.nextInt();
			
			if (stud >= 70) {
				System.out.println("A");
			} else if (stud >= 60 && stud < 70) {
				System.out.println("B");
			} else if (stud >= 50 && stud < 60) {
				System.out.println("C");
			} else {
				System.out.println("D");
			}
		}
		
		read.close();
		
		//task03
		int y = 0;
		
		System.out.print("\nTo find largest factor, please enter number: ");
		
		y = console.nextInt();
		int z = 0;
		
		for (int x = 2; x < y ; x++){
			
			if (y % x == 0) {
				System.out.print(x + " and ");
				System.out.print(y / x + "\n");
			}
			
			if (x > (y / x)) {
				break;
			}
		}
	}
}