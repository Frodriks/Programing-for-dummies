import java.util.Scanner;
import java.util.InputMismatchException;
public class Calculator {
	
	/*		Flush metod
	 * 		System.out.print("\033[H\033[2J");
	 *		System.out.flush();
	 *		Hur får jag den att fungera???
	 *
	 *		Hur gör jag för att köra om koden från början???
	 */
	
	
	public static void main(String[] args) {
		
		boolean a = true;
		char operators;
		Double firstNumber, secondNumber, answer;
		
		/* Något blev tokigt :S
		 * 
		 * Choose an operator: + , - , * , /
		 * ++o0i
		 * Enter your first number
		 * ++
		 * Något gick fel, prova skriv en siffra
		 * Enter your first number
		 * 0909090909
		 * Enter your second number
		 * -9898
		 * Here's the awnser to your equation
		 * 9.09090909E8 + -9898.0 = 9.09081011E8
		 */
		
		
		while(true) {
			try {
			break;	
			}catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("*************");
				e.printStackTrace();
			}
			
		}
		
		//operators = getOperator();
		// firstNumber = getFirstNumber();
		//secondNumber = getSecondNumber();
		//calculateAnswerAndPrint(operators, firstNumber, secondNumber);
		//
		//Gör metoder av allt och kalla på dom i en Mainklass
		//gör en while(true) på alla metoder i Mainklassen (ex. tryck 1 för att avsluta, tryck 2 för att kör igen)
	
		
		// ask users to enter operator
		while(true) {
			try {
				Scanner input = new Scanner (System.in); 
				System.out.println("Choose an operator: + , - , * , /");
				operators = input.next().charAt(0); 	//det är bara den första som är viktig. Funkar att skriva ex. +hflsdhfs4832, och då blir det +
														//Hur gör jag för att den bara godkänner om det är en operator??
				
				if(operators == '+' || operators == '-'  || operators == '*' || operators == '/'){
					//return operators;
					a = false;
					break;
				}
				/*if(operators == '-') {
					a = false;
					break;
				}
				if(operators == '*') {
					a = false;
					break;
				}
				if(operators == '/') {
					a = false;
					break;
				}
				*/
				else {
					System.out.println("Invalid operator");
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("*************");
				e.printStackTrace();
			}
			
		}
		

		
		// ask users to enter numbers
		while(true) {
			try {
			Scanner input = new Scanner (System.in); 
			System.out.println("Enter your first number");
			firstNumber = input.nextDouble();
			a = false;
			break;
			} catch(InputMismatchException e) {
				System.out.println("Något gick fel, prova skriv en siffra");
			}
		}
		
		while(true) {
			try {
			Scanner input = new Scanner (System.in); 
			System.out.println("Enter your second number");
			secondNumber = input.nextDouble();
			a = false;
			break;
			} catch(InputMismatchException e) {
				System.out.println("Något gick fel, prova skriv en siffra");
			}
		}
		
		System.out.println("Here's the awnser to your equation");
		
		try {
			switch (operators) {
		// performs addition between numbers
				case '+':
					answer = firstNumber + secondNumber;
					System.out.println(firstNumber + " + " + secondNumber + " = " + answer);
					break;
				case '-':
					answer = firstNumber - secondNumber;
					System.out.println(firstNumber + " - " + secondNumber + " = " + answer);
					break;
				case '*':
					answer = firstNumber * secondNumber;
					System.out.println(firstNumber + " * " + secondNumber + " = " + answer);
					break;
				case '/':
					answer = firstNumber / secondNumber;
					System.out.println(firstNumber + " / " + secondNumber + " = " + answer);
					break;	
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("*************");
			e.printStackTrace();
		} 
		
		
		
		
	}
	
	/*public static char getOperator() {
		
	}
	*/	

}


