import java.util.Scanner;
public class StringsAndChars {

	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		//task01
		String myName = "Michael";
		System.out.println(myName.substring(2, 3) + " " + myName.substring(3, 4));
		System.out.println(myName.substring(5, 6));
		System.out.println("There are " + myName.length() + " letters in your name.");
		System.out.println(myName.toUpperCase());
		
		for(int h = 0; h < myName.length(); h++) {
			System.out.print(myName.substring(h, (h + 1)) + "    ");
		}
		
		//task02
		System.out.print("\n");
		String reverse = s.next();
		
		for(int i = (reverse.length() - 1); i >= 0; i--) {
			System.out.print(reverse.substring(i, (i + 1)));
		}
		
		//task03
		System.out.print("\nPlease enter your first name: ");
		String firstName = s.next();
		System.out.print("Please enter your last name: ");
		String lastName = s.next();
		System.out.println("Your username is " + firstName + " " + lastName);
		System.out.println("Your initials are " + firstName.substring(0, 1) + lastName.substring(0, 1));
		System.out.println("Your first name has " + firstName.length() + " characters");
		System.out.println("Your last name has " + lastName.length() + " characters");
		

		//task04		
		String sentence = "the quick brown fox jumps over the lazy dog";

		for (int j = 0; j < sentence.length(); j++) {
			if (j == 0) {
				System.out.print(sentence.substring(j, (j + 1)).toUpperCase());
			} else if (sentence.substring((j - 1), j).equals(" ")) {
				System.out.print(sentence.substring(j, (j + 1)).toUpperCase());
			} else {
				System.out.print(sentence.substring(j, (j + 1)));
			}
		}	

		//task05
		for (int k = 0; k <= sentence.indexOf("f"); k++) {
			
			if (sentence.substring(k, (k + 3)).equals("fox")) {
				System.out.print("dog");
				k += 3;
				for (int l = k; l <= sentence.indexOf("d"); l++) {
					if (sentence.substring(l, (l + 3)).equals("dog")) {
						System.out.print("fox");
					} else {
						System.out.print(sentence.substring(l, (l + 1)));
					}
				}
			} else {
				System.out.print(sentence.substring(k, (k + 1)));
			}
		}	
	
		//task06 - Caesar Cipher
		
		System.out.print("Enter your secret message: ");
		String message = s.nextLine();
		message = message.toLowerCase();
		
		System.out.print("Enter your secret key: ");
		int key = s.nextInt();
		
		char[] cArray = message.toCharArray();
		
		System.out.print("You secret code is ");
		
		for (int m = 0; m < message.length(); m++) {
			cArray[m] += key;
			System.out.print(cArray[m]);
		}
	}
}