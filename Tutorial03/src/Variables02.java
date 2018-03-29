public class Variables02 {

	public static void main(String[] args) {
		
		//Task01
		int num1, num2, sum;
				
		num1 = 25;
		num2 = 8;
				
		num1 += 5;
			
		sum = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
				
		int num3, prod;
				
		num3 = 2;
		
		prod = sum * num3;
				
		System.out.println(num3 + " x " + sum + " = " + prod);
				
		//Task02
		int acre = 43560;
		int tract = 389767;
				
		int numOfAcres = tract / acre;
				
		System.out.println("389,767 square feet is the equivalent to " + numOfAcres + " acres");
			
		double length = 25.7;
		double width = 18.5;
				
		double area = length * width;
				
		System.out.println("The area of the rectangle is " + area +" square centimetres");
				
		double fencePosts = 3.45;
		int numOfPosts = 15;
				
		double lengthOfWire = fencePosts * numOfPosts;
				
		System.out.println("The length of wire required is " + lengthOfWire);
			
		final int NO_OF_STUDENTS = 5;
				
		int stud1, stud2, stud3, stud4, stud5;
				
		stud1 = 40;
		stud2 = 66;
		stud3 = 32;
		stud4 = 56;
		stud5 = 80;
				
		int average = (stud1 + stud2 + stud3 + stud4 + stud5) / NO_OF_STUDENTS;
				
		System.out.println("The average mark is " + average +"%");
			
	}
}