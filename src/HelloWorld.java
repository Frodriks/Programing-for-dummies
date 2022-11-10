import java.util.Scanner;

public class HelloWorld {
	static void myMethod() { //Parameters and Arguments, single Parameter
		System.out.println("It's friday!!!!!\n");
	}
	static void yourMethod(String fname, int age) { //Parameters and Arguments, Multiple Parameters
		System.out.println(fname + " TORM" + " is " + age);
	}
	static int theirMethod(int q, int w) { //Parameters and Arguments, Return Values
		return q + w;
	}
	static void checkAge(int oldEnough) {
		if (oldEnough < 18) {
			System.out.println("Access denied!!! You're not old enough!!");
		}
		else {
			System.out.println("Access granted!! You're old enough!!");
		}
	}
	static int plusMethod(int a, int s) { //Method Overloading, int
		return a + s;
	}
	static double plusMethod(double a, double s) { //Method Overloading , double
		return a + s;
	}
	
	public static void main(String[] args) {
	/*	String namn = "";							//Funtion for writing
		Scanner inputValue = new Scanner(System.in);
		System.out.println("What's your name? ");
		namn = inputValue.nextLine();
		System.out.println("Your name is: " + namn);
	*/	
		
		myMethod();
		yourMethod("Fredrik", 29);
		yourMethod("Frida", 28);
		yourMethod("Freja", 10);
		yourMethod("Malin", 28);
		int e = theirMethod(5, 3); //Parameters and Arguments, Return Values
		System.out.println("\n" + e + "\n"); //Parameters and Arguments, Return Values
		checkAge(20);
		checkAge(17);
		int myNum1 = plusMethod(8, 5); //Method Overloading, int
		double myNum2 = plusMethod(3.33, 6.66); //Method Overloading , double
		System.out.println("\nint: " + myNum1); //Method Overloading, int
		System.out.println("double: " + myNum2); //Method Overloading , double
	
	
		
		String txt = "\nHello World!\n";
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
			String result = (randomNum > 50) ? "It's over 50!" : "It's under 50!"; //Shorter code than the one above (Short hand if else)
			System.out.println (result);
		
		int day = (int)(Math.random() *8); //+ 1; // The Math.random always starts from "0". You need to type +1; if you want it to start counting from 1
		System.out.print("\nThe day of the week is:" + " ");
		switch (day) {
		case 1:
			System.out.println("Monday!\n");
			break;
		case 2:
			System.out.println("Tuesday!\n");
			break;
		case 3:
			System.out.println("Wednesday!n");
			break;
		case 4:
			System.out.println("Thursday!n");
			break;
		case 5:
			System.out.println("Friday!\n");
			break;
		case 6:
			System.out.println("Saturday!\n");
			break;
		case 7:
			System.out.println("Sunday!\n");
			break;
		default: //If the "Math.Random" is "0", this will be printed out
			System.out.println("ORIMLIGT!\n");
		}
		
		//do-while loop
		int i = 0; //Starts counting from 0
		while (i<=5) { //Counts up top 5, then it stops
			System.out.println (i);
			i++; //Adds +1 to the counting
		}
		int o = 1; //starts counting from 1
		do {
			System.out.println(o);
			o++;
		}	
		while (o < 6); //Stops counting at 5 because it prints as long as it's less than 6
		
		//For Loop -When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
		for (int k = 0; k < 10; k = k + 2) {
			System.out.println("Yes");
			
		}
		
		//For-Each Loop - There is also a "for-each" loop, which is used exclusively to loop through elements in an array
		String[] cars = {"Volvo", "BMW", "SAAB", "Wolksvagen"};
		for (String l : cars) {
			System.out.println(l);
		}
		
		//Java Break
		for (int m = 1; m < 10; m++) {
			if (m == 5) {
				break;
			}
			System.out.println(m);
		}
		
		//Java Continue
		for (int n = 1; n <= 10; n++) {
			if (n == 5) {
				continue;
			}
			System.out.println(n);
		}
		
		//Java methods
		//int goal = sum(10); //Java Recursion
		//System.out.println(goal);
		//public static int sum(int b) {
			//if(b >0) {
				//return b + sum(b - 1);
			//}
			//else
			//return 0;
		//}
		
		
		int gammalNog = 18;
		if (gammalNog >= 18) {
			System.out.println("\nWelcome sir!\n");
		} 
			else {
				System.out.println("\nYou're not old enough\n");	
		}
		
		
		int g = 10,  h = 20;
		int j = g + h;
		System.out.println ("G is: " + g);
		System.out.println ("H is: " + h);
		System.out.println ("The total is; " + j + "\n");
		g = g ^ h ^(h = g); //Code for switching variables between "g" and "h"
		System.out.println("Now we have switched the values of 'G' and 'H'");
		System.out.println("G is: " + g);
		System.out.println("H is: " + h);
		
		int randomBRL = (int)(Math.random() *101); //Convert BRL to SEK
		System.out.println("\nIt's " + randomBRL + " Brazilian Real");
		double swedishKrona = (randomBRL * 2.64);
		System.out.println("And that's equal to " + String.format("%.2f", (swedishKrona)) + " Swedish kroner\n");
		
		int slumpa = (int)(Math.random() *4);
		int randomNumA = 100;//(int)(Math.random() *100);
		int randomNumB = 0;//(int)(Math.random() *100);
		System.out.println ("The first number is: " + randomNumA);
		System.out.println ("The second number is: " + randomNumB);
		try {  //try catch = "try" running this code and if it fails "catch" it and write a error message, then continue with the program
			switch (slumpa) {
			case 0:
				System.out.println ("The first + the second = " + (randomNumA + randomNumB));
				break;
			case 1:
				System.out.println ("The first - the second = " + (randomNumA - randomNumB));
				break;
			case 2:
				System.out.println ("The first * the second = " + (randomNumA * randomNumB));
				break;
			case 3:
				System.out.println ("The first / the second = " + (randomNumA / randomNumB));
				break;
			default:
				System.out.println("ORIMLIGT!\n");	
			}
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println("*************");
			exp.printStackTrace();
		} finally {
			System.out.println("Koden fortsätter\n");
		}
		
		//double f = 14;
		int randomC = (int)(Math.random() *31);
		double c = randomC; //Generates a random number between 0-30
		double f = c * 1.8 + 32;
		System.out.println("\nIt's " + c + " degrees Celsius outside today");
		System.out.println("And that's equal to " + f +  " degreed in Farenheit");
		
		int randomNumC =(int)(Math.random() *1001);
		double discount = 0.13;
		double total = 0.87;
		System.out.println("\nThe price before the discount was " + randomNumC);
		System.out.println("The total discount is " + String.format("%.2f", (randomNumC * discount)));
		System.out.println("The price after the discount " + String.format("%.2f", (randomNumC * total))); //String.format("%.2f") för att korta ner decimalerna

		
		
		System.out.println("\n");
		myMethod();
	}

}
