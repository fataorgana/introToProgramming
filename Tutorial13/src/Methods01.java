import java.util.Scanner;

public class Methods01 {
	
	public static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		//task01		
		/*
		tripleHello();
		
		//task02
		System.out.print("Enter your name: ");
		String name = console.next();
		helloName(name);		
		
		//task03
		System.out.println("Enter number one: ");
		int num1 = console.nextInt();
		System.out.println("Enter number two: ");
		int num2 = console.nextInt();
		
		numCompare(num1, num2);
		
		*/
		
		//task04
		System.out.println("DD:MM:YY");
		System.out.print("Enter event name: ");
		String event = console.nextLine();
		
		int day;
		int month;
		int monthType = 0;
		
		do {
			System.out.print("Enter day: ");
			day = console.nextInt();
			
			System.out.print("Enter month: ");
			month = console.nextInt();
			
			switch (month) {
			case 1:
				monthType = 31;
				break;
			case 2:
				monthType = 28;
				break;
			case 3:
				monthType = 31;
				break;
			case 4:
				monthType = 30;
				break;
			case 5:
				monthType = 31;
			case 6:
				monthType = 30;
				break;
			case 7:
				monthType = 31;
				break;
			case 8:
				monthType = 31;
				break;
			case 9:
				monthType = 30;
				break;
			case 10:
				monthType = 31;
				break;
			case 11:
				monthType = 30;
				break;
			case 12:
				monthType = 31;
				break;
			}
		} while ((day <= 0 || day > monthType));
			
		System.out.print("Enter year: ");
		int year = console.nextInt();
		
		diaryReminder(event, day, month, year);
		
	}
	
	public static void sayHello() {
		System.out.println("Hello there!");
	}
	
	public static void tripleHello() {
		for (int i = 0; i < 3; i++) {
			sayHello();
		}	
	}
	
	public static void helloName(String yourName) {
		System.out.print("Hello " + yourName);
	}
	
	public static void numCompare(int num1, int num2) {
		if (num1 > num2) {
			System.out.print(num1 + " is bigger than " + num2);
		} else if (num2 > num1) {
			System.out.print(num2 + " is bigger than " + num1);
		} else {
			System.out.print("Neither are bigger");
		}
		
	}
	
	public static void diaryReminder(String event, int day, int month, int year) {
		System.out.print(event + " @ " + day + ":" + month + ":" + year);
	}
}