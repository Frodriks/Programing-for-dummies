import java.util.Scanner;

public class enterName {
	
	static void air() {
		System.out.println(" ");
	}

	public static void main(String[] args) {
		
		String name = "";
		Scanner inputValue = new Scanner(System.in);
		System.out.println("What's your name? ");
		name = inputValue.nextLine();
		System.out.println("The length of your name is: " + name.length());

		air();
		
		String str1 = "Hello";
		String str2 = "hello";
		System.out.println(str1 + " " + str2);
		if (str1 == str2 ){ // Check if the names are equal
			System.out.println("It's the same"); //True
		}else {
				System.out.println("It's not the same"); //False
		}
		
		air();
		
		String str3 = "Hello!";
		String str4 = "hello!";
		System.out.println(str3 + " "+ str4);
		System.out.println("Ignore upper-/lowercase and check if str3 = str4? \n" + str3.equalsIgnoreCase(str4)); //Checks if str3 and str4 is the same + Ignore upper-/lower-case
		
		air();
		
		String namn = "rafael";
		
		System.out.println(namn.endsWith("fael")); //Checks if "String namn" ends with fael
		System.out.println(namn.startsWith("Rafa")); //Checks if "String namn" starts with Rafa
		
		
	}

}
