import java.util.Scanner;

public class Collections01 {
	
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		//task01
		int[] intArray = new int[5];
		
		intArray[0] = 21;
		intArray[1] = 33;
		intArray[2] = 58;
		intArray[3] = 17;
		intArray[4] = 9;
		
		intArray[1] = 3;
		
		intArray[4] = intArray[2] + intArray[3];
		
		System.out.print(intArray[1] + "\n" + intArray[2] + "\n" + intArray[4] + "\n");
		
		//task02
		String[] strArray = new String[5];
		strArray[0] = "This ";
		strArray[1] = "is ";
		strArray[2] = "a ";
		strArray[3] = "String ";
		strArray[4] = "Array";
		
		for(int i = 0; i < strArray.length; i++){
			System.out.print(strArray[i]);
		}
		
		//task03
		int[] arrayAvg = new int[6];
		
		System.out.println("\nPlease enter six values:\n");
		
		for(int k = 0; k < 6; k++){
			arrayAvg[k] = s.nextInt();
		}
		
		int sum = 0;
		
		for(int j = 0; j < arrayAvg.length; j++){
			sum += arrayAvg[j];
		}
		
		int average = (sum / arrayAvg.length);
		
		System.out.println("\nThe average is " +  average);
		
		//task04
		int lowest = arrayAvg[0];
		int highest = arrayAvg[0];
		
		System.out.print("The odd numbers are ");
		
		for(int j = 0; j < arrayAvg.length; j++){
			if (arrayAvg[j] < lowest){
				lowest = arrayAvg[j];
			}
			if (arrayAvg[j] > highest){
				highest = arrayAvg[j];
			}
			//Find the odd numbers in the array
			if (arrayAvg[j] % 2 == 1){
				System.out.print(arrayAvg[j] + " ");
			}
		}
		
		System.out.println("\nThe lowest number is " + lowest);
		System.out.println("The highest number is " + highest);
	}
}