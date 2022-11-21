package Email;

public class Main {

	public static void main(String[] args) {
		
		student student = new student();
		
		try {
			student.setEmail("abc@gmail.com");
			System.out.println("Email is valid");
		} catch (EmailFormatException e) {
			System.out.println("Email is invalid");
		} finally {
			System.out.println("Finally");
		}

	}

}
