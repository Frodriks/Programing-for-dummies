package tryCatch;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		while (true) {
		    System.out.println("Exit? (y exits)");
		    String input = scanner.nextLine();
		    if (input.equals("y")) {
		        break;
		    }

		    System.out.println("Ok! Let's carry on!");
		}

		System.out.println("Ready!");
		System.out.print("hhk");
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.print("hejeh");
	}
}
