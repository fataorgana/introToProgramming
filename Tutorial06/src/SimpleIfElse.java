import java.util.Scanner;

public class SimpleIfElse {

	public static void main(String[] args) {
		
		
		//task01
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter you age: ");
		int age = s.nextInt();		
		
		if (age >= 18) {
			System.out.println("You are eligible to vote in the next election :)");
			if (age >= 18 && age <= 21) {
				System.out.println("You are in age bracket 18 -21.");
			}
		}
		else {
			System.out.println("You are not eligible to vote in the next election :(");
		}
		
		//task02
		System.out.print("How many students are in the class: ");
		int numOfStudents = s.nextInt();
		int numOfTablets = 1;
		
		if (numOfStudents <= 40) {
			System.out.println(Statement(numOfStudents, numOfTablets));
		}
		else if (numOfStudents >= 40 && numOfStudents < 70) {
			System.out.print(Statement(numOfStudents, (numOfTablets += 1)));
		}
		else {
			System.out.print(Statement(numOfStudents, (numOfTablets += 2)));
		}
		
		
		//Task03
		int seated;
		int wheelchair;
		int standing;
		
		System.out.print("Enter the number of seated passengers: ");
		seated = s.nextInt();
		System.out.print("Enter the number of wheelchair passengers: ");
		wheelchair = s.nextInt();
		System.out.print("Enter the number of standing passengers: ");
		standing = s.nextInt();
		
		if (seated >= 60 && wheelchair >= 2 && standing >= 15) {
			System.out.println("The bus is full!");
		}
		else if (seated >= 60 && wheelchair >= 0 && standing >= 17) {
			System.out.println("The bus is full!");
		}
		else {
			System.out.println("There is free space on the bus :)");
		}
		
		s.close();
		
	}
	
	public static String Statement(int x, int y){
		String response = "There are a total of " + x + " students in the class.\n"
						+ "You will need " + y + " tablets for the e-register";
		
		return response;
	}
}