
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
		if (sum3 > sum1) { //Print the line below "IF" the statement is true
			System.out.println ("Sum3 is greater than Sum1!\n");
		}
		
		int randomNum = (int)(Math.random() *101); //Random number generator between 0-100
		System.out.println("Todays lottary number is:" + " " + randomNum + "\n");
			if (randomNum>50) {
				System.out.println("It's over 50");
			}
				else if(randomNum<50){
				System.out.println("It's under 50");
			}
				else {
				System.out.println("It's ORIMLIGT!");
				}
			String result = (randomNum > 50) ? "It's over 50!" : "It's under 50"; //Shorter code than the one above (Short hand if else)
			System.out.println (result);
		
		int day = (int)(Math.random() *8); //+ 1;
		switch (day) {
		case 1:
			System.out.println("Monday!");
			break;
		case 2:
			System.out.println("Tuesday!");
			break;
		case 3:
			System.out.println("Wednesday!");
			break;
		case 4:
			System.out.println("Thursday!");
			break;
		case 5:
			System.out.println("Friday!");
			break;
		case 6:
			System.out.println("Saturday!");
			break;
		case 7:
			System.out.println("Sunday!");
			break;
		default:
			System.out.println("This is ORIMLIGT!");
		}
		
	}

}
