package tutorial04;
import java.util.*;

public class BasicInputOutput {
	
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		
		//task 1
		
		double pounds;
		double shillings;
		double pence;
		
		System.out.println("Please enter pounds: ");
		pounds = console.nextInt();
		System.out.println("Please enter shillings: ");
		shillings = console.nextInt();
		System.out.println("Please enter pence: ");
		pence = console.nextInt();
		
		System.out.format("\n£%.0f %.0fs %.0fd converts to ", pounds, shillings, pence);
		
		pounds = (pounds * 240);
		shillings = (shillings * 5);
		pence = (pence / 2.4);
		
		double UKpence = (pounds + shillings + pence);
		double UKpounds = (UKpence / 100);
		
		System.out.format("£%.2f", UKpounds);
		
	}
}