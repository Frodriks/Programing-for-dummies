package Email;

public class student {
	private String email = "";
	
	public void setEmail(String email) throws EmailFormatException {
		if (email.indexOf('@') == -1) {
			throw new EmailFormatException("Email is missing @.");
		}
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String toString() {
		return email;
	}

}
