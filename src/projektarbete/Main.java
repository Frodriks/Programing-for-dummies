package projektarbete;
import java.util.Scanner;
public class Main {
	public static int add(int x, int y) {
		int a;
		a = x + y;
		return a;
	}
	public static int sub(int x, int y) {
		int a;
		a = x - y;
		return a;
	}
	public static int mul(int x, int y) {
		int a;
		a = x * y;
		return a;
	}
	public static int div(int x, int y) {
		int a;
		a = x / y;
		return a;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please choose an operator");
		System.out.println("**************************");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		int input = scanner.nextInt();
		
		System.out.println("Enter two numbers of your choice");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if(input == 1) {
			System.out.println("The awnser is: " + add(x,y));
		}else if(input == 2) {
			System.out.println("The awnser is: " + sub(x,y));
		}else if(input == 3) {
			System.out.println("The awnser is: " + mul(x,y));
		}else if(input == 4) {
			System.out.println("The awnser is: " + div(x,y));
		}else {
			System.out.println("Orimligt!");
		}
		
	}

}
