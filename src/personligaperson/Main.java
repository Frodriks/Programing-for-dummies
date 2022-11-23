package personligaperson;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person firstPlayer = new Person("Fredrik Öhlander" , "Male" , "Sweden" , 29);
		System.out.println("The first player:");
		System.out.println("Name: " + firstPlayer.getfNameLName());
		System.out.println("Gender: " + firstPlayer.getgender());
		System.out.println("Country: " + firstPlayer.getcountry());
		System.out.println("Age: " + firstPlayer.getage());
		
		firstPlayer.setfNameLName("dsfsd");
		
		
		Person secondPlayer = new Person("Frida Ryrholm" , "Female" , "Sweden" , 28);
		System.out.println("\nThe second player:");
		System.out.println("Name: " + secondPlayer.getfNameLName());
		System.out.println("Gender: " + secondPlayer.getgender());
		System.out.println("Country: " + secondPlayer.getcountry());
		System.out.println("Age: " + secondPlayer.getage());

	}

}
