import java.util.Scanner;
public class Calculator {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char operator;
		Double number1, number2, result;
		
		// create an object of Scanner class
		Scanner input = new Scanner (System.in); 
		
		// ask users to enter operator
		System.out.println("Choose and operator: + , - , * or /");
		operator = input.next().charAt(0);
		
		// ask users to enter numbers
		System.out.println("Enter your first number");
		number1 = input.nextDouble();
		System.out.println("Enter your second number");
		number2 = input.nextDouble();

		
		switch (operator) {
		// performs addition between numbers
			case '+':
				result = number1 + number2;
				System.out.println(number1 + " + " + number2 + " = " + result);
				break;
			case '-':
				result = number1 - number2;
				System.out.println(number1 + " - " + number2 + " = " + result);
				break;
			case '*':
				result = number1 * number2;
				System.out.println(number1 + " * " + number2 + " = " + result);
				break;
			case '/':
				result = number1 / number2;
				System.out.println(number1 + " / " + number2 + " = " + result);
				break;
				
			default:
				System.out.println("Invalid operator!");
				break;
		}
		
		input.close();

	}

}
