
public class HelloWorld {

	public static void main(String[] args) {
		String txt = "Hello World!\n";
		System.out.println(txt.toUpperCase()); // Hallå eller!
		// System.out.println("So you're " + age + " years old");
		
		String firstName = "Fredrik" + " ";
		String lastName = "Ohlander";
		String fullName = firstName + lastName;
		System.out.println (fullName);
		System.out.println ("The position of \"F\" in \"Firstname\" is:"+ " " + fullName.indexOf("F")); //Position of letter
		System.out.println ("The position of \"O\" in \"Lastname\" is:" + " " + fullName.indexOf("O")); //Position of letter
		System.out.println ("The length of \"Fullname\" is:" + " " + fullName.length()); //Length of text
		
		int x = 15;
		int y = 14;
		int z = x + y;
		System.out.println("My age is" + " " + z);
		
		int sum1 = 50 + 50;
		int sum2 = sum1 + 100;
		int sum3 = sum2 + sum2;
		System.out.println ("\n" + sum1);
		System.out.println (sum2);
		System.out.println (sum3 + "\n");
		
		int randomNum = (int)(Math.random() *101); //Random number generator between 0-100
		System.out.println("Todays lottary number is:" + " " + randomNum + "\n");
		
		if (x > y) { //Print the line below "IF" the statement is true
			System.out.println ("X is greater than Y!");
		}
	}

}
