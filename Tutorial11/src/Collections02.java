import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Collections02 {

	public static void main(String[] args) throws FileNotFoundException {

		//task01		
		ArrayList<String> strList = new ArrayList<String>();
		
		strList.add("Fred");
		strList.add(1, "Alice");
		strList.add("Bob");
		
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		System.out.println("There are " + strList.size() + " items in the list" + "\n");
		
		strList.add("Sue");
		
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		System.out.println("There are " + strList.size() + " items in the list" + "\n");
		
		strList.remove("Alice");
		strList.remove(2);
		
		//this is an example of a for each loop
		for(String str : strList) {
			System.out.println(str);
		}
		
		System.out.println("There are " + strList.size() + " items in the list" + "\n");
		
		//task02
		int[] fixedArray = new int[3];
		
		fixedArray[0] = 10;
		fixedArray[1] = 20;
		fixedArray[2] = 30;
		
		ArrayList<Integer> variableArray = new ArrayList<Integer>();
	
		for(int j = 0; j < fixedArray.length; j++) {
			variableArray.add(fixedArray[j]);
			System.out.println(variableArray.get(j));
		}
		
		System.out.println("There are " + variableArray.size() + " items in the list" + "\n");
		
		//task03
		for(Iterator<String> it = strList.iterator(); it.hasNext();) {
			
			
			
			/*if(strList.contains("Fred"))  {
				System.out.println("Fred is on the list.");
			}
			else {
				System.out.println("Fred is not on the list.");
			}*/
		}
		
		//task04
		FileReader f = new FileReader("/home/fataorgana/git/introToProgramming/Tutorial11/marks");
		Scanner s = new Scanner(f);
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		while(s.hasNextInt()) {
			marksList.add(s.nextInt());
		}
		
		s.close();
		
		int sum = 0;
		
		for(int i = 0; i < marksList.size(); i++) {
			sum += marksList.get(i);
		}
		
		int average;
		
		average = sum / marksList.size();
		
		System.out.println("The average mark of the class is " + average);
	}
}