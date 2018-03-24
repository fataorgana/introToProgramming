
public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int integer1;
		int integer2;
		int sum;
		int subtraction;
		int multiplication;
		int division;

		integer1 = 10;
		integer2 = 20;
		sum = integer1 + integer2;
		System.out.println("The sum value is: " + sum);
		
		subtraction = integer1 - integer2;
		System.out.println("The subtraction is: " + subtraction);
		
		multiplication = integer1 * integer2;
		System.out.println("The multiplication is: " + multiplication);
		
		//The answer is 0.5 - due to implicit type coercion
		//the value is trimmed to become an integer
		division = integer1 / integer2;
		System.out.println("The division is: " + division);
		
		double division2;
		division2 = (double)integer1 / (double)integer2;
		
		//Use casting above to store true result
		System.out.println("The division really is: " + division2);
		
	}

}
