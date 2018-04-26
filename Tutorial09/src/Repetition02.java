import java.util.Scanner;

public class Repetition02 {

	private static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		
		//task01

		int largestNum = 0;
		
		for (int i = 0; i < 10; i++){

			int input = console.nextInt();
			
			if (input > largestNum) {
				largestNum = input;
			} else if (input < 0) {
				break;
			}
		}
		
		System.out.println("Largest number is " + largestNum);
		
		//task02
		for (int i = 1; i <= 5; i++) {
	        for (int j = 5; j > i; j--) {
	            System.out.print(' ');
	        }
	        for (int k = 1; k < 2 * i; k++) {
	            System.out.print(i);
	        }
	        System.out.println();
	    }
	}
}