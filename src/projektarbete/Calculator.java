package projektarbete;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class Calculator {
	/*
	 * Flush metod, men hur ska jag få den att funka.... : 
	 * System.out.flush();
	 */

	public static void main(String[] args) {
		boolean b;
		double nummer1, nummer2, resultat;
		//Scanner siffror = new Scanner(System.in);
		
		while (true) {
			try {
				Scanner siffror = new Scanner(System.in);
				System.out.println("Skriv in ett tal");
				nummer1 = siffror.nextDouble();
				b = false;
				//siffror.close();
				break;
				
				
			}catch (InputMismatchException e) {
				System.out.println("Något gick fel, prova skriv en siffra");
				System.out.flush();
			}
		}
		
		while (true) {
			try {
				Scanner siffror = new Scanner(System.in);
				System.out.println("Skriv in ett tal");
				nummer2 = siffror.nextDouble();
				b = false;
				//siffror.close();
				break;
				
				
			}catch (InputMismatchException e) {
				System.out.println("Något gick fel, prova skriv en siffra");
				System.out.flush();
			}
			
		}
		
	}

}
