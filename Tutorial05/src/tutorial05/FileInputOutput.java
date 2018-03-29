package tutorial05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInputOutput {

	public static void main(String[] args) 
		throws FileNotFoundException {
		
		//task01
		PrintWriter write = new PrintWriter("test1.txt");
		write.println("Hello, file! Welcome to 4100COMP");
		write.close();
		
		//task02
		FileReader file = new FileReader("C:\\Users\\Michael Burns\\workspace\\Tutorial05\\Car");
		Scanner read = new Scanner(file);
		
		String name = read.next();
		String name2 = read.next();
		double economy = read.nextDouble();
		double capacity = read.nextDouble();
		double cost = read.nextDouble();
		
		read.close();
		
		System.out.format("Vehicle %s %s holds %.2f litres of fuel at a cost of %.1fp/litre", name, name2, capacity, cost);
		System.out.format("\nOn average it returns %.1f mpg.", economy);
		
		//task3
		
		//There are 4.54609 litres in an imperial gallon
		//how many miles can it go, capacity and average mile per litre
		
		double costToFill = (capacity * cost);
		costToFill = (costToFill / 100);
		double economyInLitres = (economy / 4.54609);
		double range = (economyInLitres * capacity);
		
		System.out.format("\nIt will cost £%.2f to fuel the vehicle at the specified rates.", costToFill);
		System.out.format("\nOn average this will give the vehicle a range of %.2f miles.", range);
		
		if (economy > 50) {
			System.out.println("\nThank you for choosing a fuel efficient car.");
		}
		else if (economy < 35) {
			System.out.println("\nPlease consider a more fuel efficient car");
		}
	}

}