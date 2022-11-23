package personligaperson;

public class Person {
	
	static void air() {
		System.out.println(" ");
	}
	
	private String fNameLName;
	private String gender;
	private String country;
	private int age;
	
	public Person(String inputName, String inputGender, String inputCountry, int inputAge) {
		this.fNameLName = inputName;
		this.gender = inputGender;
		this.country = inputCountry;
		this.age = inputAge;
	}
	
	public String getfNameLName() {
		return fNameLName;
	}
	public String getgender() {
		return gender;
	}
	public String getcountry() {
		return country;
	}
	
	public int getage() {
		return age;
	}
	
	public void setfNameLName(String fNameLName) {
		this.fNameLName = fNameLName;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	public void setcountry(String country) {
		this.country = country;
	}
	public void setage(int age) {
		this.age = age;
	}

}
