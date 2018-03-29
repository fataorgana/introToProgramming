package tutorial04;
import java.util.*;

public class HotelDesk {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		
		int roomNum;
		double roomPrice;
		
		System.out.println("What is your hotel number: ");
		roomNum = console.nextInt();
		System.out.println("Room price: ");
		roomPrice = console.nextDouble();
		
		System.out.printf("Room %03d costs £%.2f", roomNum, roomPrice);
		
	}
}