

public class Main {
	

	

	public static void main(String[] args) {
		

		Person firstPlayer = new Person("Fredrik Öhlander" , "Male" , "Sweden" , 29);
		System.out.println("The first player:");
		System.out.println("Name: " + firstPlayer.fNameLName);
		System.out.println("Gender: " + firstPlayer.gender);
		System.out.println("Country: " + firstPlayer.country);
		System.out.println("Age: " + firstPlayer.age);
		
		Person secondPlayer = new Person("Frida Ryrholm" , "Female" , "Sweden" , 28);
		System.out.println("\nThe second player:");
		System.out.println("Name: " + secondPlayer.fNameLName);
		System.out.println("Gender: " + secondPlayer.gender);
		System.out.println("Country: " + secondPlayer.country);
		System.out.println("Age: " + secondPlayer.age);
		

	}

}
