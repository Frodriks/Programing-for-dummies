import java.util.Scanner;
//import com.javaprogramto.programs.arrays.average;

public class LoopsAndOneDimensionalArrays {
	
	static double grades[] = {2.78d , 4.21d , 7.42d};
	//int length = grades.length;
	
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
		
		for (int i = 0; i <= 20; i++) { 				// For-loop + if-else statement	
			if (i % 2 == 0) { 							//checking if it can be divided by 2
				System.out.println(i + " It's even!"); 	//(true)
			} else {
			System.out.println(i + " It's uneven!"); 	//(false)
			} 		
		}
		
		
		air();
		
		int j = 0; // While-Loop
		while (j <=20) {
			if (j % 2 == 0) {
				System.out.println(j + " It's even!");
			} else {
				System.out.println(j + " It's uneven");
			}j++;
		}

		air();
		
		int k = 0; // Do-While-Loop
		do {
			if (k % 2 == 0) {
				System.out.println(k + " It's even!");
			}else {
				System.out.println(k + " It's uneven!");
			}k++;
		}	while (k <= 20);
		
		air();
		
		for (int a = 0; a <= 10; a++) 
			System.out.print(a * 9 + " ");
		
		air();
		air();
		
		for (int b = 0; b <= 50; b++) {	
			if (b % 7 ==0) {
				System.out.print(b + " ");
			}	
		}
		
		air();
		air();
		
		for (int c = 0; c <=50; c++) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
		}
		
		air();
		air();
		
		int d = 1;
		do {
			if (d % 2 == 0) {	
			} else {
				System.out.print(d * d + " ");
			} d++;		
		} while (d <= 10);
		
		air();
		air();
		
		String[] anArray;
		anArray = new String [5];
		anArray[0] = "Fredrik";
		anArray[1] = "Frida";
		anArray[2] = "Freja";
		anArray[3] = "Melker";
		anArray[4] = "Muskot";
		System.out.println("Element at index 0 = " + anArray[0]);
		//System.out.println("Element at index 1 = " + anArray[1]);
		//System.out.println("Element at index 2 = " + anArray[2]);
		//System.out.println("Element at index 3 = " + anArray[3]);
		//System.out.println("Element at index 4 = " + anArray[4]);
		
		air();
		
		String[] names = {
				"Fredrik ", "Frida ", "Freja ", "Muskot ", "Melker"
		}; 
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
		}
		
		air();
		air();
		
	
		
		/*
		double[][] grades = { //16, EJ KLAR!	
				{2.78d , 4.21d , 7.42d}//,
				//{9.99d , 10.00d , 0.37d} 
		};  
		double length = grades.length;
		//double sum = grades;
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			for (int o = 0; o < grades[i].length; o++) {
				//sum+= grades[i][j];
				System.out.println(grades[i][o]);
				
			}
		}
		double average = sum / length; //delas bara med 3
		System.out.println("Average is: " + average);
	*/
		
		
	}

}
