import java.util.Scanner;


public class LoopsAndOneDimensionalArrays {
	
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
		
		int d = 1; //14 EJ KLAR!!!
		do {
			System.out.println(Math.sqrt(d));
			k++;	
		} while (d <=10);
		
	}

}
