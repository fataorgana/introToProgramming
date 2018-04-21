import java.util.Scanner;

public class SelectionInJava {

	private static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//task02
		int age;
		String student = "";
		double fullRate = 10;
		double concessionRate = 5;
		
		System.out.print("Please enter you age: ");
		
		age = console.nextInt();
				
		// if the user is greater than or equal to 16
		// ask if they are a student
		if (age >= 16) {
			System.out.print("Are you a student(Y/N): ");
			
			student = console.next().toUpperCase();
		}

		// if-statement evaluates what age bracket user is in
		// to determine the price of their ticket
		if (age < 16) {
			System.out.format("Price is £%.2f", concessionRate);
		} else if (age >= 16 && age <= 64) {
			if (student.equals("Y")) {
				System.out.format("Price is £%.2f", (fullRate * 0.9));
			} else {
				System.out.format("Price is £%.2f", fullRate);
			}
		} else if (age > 64) {
			if (student.equals("Y")) {
				System.out.format("Price is £%.2f", (concessionRate * 0.8));
			} else {
				System.out.format("Price is £%.2f", concessionRate);
			}
		}		
	}
}