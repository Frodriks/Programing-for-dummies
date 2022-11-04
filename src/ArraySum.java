//import java.util.Scanner;
//import com.javaprogramto.programs.arrays.average;


public class ArraySum {
	static double grades[] = {2.78d , 4.21d , 7.42d};
	
	
	static double sum() {
		double sum = 0;
		int d;
		for (d = 0; d < grades.length; d++)
			sum += grades[d];
		return sum;	
	
	}
	
	
	static void air() {
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		
		double length = grades.length;
		double average = sum() / length;
		//double eachGrade = grades[0] + grades[1] + grades [2];
		System.out.println("At the first part of the test you scored: " + grades[0]);
		System.out.println("\nAt the second part of the test you scored: " + grades[1]);
		System.out.println("\nAt the third part of the test you scored: " + grades[2]);
		System.out.println("\nWich brings you to a total score of: " + sum()); //The code is at the beginning
		System.out.println("\nWith an average of: " + String.format("%.2f",(sum()/(length))));
		
		if (average >= 5) {
			System.out.println("\nYou passed!");
		} else {
			System.out.println("\nYou didn't pass! You need an average of 5 to pass.");
		}
		
		


	}

}
