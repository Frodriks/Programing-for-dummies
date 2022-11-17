
public class Main {
	
	public String getfNameLname;
	

	public static void main(String[] args) {
		

		Person firstPlayer = new Person("Fredrik Öhlander" , "Male" , "Sweden" , 29);
		System.out.println("Name: " + firstPlayer.fNameLName);
		System.out.println("Gender: " + firstPlayer.gender);
		System.out.println("Country: " + firstPlayer.country);
		System.out.println("Age: " + firstPlayer.age);
		

	}

}
